package com.human.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private empDAO emp;
	
	@RequestMapping("/")	
	public String dohome(HttpServletRequest req,Model m) {
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
	public String doCheckUser(HttpServletRequest req) {
		String loginid=req.getParameter("userid");
		String pass=req.getParameter("passcode");
		if(emp.getMemberCount(loginid,pass)==1) {
			HttpSession session=req.getSession();
			session.setAttribute("gUserid", loginid);
			return "redirect:/";
		}
	
			return "redirect:/login";
	}

	@RequestMapping("/signout")	
	public String dosignout(HttpServletRequest req, Model m) {
		HttpSession session=req.getSession();
		session.invalidate();
		return "redirect:/";		
	}
	@RequestMapping("/signin")	
	public String signin(HttpServletRequest req) {
		return "signin";		
	}
	
	@RequestMapping("/dosignin")	
	public String dosignin(HttpServletRequest req) {
		String loginid = req.getParameter("loginid");
		String passcode = req.getParameter("passcode");
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		if(emp.getidCount(loginid)==1) {
			return "signin";
		}
		emp.insertMember(loginid,passcode,name,mobile);
		return "redirect:/login";		
	}
	
//	@RequestMapping("/viewuser")	
//	public String doViewUser(HttpServletRequest req, Model m) {
//		String a=req.getParameter("loginid");
//		String b=req.getParameter("passcode");
//		String c=req.getParameter("name");
//		String d=req.getParameter("mobile");
//		
//		m.addAttribute("log",a);
//		m.addAttribute("pw",b);
//		m.addAttribute("nm",c);
//		m.addAttribute("mob",d);
//		return "userinfo";		
//	}


}

