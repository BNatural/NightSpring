package com.sds.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/*@Component(@Controller, @Service, @repository) */
@Controller
public class TestController {
	
	@RequestMapping("/test.do")
	public String test(){
		System.out.println("��Ʈ�ѷ� Ŭ���� �۵���!!");
		return "";
	}

}
