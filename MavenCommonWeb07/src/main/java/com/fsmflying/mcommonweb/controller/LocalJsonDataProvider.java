package com.fsmflying.mcommonweb.controller;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fsmflying.helpers.Helper;
import com.fsmflying.helpers.SqlParameter;
import com.fsmflying.http.HttpJsonResult;
import com.fsmflying.sys.dm.SysCompany;
import com.fsmflying.sys.dm.SysConfig;
import com.fsmflying.sys.dm.SysCustomPage;
import com.fsmflying.sys.dm.SysDataAuth;
import com.fsmflying.sys.dm.SysDataAuthItem;
import com.fsmflying.sys.dm.SysDepartment;
import com.fsmflying.sys.dm.SysDictDir;
import com.fsmflying.sys.dm.SysDictItem;
import com.fsmflying.sys.dm.SysEmployee;
import com.fsmflying.sys.dm.SysFile;
import com.fsmflying.sys.dm.SysUser;
import com.fsmflying.sys.service.ISequenceService;
import com.fsmflying.sys.service.ISystemManageService;

@RestController
@RequestMapping("/local/jsondata")
public class LocalJsonDataProvider {

	@Resource
	ISystemManageService systemManageService;

	@Resource
	ISequenceService sequenceService;

//	@JsonView
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

//	@JsonView
	@RequestMapping("/get/{objectType}/{id}")
	public HttpJsonResult getObject(@PathVariable("objectType") String objectType, @PathVariable("id") int id) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = null;
		if ("user".equals(objectType)) {
			data = systemManageService.getModelOfSysUser(id);
		} else if ("company".equals(objectType)) {
			data = systemManageService.getModelOfSysCompany(id);
		} else if ("department".equals(objectType)) {
			data = systemManageService.getModelOfSysDepartment(id);
		} else if ("employee".equals(objectType)) {
			data = systemManageService.getModelOfSysEmployee(id);
		} else if ("config".equals(objectType)) {
			data = systemManageService.getModelOfSysConfig(id);
		} else if ("customPage".equals(objectType)) {
			data = systemManageService.getModelOfSysCustomPage(id);
		} else if ("dictDir".equals(objectType)) {
			data = systemManageService.getModelOfSysDictDir(id);
		} else if ("dictItem".equals(objectType)) {
			data = systemManageService.getModelOfSysDictItem(id);
		} else if ("dataAuth".equals(objectType)) {
			data = systemManageService.getModelOfSysDataAuth(id);
		} else if ("dataAuthItem".equals(objectType)) {
			data = systemManageService.getModelOfSysDataAuthItem(id);
		} else if ("tab".equals(objectType)) {
			data = systemManageService.getModelOfSysTab(id);
		} else if ("menu".equals(objectType)) {
			data = systemManageService.getModelOfSysMenu(id);
		} else if ("funcPoint".equals(objectType)) {
			data = systemManageService.getModelOfSysFuncPoint(id);
		} else if ("file".equals(objectType)) {
			data = systemManageService.getModelOfSysFile(id);
		}
		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", data);
		}
		return httpJsonResult;

	}

	@JsonView
	@RequestMapping("/get/xuser")
	public HttpJsonResult getXObject(@RequestParam("username") String username) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = null;
		data = systemManageService.getModelOfSysUser(username, false);

		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("data", data);
		}

		return httpJsonResult;

	}

