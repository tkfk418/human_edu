package com.human.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@RequestMapping("/")	//웹브라우저에서 "/"를 입력하면
	public ModelAndView test1() {
		//m.addAttribute("myname","sara");//myname이라는 이름의 어트리부트에 들어가는 데이터는 "sara"라는 문자열
		//m.addAttribute("others","project");
		ArrayList<String> arName=new ArrayList<String>();
		arName.add("latte");
		arName.add("mocca");
		arName.add("americano");
		arName.add("cappuccino");
		ModelAndView mv = new ModelAndView(); 
		mv.addObject("menu",arName);
		mv.setViewName("test1");
		return mv;
	}

	@RequestMapping("/login")	//웹브라우저에서 "/login"를 입력하면
	public String dologin() {
		return "login";		//웹브라우저에게 "login.jsp"를 보내준다
	}
	@RequestMapping("/checkuser")	
	public String doCheckUser(HttpServletRequest req, Model m) {
		String loginid=req.getParameter("userid");
		String pw=req.getParameter("passcode");
		
		System.out.println("loginid="+loginid);	
		System.out.println("password="+pw);
		
		m.addAttribute("uid",loginid);
		m.addAttribute("pwd",pw);
		if(loginid.equals("star")) {
			return "userinfo";
		}else {
			return "redirect:/login";
		}
	}
	
	@RequestMapping("/signin")	
	public String dosignin() {
	
		return "register";		
	}
	
	@RequestMapping("/logout")	
	public String dologout() {
		return "logout";		
	}
	
	@RequestMapping("/name")
	@ResponseBody	   // return 값을 jsp파일이 아닌 단순문자열로 만들어서 반송함 - ajax에서 사용
	public String doName() {
		return "name";		
	}
	
	@RequestMapping("/plus")	
	public String showplus() {
		return "plus";		
	}
	@RequestMapping("/doplus")	
	public String showDoPlus(HttpServletRequest req, Model m) {
		int a=Integer.parseInt(req.getParameter("a"));
		int b=Integer.parseInt(req.getParameter("b"));
		
		System.out.println("A="+a);	
		System.out.println("B="+b);
		
		m.addAttribute("sum",a+b);
		return "doplus";
		
	}
	
	@RequestMapping("/timetable")	
	public String showtimetable() {
		return "timetable";		
	}
	
	@RequestMapping("/dotimetable")	
	public String showdotimetable(HttpServletRequest req, Model m) {
		int a=Integer.parseInt(req.getParameter("a"));
		
		System.out.println("단="+a);	
		ArrayList<String> arName=new ArrayList<String>();
		arName.add(a+"x"+"1"+"="+(a*1));
		arName.add(a+"x"+"2"+"="+(a*2));
		arName.add(a+"x"+"3"+"="+(a*3));
		arName.add(a+"x"+"4"+"="+(a*4));
		arName.add(a+"x"+"5"+"="+(a*5));
		arName.add(a+"x"+"6"+"="+(a*6));
		arName.add(a+"x"+"7"+"="+(a*7));
		arName.add(a+"x"+"8"+"="+(a*8));
		arName.add(a+"x"+"9"+"="+(a*9));
		m.addAttribute("dan",arName);
		return "dotimetable";
		
	}

}
