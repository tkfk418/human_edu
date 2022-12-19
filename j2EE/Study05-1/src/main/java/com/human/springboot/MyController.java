package com.human.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private memberDAO emp;
	@Autowired
	private postDAO ps;
	
	@RequestMapping("/")	
	public String dohome(HttpServletRequest req, Model m) {
		HttpSession s=req.getSession();
		ArrayList<postDTO> a=ps.postlist();
		m.addAttribute("postlist", a);
		m.addAttribute("gUserid", (String) s.getAttribute("gUserid"));
		return "home";		
	}

	@RequestMapping("/login")
	public String dologin() {
		return "login";		
	}
	@RequestMapping("/checkuser")
	@ResponseBody
	public String doCheckUser(HttpServletRequest req) {
		String retvel="";
		try {
		String loginid=req.getParameter("userid");
		String pass=req.getParameter("passcode");
		if(emp.getMemberCount(loginid,pass)==1) {
			HttpSession session=req.getSession();
			session.setAttribute("gUserid", loginid);
			retvel= "ok";
		} else retvel="fail";
		} catch(Exception e) {
			retvel="fail";
		}
		return retvel;
	}

	@RequestMapping("/signout")
	@ResponseBody
	public String dosignout(HttpServletRequest req) {
		String retval="";
		try {
		HttpSession session=req.getSession();
		session.invalidate();
		retval = "ok";
		}catch(Exception e) {
			retval="fail";
		}
	return retval;
	}
	@RequestMapping("/signin")	
	public String signin(HttpServletRequest req) {
		return "signin";		
	}
	
	@RequestMapping("/dosignin")
	@ResponseBody
	public String dosignin(HttpServletRequest req) {
		
		String retval="";
		try {
		String loginid = req.getParameter("loginid");
		String passcode = req.getParameter("passcode");
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		
		emp.insertMember(loginid,passcode,name,mobile);
		retval="ok";
		} catch(Exception e) {
				retval="fail";
		}
		return retval;
	}
	
	@RequestMapping("/checkDup")
	@ResponseBody
	public String doCheckDup(HttpServletRequest req) {
		int n = emp.checkDup(req.getParameter("loginid"));
		return Integer.valueOf(n).toString();	
	}
	
	@RequestMapping("/logincheck")
	@ResponseBody
	public String doLoginCheck(HttpServletRequest req) {
		String str="";
		HttpSession session=req.getSession();
		String userid=(String)session.getAttribute("gUserid");
		if(userid==null||userid.equals("")) {
			str="";
			
		}else {
			str=userid;
		}
		return str;		
	}
	@RequestMapping("/write")
	public String dowrite() {
		return "write";		
	}
	@RequestMapping("/insert")
	public String dowriting(HttpServletRequest req) {
		HttpSession s=req.getSession();
		String currUser=(String)s.getAttribute("gUserid");
		if(currUser==null) {
			return "redirect:/";
		}
		HttpSession session=req.getSession();
		String userid=(String)session.getAttribute("gUserid");
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		ps.insertpost(title,content,userid);

		
		return "redirect:/";
	}
	@RequestMapping("/view")
	public String doView(HttpServletRequest req,Model m) {
		int num=Integer.parseInt(req.getParameter("post_id"));
		getDTO show=ps.getpost(num);
		m.addAttribute("getpost", show);
		return "view";	
	}
	@RequestMapping("/delete")
	public String doDelete(HttpServletRequest req) {
		HttpSession s=req.getSession();
		String currUser=(String)s.getAttribute("gUserid");
		if(currUser==null) {
			return "redirect:/";
		}
		int num=Integer.parseInt(req.getParameter("post_id"));
		ps.deletepost(num);
		return "redirect:/";	
	}
	
	@RequestMapping("/update")
	public String doUpdate(HttpServletRequest req,Model m) {
		HttpSession s=req.getSession();
		String currUser=(String)s.getAttribute("gUserid");
		if(currUser==null) {
			return "redirect:/";
		}
		int num=Integer.parseInt(req.getParameter("post_id"));
		getDTO show=ps.getpost(num);
		m.addAttribute("getpost", show);
		return "update";			
	}
	@RequestMapping("/modify")
	public String doModify(HttpServletRequest req,Model m) {
		int num=Integer.parseInt(req.getParameter("post_id"));
		System.out.println(num);
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		ps.updatepost(num, title, content);
		return "redirect:/";
	}
}

