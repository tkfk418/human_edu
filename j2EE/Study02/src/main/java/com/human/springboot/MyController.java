package com.human.springboot;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@RequestMapping("/")	
	public String dohome(HttpServletRequest req, Model m) {
		HttpSession session=req.getSession();
		String sess_info=(String) session.getAttribute("gUserid");
		m.addAttribute("userid",sess_info);
		return "home";		
	}

	@RequestMapping("/login")
	public String dologin() {
		return "login";		
	}
	@RequestMapping("/checkuser")	
	public String doCheckUser(HttpServletRequest req, Model m) {
		String loginid=req.getParameter("userid");
		String pw=req.getParameter("passcode");
		
		System.out.println("loginid="+loginid);	
		System.out.println("password="+pw);
		
		HttpSession session=req.getSession();  //초기화
		session.setAttribute("gUserid", loginid); //값설정
	
			return "redirect:/";
	}
	
	@RequestMapping("/signin")	
	public String dosignin() {
		return "signin";		
	}
	
	@RequestMapping("/viewuser")	
	public String doViewUser(HttpServletRequest req, Model m) {
		String a=req.getParameter("loginid");
		String b=req.getParameter("passcode");
		String c=req.getParameter("name");
		String d=req.getParameter("mobile");
		
		m.addAttribute("log",a);
		m.addAttribute("pw",b);
		m.addAttribute("nm",c);
		m.addAttribute("mob",d);
		return "userinfo";		
	}


}
