package fsmflying.commonweb.controller;

//import org.springframework.web.bind.annotation.GetMapping;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import fsmflying.commonweb.JsonHttpResult;
import fsmflying.northwind.service.NorthwindService;
import fsmflying.sys.domain.LoginResult;
import fsmflying.sys.domain.Student;
import fsmflying.sys.domain.User;
import fsmflying.sys.service.TestStudentService;

@RestController
@RequestMapping("/testjson")
public class RestJsonController {

	// @Autowired
	@Autowired
	TestStudentService testStudentService;

	@Autowired
	NorthwindService northwindService;

	@RequestMapping("/user")
	 @JsonView(User.WithoutPasswordView.class)
//	@JsonView(User.WithPasswordView.class)
	// @JsonView
	public User getUser() {
		return new User("eric", "7!jd#h23");
	}

	@RequestMapping("/xuser")
	public User getXUser() {
		return new User("fangming", "123456");
	}

	@RequestMapping("/getStudent")
	public Student getStudent(@RequestParam("id") int id) {
		Student student = testStudentService.getStudent(id);
		return student;
	}

	@RequestMapping("/getMaxStudent")
	public Student getMaxStudent() {
		int maxStudentId = testStudentService.getMaxStudentId();
		Student student = testStudentService.getStudent(maxStudentId);
		return student;
	}

	@RequestMapping("/getMinStudent")
	public Student getMinStudent() {
		int minStudentId = testStudentService.getMinStudentId();
		Student student = testStudentService.getStudent(minStudentId);
		return student;
	}

	@RequestMapping("/getResult/list/{objectType}")
	public JsonHttpResult getListResult(
			@PathVariable("objectType") String objectType) {
		JsonHttpResult httpResult = new JsonHttpResult();
		if ("student".equals(objectType))
			httpResult.getData().put(
					"list",
					testStudentService.getStudent(testStudentService
							.getMaxStudentId()));
		else if ("customer".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getListOfCustomer());
		else if ("category".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getListOfCategory());
		else if ("shipper".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getListOfShipper());
		else if ("supplier".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getListOfSupplier());
		else
			httpResult.setMessage("no data!");
		httpResult.setResult(1);
		httpResult.setMessage("success");
		return httpResult;
	}

	@RequestMapping("/getResult/one/{objectType}/{id}")
	public JsonHttpResult getResult(
			@PathVariable("objectType") String objectType,
			@PathVariable(value="id") String id) {
		JsonHttpResult httpResult = new JsonHttpResult();
		if ("student".equals(objectType))
			httpResult.getData().put(
					"list",
					testStudentService.getStudent(Integer.parseInt(id)));
		else if ("customer".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getCustomer(id));
		else if ("category".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getCategory(Integer.parseInt(id)));
		else if ("shipper".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getShipper(Integer.parseInt(id)));
		else if ("supplier".equals(objectType))
			httpResult.getData().put("list",
					northwindService.getSupplier(Integer.parseInt(id)));
		else
			httpResult.setMessage("no data!");
		httpResult.setResult(1);
		httpResult.setMessage("success");
		return httpResult;
	}
	
	
	@RequestMapping("/login")
	public LoginResult login(@RequestParam("username") String username,@RequestParam("password") String password)
	{
		Map<String,String> accounts = new HashMap<String,String>();
		accounts.put("fangming", "123456");
		accounts.put("wangliang", "123456");
		accounts.put("wangxiaojuan", "123456");
		accounts.put("yanxia", "123456");
		accounts.put("fengqingyang", "123456");
		accounts.put("dongfangbubai", "123456");
		accounts.put("zhangshan", "123456");
		accounts.put("lishi", "123456");
		accounts.put("wangwu", "123456");
		accounts.put("方明", "123456");
		LoginResult result = new LoginResult();
		if(accounts.containsKey(username)&&accounts.get(username).equals(password))
		{
			result.success();
			result.setMessage("登录成功！");
			result.setUser(new User(username));
		}
		else
		{
			result.failure();
			result.setMessage("登录失败!");
			result.setUser(null);
		}
		return result;
	}
	
	
	

}
