package fsmflying.commonweb.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fsmflying.spring.Spring4WebHelper;
import com.fsmflying.sys.dm.SysFile;

@Controller
@RequestMapping("/file")
public class FileUploadDownloadController {

	@RequestMapping(value = "/download/{id}")
	public String downloadFile01(@PathVariable("id") int id,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		Spring4WebHelper.downloadFile(1, request, response);
		return null;
	}

	@RequestMapping(value = "/download", params = { "id" })
	public String downloadFile02(
			@RequestParam(value = "id", required = true) int id) {
		return "download";
	}

	@RequestMapping(value = "/upload01")
	public String uploadFile01(@RequestParam("file") CommonsMultipartFile file,
			Model model, HttpServletRequest request) throws IOException {
		// 用来检测程序运行时间
		long startTime = System.currentTimeMillis();
		SysFile record = Spring4WebHelper.saveFile(request, file);
		System.out.println(record);
		long endTime = System.currentTimeMillis();
		String message = "方法一的运行时间：" + String.valueOf(endTime - startTime)
				+ "ms,信息：" + record;
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";

		// return "upload";
	}

	@RequestMapping(value = "/upload02")
	public String uploadFile02(@RequestParam("file") CommonsMultipartFile file,
			Model model, HttpServletRequest request)
			throws IllegalStateException, IOException {

		long startTime = System.currentTimeMillis();

		SysFile record = Spring4WebHelper.saveFile2(request, file);

		long endTime = System.currentTimeMillis();
		String message = "方法二的运行时间：" + String.valueOf(endTime - startTime)
				+ "ms,信息：" + record;
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";
		// return "upload";
	}

	@RequestMapping(value = "/upload03")
	public String uploadFile03(HttpServletRequest request, Model model)
			throws IllegalStateException, IOException {
		long startTime = System.currentTimeMillis();

		List<SysFile> files = Spring4WebHelper.saveFiles(request);

		long endTime = System.currentTimeMillis();

		ObjectMapper mapper = new ObjectMapper();
		String message = "方法三的运行时间：" + String.valueOf(endTime - startTime)
				+ "ms,信息:" + mapper.writeValueAsString(files);

		System.out.println(message);

		model.addAttribute("message", message);

		return "success";
		// return "upload";
	}
}
