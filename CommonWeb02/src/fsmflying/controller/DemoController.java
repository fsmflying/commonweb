package fsmflying.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
public class DemoController {

	@RequestMapping("/")
	public String defaultIndex()
	{
		return "success";
	}
}
