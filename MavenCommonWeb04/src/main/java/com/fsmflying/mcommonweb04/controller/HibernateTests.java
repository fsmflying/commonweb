package com.fsmflying.mcommonweb04.controller;

import javax.annotation.Resource;

import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsmflying.http.HttpJsonResult;
import com.fsmflying.sys.service.ISystemManageService;

@RestController
@RequestMapping("/hibernate")
public class HibernateTests {
	
	@Resource//(name="")
	ISystemManageService isystemManageService;
	
	
	//SessionFactory  

	@RequestMapping("/{objectType}/list")
	@JsonView
	public HttpJsonResult getList(@PathVariable("objectType") String objectType)
	{
		HttpJsonResult httpJsonResult = new HttpJsonResult();
		if("user".equals(objectType))
		{
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(isystemManageService.getListOfSysUser());
		}
		
		return httpJsonResult;
	}
}
