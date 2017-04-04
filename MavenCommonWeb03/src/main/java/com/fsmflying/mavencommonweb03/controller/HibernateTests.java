package com.fsmflying.mavencommonweb03.controller;

import java.util.HashMap;

import javax.annotation.Resource;

import org.codehaus.jackson.map.annotate.JsonView;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsmflying.http.HttpJsonResult;
import com.fsmflying.sys.dm.SysUser;
import com.fsmflying.sys.service.ISystemManageService;

@RestController
@RequestMapping("/hibernate")
public class HibernateTests {

	@Resource(name = "mySessionFactory")
	SessionFactory sessionFactory;

	@Resource
	ISystemManageService systemManageService;

	@JsonView
	@RequestMapping("/list/{objectType}")
	public HttpJsonResult getList(@PathVariable("objectType") String objectType) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		if ("user".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysUser());
		} else if ("company".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysCompany());
		} else if ("department".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysDepartment());
		} else if ("employee".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysEmployee());
		} else if ("config".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysConfig());
		} else if ("customPage".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysCustomPage());
		} else if ("dictDir".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysDictDir());
		} else if ("dictItem".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysDictItem());
		} else if ("dataAuth".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysDataAuth());
		} else if ("dataAuthItem".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysDataAuthItem());
		} else if ("tab".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysTab());
		} else if ("menu".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysMenu());
		} else if ("funcPoint".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.setRows(systemManageService.getListOfSysFuncPoint());
		}

		return httpJsonResult;

	}

	@JsonView
	@RequestMapping("/get/{objectType}/{id}")
	public HttpJsonResult getObject(@PathVariable("objectType") String objectType, @PathVariable("id") int id) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		httpJsonResult.setData(new HashMap<String, Object>());
		if ("user".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysUser(id));
		} else if ("company".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysCompany(id));
		} else if ("department".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysDepartment(id));
		} else if ("employee".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysEmployee(id));
		} else if ("config".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysConfig(id));
		} else if ("customPage".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysCustomPage(id));
		} else if ("dictDir".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysDictDir(id));
		} else if ("dictItem".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysDictItem(id));
		} else if ("dataAuth".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysDataAuth(id));
		} else if ("dataAuthItem".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysDataAuthItem(id));
		} else if ("tab".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysTab(id));
		} else if ("menu".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysMenu(id));
		} else if ("funcPoint".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysFuncPoint(id));
		} else if ("file".equals(objectType)) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", systemManageService.getModelOfSysFile(id));
		}

		return httpJsonResult;

	}

	@JsonView
	@RequestMapping("/get/xuser")
	public HttpJsonResult getXObject(@PathVariable("objectType") String objectType,
			@RequestParam("username") String username) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = null;
		if ("user".equals(objectType)) {
			data = systemManageService.getModelOfSysUser(username,false);
		}

		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", data);
		}

		return httpJsonResult;

	}

}
