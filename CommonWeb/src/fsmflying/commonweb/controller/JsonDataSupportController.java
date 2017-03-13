package fsmflying.commonweb.controller;

import java.util.List;

//import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsmflying.spring.auth.AuthHelper;
import com.fsmflying.sys.dm.helper.User;
import com.fsmflying.sys.service.SystemManageService;

import fsmflying.commonweb.JsonHttpResult;

@RestController
@RequestMapping("/json")
public class JsonDataSupportController {

	@Resource
	SystemManageService systemManageService;

	@RequestMapping("/getUserTabs")
	public JsonHttpResult getTabListByUser(HttpServletRequest request) {
		JsonHttpResult jsonResult = new JsonHttpResult();
		int userId = AuthHelper.getUserId(request);
//		System.out.println(userId);
		if (userId != -1) {
			jsonResult.setResult(1);
			jsonResult.setRows(systemManageService.getUserRoles(userId));
		}
		else{
			jsonResult.setResult(0);
			jsonResult.setMessage("未能识别用户信息!");
		}
		return jsonResult;
	}

	@RequestMapping("/sysadmin/dictitem/{dirKeyCode}")
	public JsonHttpResult getDictItemsByDirKeyCode(@PathVariable String dirKeyCode) {
		JsonHttpResult jsonResult = new JsonHttpResult();
		List<?> list = systemManageService.getListOfSysDictItem(dirKeyCode);
		jsonResult.setResult(1);
		jsonResult.setRows(list);
		return jsonResult;
	}
	
}
