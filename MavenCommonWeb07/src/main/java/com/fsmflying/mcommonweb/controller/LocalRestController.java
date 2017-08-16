package com.fsmflying.mcommonweb.controller;

import java.net.URL;

//import javax.annotation.Resource;

import org.codehaus.jackson.map.annotate.JsonView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fsmflying.http.HttpJsonResult;
//import com.fsmflying.sys.service.ISystemManageService;

@RestController
@RequestMapping("/local/rest")
public class LocalRestController {

//	@Resource
//	ISystemManageService systemManageService;
	
	@JsonView
	@RequestMapping("/getAjaxTimeout")
	public HttpJsonResult testAjaxRequest() throws InterruptedException {
		HttpJsonResult httpJsonResult = new HttpJsonResult();
		return httpJsonResult;
	}
	
	@JsonView
	@RequestMapping("/getClassLoaderInfo")
	public HttpJsonResult getClassLoaderInfo() {
		HttpJsonResult httpJsonResult = new HttpJsonResult();
		ClassLoader clazzLoader = this.getClass().getClassLoader();
		httpJsonResult.getData().put("ClassLoader[canonicalName]:", clazzLoader.getClass().getCanonicalName());
		httpJsonResult.getData().put("ClassLoader.parent[canonicalName]:", clazzLoader.getParent().getClass().getCanonicalName());
		@SuppressWarnings("restriction")
		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		String[] urlArray = new String[urls.length];
		for (int i = 0; i < urlArray.length; i++) {
			urlArray[i] = urls[i].toExternalForm();
		}
		httpJsonResult.getData().put("sun.misc.Launcher.urls", urlArray);
		return httpJsonResult;
	}
}