//	@JsonView
	@RequestMapping("/querylist")
	public HttpJsonResult getQObject(@RequestParam("propertyName") String propertyName,
			@RequestParam("propertyValue") String propertyValue,
			@RequestParam(name = "propertyType", required = false, defaultValue = "String 'String'") String propertyType,
			@RequestParam(name = "objectType", required = false, defaultValue = "String 'user'") String objectType)
			throws IntrospectionException, ParseException {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		System.out.println("{propertyName:\"" + propertyName + "\",propertyValue=\"" + propertyValue
				+ "\",propertyType=\"" + propertyType + "}");

		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = null;

		Object value = null;
		BeanInfo beanInfo = null;

		List<SqlParameter<?>> parameters = new ArrayList<SqlParameter<?>>();

		Class<?> cls = null;

		// 识别查找的对象类型
		if ("user".equals(objectType))
			cls = SysUser.class;
		else if ("company".equals(objectType))
			cls = SysCompany.class;
		else if ("department".equals(objectType))
			cls = SysDepartment.class;
		else if ("employee".equals(objectType))
			cls = SysEmployee.class;
		else if ("dictDir".equals(objectType))
			cls = SysDictDir.class;
		else if ("dictItem".equals(objectType))
			cls = SysDictItem.class;
		else if ("dictAuth".equals(objectType))
			cls = SysDataAuth.class;
		else if ("dictAuthItem".equals(objectType))
			cls = SysDataAuthItem.class;
		else if ("config".equals(objectType))
			cls = SysConfig.class;
		else if ("customPage".equals(objectType))
			cls = SysCustomPage.class;
		else if ("file".equals(objectType))
			cls = SysFile.class;

		beanInfo = Introspector.getBeanInfo(cls);

		// 识别属性数据类型
		if (beanInfo != null) {
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
			for (int i = 0; i < pds.length; i++) {
				if (propertyName != null && pds[i].getName().toLowerCase().equals(propertyName.toLowerCase())) {
					Class<?> propCls = pds[i].getPropertyType();
//					System.out.println("{propertyType:" + propCls.getCanonicalName() + "}");
					
					if (String.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = propertyValue;
					} else if (int.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = Integer.parseInt(propertyValue);
					} else if (long.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = Long.parseLong(propertyValue);
					} else if (Date.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = Helper.parseDate(propertyValue);
					} else if (boolean.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = Boolean.parseBoolean(propertyValue);
					} else if (double.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = Double.parseDouble(propertyValue);
					} else if (float.class.getCanonicalName().equals(propCls.getCanonicalName())) {
						value = Float.parseFloat(propertyValue);
					}
					propertyName = pds[i].getName();
				} else
					continue;
			}
			parameters.add(new SqlParameter<Object>(propertyName, value));
		}

		data = systemManageService.getListOf(cls, parameters);

		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("user_list", data);
		}

		return httpJsonResult;

	}

//	@JsonView
	@RequestMapping("/get/sequence")
	public HttpJsonResult getSequence(@RequestParam("keyName") String keyName) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();
		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = sequenceService.generateNextId(keyName);

		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("sequence", data);
		}

		return httpJsonResult;

	}

//	@JsonView
	@RequestMapping("/get/sequence/{generateCount}")
	public HttpJsonResult getSequence(@RequestParam("keyName") String keyName,
			@PathVariable("generateCount") int generateCount) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();

		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = sequenceService.generateNextId(keyName);

		ArrayList<Integer> list = new ArrayList<Integer>();

		if (generateCount > 0) {
			for (int i = 0; i < generateCount; i++) {
				list.add(sequenceService.generateNextId(keyName));
			}
		}

		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("sequence list", list);
		}

		return httpJsonResult;

	}

//	@JsonView
	@RequestMapping("/get/multisequence/{generateCount}")
	public HttpJsonResult getMultipleSequence(@RequestParam("keyName") String keyName,
			@PathVariable("generateCount") int generateCount) {
		HttpJsonResult httpJsonResult = new HttpJsonResult();
		httpJsonResult.setData(new HashMap<String, Object>());
		Object data = sequenceService.generateNextId(keyName);
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (generateCount > 0) {
			int[] array = sequenceService.generateNextIds(generateCount, keyName);
			for (int i = 0; i < array.length; i++) {
				list.add(array[i]);
			}
		}
		if (data != null) {
			httpJsonResult.setResult(1);
			httpJsonResult.getData().put("multisequence list", list);
		}
		return httpJsonResult;
	}
	

}
