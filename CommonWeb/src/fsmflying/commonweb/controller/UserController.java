package fsmflying.commonweb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import com.fsmflying.helpers.Helper;
import com.fsmflying.spring.auth.Auth;
import com.fsmflying.spring.auth.AuthHelper;
import com.fsmflying.spring.auth.AuthInterceptor;
import com.fsmflying.sys.dm.SysFuncPoint;
import com.fsmflying.sys.dm.SysUser;
import com.fsmflying.sys.dm.helper.LoginResult;
import com.fsmflying.sys.dm.helper.User;
import com.fsmflying.sys.service.SystemManageService;

import fsmflying.CacheHelper;
import fsmflying.commonweb.JsonHttpResult;

//@Controller
@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	SystemManageService systemManageService;

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public LoginResult login(HttpServletRequest request, HttpSession session, String username, String password) {
		System.out.println("username=" + username);
		System.out.println("password=" + password);

		LoginResult loginResult = new LoginResult();
		int userId = AuthHelper.getUserId(request);
		if (userId != -1) {
			loginResult.setResult(-2);
			loginResult.setMessage("用户登录成功！");
			loginResult.setUser(AuthHelper.getUser(request));
			
			loginResult.setRedirectUrl(request.getRequestURI().toString());
			return loginResult;
		}

		SysUser sysUser = systemManageService.getModelOfSysUser(username, true);

		
		if (sysUser != null) {

			if (sysUser.getStatus() == 1) {
				loginResult.setResult(0);
				loginResult.setMessage("用户被永久禁用！");
				return loginResult;
			} else if (sysUser.getStatus() == 2) {
				Date currentTime = Calendar.getInstance().getTime();

				if (sysUser.getDisabledTime() != null) {
					if (currentTime.getTime() < sysUser.getDisabledTime().getTime()
							+ sysUser.getDisabledMinutes() * 60 * 1000) {
						loginResult.setResult(0);
						loginResult.setMessage("用户处于被禁用的时间段内！");

						return loginResult;
					}
				} else {

					loginResult.setResult(0);
					loginResult.setMessage("用户禁用时间段有错，请联系管理员！");

					return loginResult;
				}

			} else if (sysUser.getStatus() == 3) {
				Calendar calendar = Calendar.getInstance();
				long currentOffset = calendar.get(Calendar.HOUR_OF_DAY) * 60 * 60 * 1000
						+ calendar.get(Calendar.MINUTE) * 60 * 1000 + calendar.get(Calendar.SECOND) * 1000;

				calendar.setTime(sysUser.getDisabledTime());
				long disabledStartOffset = calendar.get(Calendar.HOUR_OF_DAY) * 60 * 60 * 1000
						+ calendar.get(Calendar.MINUTE) * 60 * 1000 + calendar.get(Calendar.SECOND) * 1000;
				long disabledEndOffset = calendar.get(Calendar.HOUR_OF_DAY) * 60 * 60 * 1000
						+ calendar.get(Calendar.MINUTE) * 60 * 1000 + calendar.get(Calendar.SECOND) * 1000
						+ sysUser.getDisabledMinutes() * 60 * 1000;

				if (currentOffset < disabledStartOffset)
					currentOffset = currentOffset + (24 * 60 * 60 * 1000);
				if (currentOffset > disabledStartOffset && currentOffset < disabledEndOffset) {
					loginResult.setResult(0);
					loginResult.setMessage("用户处于每天被禁用的时间段内！");
					return loginResult;
				}
			} else if (sysUser.getStatus() == 0 && !sysUser.getUserPwd().equals(Helper.getMD5(password))) {
				loginResult.setResult(0);
				loginResult.setMessage("密码错误！");
				return loginResult;
			}

			User user = new User(sysUser);
			userId = user.getUserId();

			session.setAttribute(AuthInterceptor.SESSION_USERID, userId);
			session.setAttribute(AuthInterceptor.SESSION_USER, user);
			List<SysFuncPoint> funcPoints = systemManageService.getUserFuncPoints(userId);
			List<String> list = new ArrayList<String>();
			for (SysFuncPoint e : funcPoints)
				list.add(e.getKeyCode().toLowerCase().trim());

			CacheHelper.put("[User][" + userId + "][funcpoint]", list);

			sysUser.setLastLoginTime(Calendar.getInstance().getTime());

			systemManageService.save(sysUser);

//			 List<String> funcPoints
			// session.setAttribute(AuthInterceptor.SESSION_AUTHS, new
			// HashSet<String>(
			// Arrays.asList("sysadmin.company.delete", "sysadmin.company.add",
			// "sysadmin.company.update")));

			loginResult.setResult(1);
			loginResult.setMessage("用户登录成功！");
			loginResult.setUser(user);
			if(request.getParameter("redirectUrl") == null)
			{
				loginResult.setRedirectUrl(request.getServletContext().getContextPath()+"/ui/user/desktop");
			}
			else
			{
				loginResult.setRedirectUrl(request.getParameter("redirectUrl"));	
			}
			return loginResult;
		} else {

			loginResult.setResult(0);
			loginResult.setMessage("用户名输入错误，请确认！");
			return loginResult;
		}
	}

	@RequestMapping("/logout")
	public JsonHttpResult logout(HttpSession session) {
		Object objectUserId = session.getAttribute(AuthInterceptor.SESSION_USERID);
		if (objectUserId != null) {
			int userId = (Integer) objectUserId;
			CacheHelper.remove("[User][" + userId + "][funcpoint]");
			System.out.println("用户[" + userId + "]登出系统!");
			session.removeAttribute(AuthInterceptor.SESSION_USERID);
			session.removeAttribute(AuthInterceptor.SESSION_USER);
			
		}

		return null;
	}

	@Auth("sysadmin.user.add")
	@RequestMapping("/query")
	// @ResponseBody
	public String query() {
		System.out.println("query");
		return getClass().toString();
	}

	@Auth("user_list")
	@RequestMapping("/list")
	// @ResponseBody
	public String list() {
		System.out.println("list");
		return getClass().toString();
	}

	@Auth("user_save")
	@RequestMapping("/add")
	public String add(User user) {
		System.out.println("add:" + user);
		return "user/add";
	}
}
