package fsmflying.commonweb.controller;

import java.util.Arrays;
import java.util.HashSet;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import com.fsmflying.sys.dm.SysUser;
import com.fsmflying.sys.dm.helper.LoginResult;
import com.fsmflying.sys.dm.helper.User;
import com.fsmflying.sys.service.SystemManageService;

import fsmflying.auth.Auth;
import fsmflying.auth.AuthInterceptor;

//@Controller
@RestController
@RequestMapping("/user")
public class UserController {

	@Resource
	SystemManageService systemManageService;
	
	@RequestMapping(value="/login",method={RequestMethod.POST})
	public String toLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login",method={RequestMethod.POST})
	public boolean login(HttpSession session, User user) {
		boolean result = false;
		// 模拟从数据库查出存在这样的用户
		SysUser sysUser = systemManageService.getModelOfSysUser(user.getUsername());
//		User user = null;
//		if(sysUser!=null) 
		Long userId = (long) user.getUserId();
		if (userId != null && userId > 0) {
			session.setAttribute(AuthInterceptor.SESSION_USERID, userId);
			session.setAttribute(
					AuthInterceptor.SESSION_AUTHS,
					new HashSet<String>(Arrays.asList("user_list",
							"user_query", "user_save")));
			result = true;
		}
		return result;
	}
	
	
	@RequestMapping("/logout")
	public boolean logout(HttpSession session,User user)
	{
		
		return false;
	}

	@Auth("user_queryXXXX")
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
