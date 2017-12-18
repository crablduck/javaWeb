package com.xjw.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@RequestMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file, HttpServletRequest request){
		//upload在项目中的绝对路径
		String realPath = request.getServletContext().getRealPath("upload");
		String path = realPath+File.separator+file.getOriginalFilename();
		try {
			FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(path));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ok";
	}
	
	@RequestMapping("/upload1")
	public String upload1(@RequestParam("file")MultipartFile file,HttpServletRequest request) throws Exception{
		String realPath = request.getServletContext().getRealPath("/upload");
		//upload/xx.jsp
		String target = realPath+File.separator+file.getOriginalFilename();
		System.out.println(realPath+":"+target);
		FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(target));
		System.out.println("success");
		return "ok";
	}
}
