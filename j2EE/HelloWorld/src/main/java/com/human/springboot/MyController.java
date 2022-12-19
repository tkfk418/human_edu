package com.human.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")	//웹브라우저에서 "/"를 입력하면
	public String test1() {
		return "test1";		//웹브라우저에게 "test1.jsp"를 보내준다
	}

}
