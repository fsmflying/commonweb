package fsmflying.commonweb.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fsmflying.commonweb.JsonHttpResult;

//@Controller
@RestController
@RequestMapping("/json")
public class JsonDataSupportController {
	
	@RequestMapping("/getUserTabs")
	public JsonHttpResult getTabListByUser()
	{
		JsonHttpResult jsonResult = new JsonHttpResult();
		
		
		return jsonResult;
	}
}
