package fsmflying.commonweb.controller;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.map.JsonSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fsmflying.sys.service.ISequenceService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	ISequenceService sequenceService;

	@RequestMapping("/getNextSequence")
	public String getNextSequenceId(
			@RequestParam("keyname") String keyname,
			@RequestParam(value = "increment", required = false, defaultValue = "int 1") int increment,
			Model model) {
		System.out.println("{keyname:"+keyname+",increment:"+increment+"}");
		int nextId = sequenceService.generateNextId(keyname, increment);
		String message = "生成一个序号值[" + keyname + "]:" + nextId;
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";
	}
	
	@RequestMapping("/getNextSequences")
	public String getNextSequenceIds(
			@RequestParam("keyname") String keyname,
			@RequestParam(value = "increment", required = false, defaultValue = "int 1") int increment,
			@RequestParam(value = "generateCount", required = false, defaultValue = "int 1") int generateCount,
			Model model) throws JsonProcessingException {
		System.out.println("{keyname:"+keyname+",increment:"+increment+"}");
		int[] nextIds = sequenceService.generateNextIds(generateCount,keyname, increment);
		ObjectMapper mapper = new ObjectMapper();
		String message = "生成一个序号值[" + keyname + "]:" + mapper.writeValueAsString(nextIds);
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";
	}
}
