package fsmflying.commonweb.controller.json;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsmflying.spring.auth.Auth;

import fsmflying.commonweb.JsonHttpResult;


@RestController
@RequestMapping("/sysadmin")
public class SystemManage {

	@Auth("sysadmin.company.add")
	@RequestMapping("/company/add")
	public JsonHttpResult addCompany()
	{
		JsonHttpResult jsonHttpResult= new JsonHttpResult();
		
		return jsonHttpResult;
	}
	
	@Auth("sysadmin.company.update")
	@RequestMapping("/company/update")
	public JsonHttpResult updateCompany()
	{
		JsonHttpResult jsonHttpResult= new JsonHttpResult();
		
		return jsonHttpResult;
	}
	
	@Auth("sysadmin.company.delete")
	@RequestMapping("/company/delete/{id}")
	public JsonHttpResult deleteCompany(@PathVariable("id")int id)
	{
		JsonHttpResult jsonHttpResult= new JsonHttpResult();
		
		return jsonHttpResult;
	}
}
