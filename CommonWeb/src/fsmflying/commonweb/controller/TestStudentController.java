package fsmflying.commonweb.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fsmflying.sys.domain.Student;
import fsmflying.sys.service.TestStudentService;


@Controller
@RequestMapping("/student")
public class TestStudentController {
	
	@Autowired
	TestStudentService testStudentService;
	
	@RequestMapping("/add")
	public String addNewStudent(Model model,Map<String,Object> map)
	{
		Student student = new Student();
		int nextStudentId =  testStudentService.getNextStudentId();
		student.setId(nextStudentId);
		student.setName("FangMing"+new SimpleDateFormat("-yyyyMMddHHMMssSSS").format(new Date()));
		student.setAge((int)Math.round(Math.random()*1000)%100);
		testStudentService.addStudent(student);
		model.addAttribute("message","添加了一个Student对象"+student);
		return "student";
	}
	
	@RequestMapping("/getMax")
	public String getMaxStudent(Model model)
	{
		int maxStudentId = testStudentService.getMaxStudentId();
		Student student = testStudentService.getStudent(maxStudentId);
		System.out.println(student);
		model.addAttribute("message","添加了一个Student对象"+student);
		return "student";
	}
	
	@RequestMapping("/getMin")
	public String getMinStudent(Model model)
	{
		int maxStudentId = testStudentService.getMinStudentId();
		Student student = testStudentService.getStudent(maxStudentId);
		System.out.println(student);
		model.addAttribute("message","添加了一个Student对象"+student);
		return "student";
	}
	
}
