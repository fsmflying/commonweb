package fsmflying.commonweb.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Controller
@RequestMapping("/file")
public class FileUploadDownloadController {

	@RequestMapping(value = "/download/{id}")
	public String downloadFile01(@PathVariable("id") int id) {
		return "download";
	}

	@RequestMapping(value = "/download", params = { "id" })
	public String downloadFile02(
			@RequestParam(value = "id", required = true) int id) {
		return "download";
	}

	@RequestMapping(value = "/upload01")
	public String uploadFile01(@RequestParam("file") CommonsMultipartFile file,
			Model model) throws IOException {
		// ��������������ʱ��
		long startTime = System.currentTimeMillis();
		System.out.println("fileName��" + file.getOriginalFilename());

		try {
			// ��ȡ�����
			OutputStream os = new FileOutputStream("E:/" + new Date().getTime()
					+ file.getOriginalFilename());
			// ��ȡ������ CommonsMultipartFile �п���ֱ�ӵõ��ļ�����
			InputStream is = file.getInputStream();
			int temp;
			// һ��һ���ֽڵĶ�ȡ��д��
			while ((temp = is.read()) != (-1)) {
				os.write(temp);
			}
			os.flush();
			os.close();
			is.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		String message = "����һ������ʱ�䣺" + String.valueOf(endTime - startTime)
				+ "ms";
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";

		// return "upload";
	}

	@RequestMapping(value = "/upload02")
	public String uploadFile02(@RequestParam("file") CommonsMultipartFile file,
			Model model) throws IllegalStateException, IOException {

		long startTime = System.currentTimeMillis();
		System.out.println("fileName��" + file.getOriginalFilename());
		String path = "E:/" + new Date().getTime() + file.getOriginalFilename();

		File newFile = new File(path);
		// ͨ��CommonsMultipartFile�ķ���ֱ��д�ļ���ע�����ʱ��
		file.transferTo(newFile);
		long endTime = System.currentTimeMillis();
		// System.out.println("������������ʱ�䣺" + String.valueOf(endTime - startTime)
		// + "ms");
		String message = "������������ʱ�䣺" + String.valueOf(endTime - startTime)
				+ "ms";
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";
		// return "upload";
	}

	@RequestMapping(value = "/upload03")
	public String uploadFile03(HttpServletRequest request, Model model)
			throws IllegalStateException, IOException {
		long startTime = System.currentTimeMillis();
		// ����ǰ�����ĳ�ʼ���� CommonsMutipartResolver ���ಿ�ֽ�������
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// ���form���Ƿ���enctype="multipart/form-data"
		if (multipartResolver.isMultipart(request)) {
			// ��request��ɶಿ��request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// ��ȡmultiRequest �����е��ļ���
			Iterator iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// һ�α��������ļ�
				MultipartFile file = multiRequest.getFile(iter.next()
						.toString());
				if (file != null) {
					String path = "E:/springUpload"
							+ file.getOriginalFilename();
					// �ϴ�
					file.transferTo(new File(path));
				}

			}

		}
		long endTime = System.currentTimeMillis();
		// System.out.println("������������ʱ�䣺" + String.valueOf(endTime - startTime)
		// + "ms");
		String message = "������������ʱ�䣺" + String.valueOf(endTime - startTime)
				+ "ms";
		System.out.println(message);
		model.addAttribute("message", message);
		return "success";
		// return "upload";
	}
}
