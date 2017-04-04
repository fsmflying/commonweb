package com.fsmflying.mcommonweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.fsmflying.http.HttpJsonResult;

@RestController
@RequestMapping("/local/rest/")
public class LocalRestController {

//	@SuppressWarnings("static-access")
	@RequestMapping("/testAjax")
	public HttpJsonResult testAjaxRequest() throws InterruptedException {
		HttpJsonResult httpJsonResult = new HttpJsonResult();
		Thread.currentThread().sleep(1000 * 11L);
		return httpJsonResult;
	}
}
