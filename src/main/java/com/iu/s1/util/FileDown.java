package com.iu.s1.util;

import java.io.File;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.AbstractView;

//Custom View 생성
//1. Abstract View 상속
@Component
// FileDown 참조변수명 = new FileDown();
// 참조변수명.메서드명()
// 클래스명의 첫글자를 소문자로 바꾼것이 참조변수명
// @Component("custom")
public class FileDown extends AbstractView {
	
	@Autowired
	private ResourceLoader resourceLoader;

//2. renderMergedOutputModel overriding	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// //model : ModelAndView의 Model 객체
		System.out.println("Custom View ~~~~~~~~");
		String fileName = (String)model.get("fileName");
		String filePath = (String)model.get("filePath");
		
		System.out.println("fileName : "+fileName);
		System.out.println("filePath : "+filePath);
		
		String path="classpath:/static/";
		
		File file = new File(resourceLoader.getResource(path).getFile(), filePath);
		System.out.println(file.getAbsolutePath());
		
		
		
	}
}
