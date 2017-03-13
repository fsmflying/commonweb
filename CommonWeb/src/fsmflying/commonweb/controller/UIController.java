package fsmflying.commonweb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fsmflying.spring.auth.Auth;

@Controller
//@RequestMapping("/ui")
public class UIController {

	@RequestMapping(value = "/ui/user/login", method = { RequestMethod.GET })
	public String goToUserLogin(HttpServletRequest request) {
		System.out.println(request.getRequestURI().toString());
		return "login";
	}
	
	@RequestMapping(value = "/ui/user/desktop", method = { RequestMethod.GET })
	public String goToUserDesktop() {
		return "desktop";
	}

	
	@RequestMapping(value = "/ui/sysadmin/{objectType}/list", method = { RequestMethod.GET })
	public String goToSysAdminListPage(
			@PathVariable("objectType") String objectType) {
		if (objectType != null
				&& "company".equals(objectType.toLowerCase().trim()))
			return "sysadmin/topCompanyManager";
		else if (objectType != null
				&& "user".equals(objectType.toLowerCase().trim()))
			return "sysadmin/userManager";
		else if (objectType != null
				&& "department".equals(objectType.toLowerCase().trim()))
			return "sysadmin/topCompanyManager";
		else if (objectType != null
				&& "role".equals(objectType.toLowerCase().trim()))
			return "sysadmin/roleManager";
		else if (objectType != null
				&& "tab".equals(objectType.toLowerCase().trim()))
			return "sysadmin/tabManager";
		else if (objectType != null
				&& "menu".equals(objectType.toLowerCase().trim()))
			return "sysadmin/menuManager";
		else if (objectType != null
				&& "dataAuth".equals(objectType.toLowerCase().trim()))
			return "sysadmin/dataAuthManager";
		else if (objectType != null
				&& "dataAuthItem".equals(objectType.toLowerCase().trim()))
			return "sysadmin/dataAuthItemManager";
		return "pageNotFound";
	}
	
	@Auth("sysadmin.sysuser.add")
	@RequestMapping("/ui/sysadmin/user/add")
	public String goToSysUserAddPage()
	{
		return "sysadmin/SysUserAdd";
	}
}
