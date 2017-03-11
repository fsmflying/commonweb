package fsmflying.commonweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UIController {
	
	@RequestMapping(value="/user/login",method={RequestMethod.GET})
	public String goToLoginPage()
	{
		return "login";
	}
}
