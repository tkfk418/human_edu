package com.human.springboot;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	@Autowired
	private empDAO emp;
	
		@RequestMapping("/")	
		public String home(Model model) {
			ArrayList<EmpDTO> edto=emp.list();
			model.addAttribute("worker", edto);
			return "home";		
		}
		@RequestMapping("/roomtype")	
		public String getList(Model model) {
			ArrayList<RoomtypeDTO> rdto=emp.listRoomType();
			model.addAttribute("rt", rdto);
			return "roomtype";	
		}
		@RequestMapping("/department")	
		public String getDpartmentList(Model model) {
			ArrayList<departmentDTO> ddto=emp.listdepartment();
			model.addAttribute("dt", ddto);
			return "department";	
		}
		
//		@RequestMapping("/insertRT_form")	
//		public String doAddRoomType() {
//			return "insertRT_form";
//		}
//		@RequestMapping("/insertRT")	
//		public String doinsertRT(HttpServletRequest req, Model model) {
//			String typename = req.getParameter("typename");
//			emp.insertRoomType(typename);
//			return "redirect:/roomtype";
//		}
		@RequestMapping("/insertRI_form")	
		public String doAddRoomInfo() {
			return "insertRI_form";
		}
		@RequestMapping("/insertRI")	
		public String doAddRI(HttpServletRequest req, Model model) {
			String name = req.getParameter("name");
			String type = req.getParameter("type");
			String howmany = req.getParameter("howmany");
			String howmuch = req.getParameter("howmuch");
			emp.insertRoomInfo(name,Integer.parseInt(type),Integer.parseInt(howmany),Integer.parseInt(howmuch));
			return "redirect:/insertRI_form";
		}
		@RequestMapping("/controlRoomType")	
		public String doDeleteType(HttpServletRequest req) {
			if(req.getParameter("optype").equals("delete")) {
				int typenum=Integer.parseInt(req.getParameter("typenum"));
				emp.deleteRoomType(typenum);
			}else if(req.getParameter("optype").equals("insert")) {
				String typename = req.getParameter("typename");
				emp.insertRoomType(typename);
			}else if(req.getParameter("optype").equals("update")) {
				String typename = req.getParameter("typename");
				int typenum=Integer.parseInt(req.getParameter("typenum"));
				emp.updateRoomType(typename, typenum);
			}
			return "redirect:/roomtype";
		}
		@RequestMapping("/roominfo")	
		public String doRoomInfo(Model model) {
				ArrayList<RoominfoDTO> idto=emp.listRoomInfo();
				model.addAttribute("it", idto);
				ArrayList<RoomtypeDTO> rdto=emp.listRoomType();
				model.addAttribute("rt", rdto);
				return "roominfo";	
		
		}
		@RequestMapping("/controlRoomInfo")	
		public String doControlRoomInfo(HttpServletRequest req) {
			if(req.getParameter("optype").equals("delete")) {
				int num=Integer.parseInt(req.getParameter("num"));
				emp.deleteRoomInfo(num);
			}else if(req.getParameter("optype").equals("insert")) {
				String name = req.getParameter("name");
				String type = req.getParameter("type");
				String howmany = req.getParameter("howmany");
				String howmuch = req.getParameter("howmuch");
				emp.insertRoomInfo(name,Integer.parseInt(type),Integer.parseInt(howmany),Integer.parseInt(howmuch));
			}else if(req.getParameter("optype").equals("update")) {
				String num=req.getParameter("num");
				String name = req.getParameter("name");
				String type = req.getParameter("type");
				String howmany = req.getParameter("howmany");
				String howmuch = req.getParameter("howmuch");
				//emp.updateRoomInfo(Integer.parseInt(num),name,Integer.parseInt(type),Integer.parseInt(howmany),Integer.parseInt(howmuch));
			}
			return "redirect:/roominfo";	
		}
		@RequestMapping("/ajaxtest")	
		public String doAjaxText() {
			return "ajax";
		}
		@RequestMapping("/doPlus")
		@ResponseBody
		public String doPlus(HttpServletRequest req) {
			int one = Integer.parseInt(req.getParameter("first"));
			int two = Integer.parseInt(req.getParameter("second"));
			int result=one+two;
			return Integer.valueOf(result).toString();
		}
		@RequestMapping("/getEmpList")
		@ResponseBody
		public String doGetEmpList() {
			ArrayList<EmpDTO> edto=emp.list();
			JSONArray ja = new JSONArray();
			for(int i=0; i<edto.size(); i++) {
				JSONObject jo = new JSONObject();
				jo.put("eid",edto.get(i).getEmployee_id());
				jo.put("emp_name",edto.get(i).getEmp_name());
				jo.put("salary",edto.get(i).getSalary());
				jo.put("mname",edto.get(i).getManager_name());
				ja.add(jo);
			}
			return ja.toString();
		}
		@RequestMapping("/emplist")	
		public String showEmpList() {
			return "EmpList";
		}
		@RequestMapping("/xroomtype")	
		public String viewRoomType() {
		
			return "ajax_roomtype";	
		}
		@RequestMapping("/getRoomType")	
		@ResponseBody
		public String doGetRoomType() {
			ArrayList<RoomtypeDTO> rdto=emp.listRoomType();
			JSONArray ja = new JSONArray();
			for(int i=0; i<rdto.size(); i++) {
				JSONObject jo = new JSONObject();
				jo.put("typenum",rdto.get(i).getTypenum());
				jo.put("typename",rdto.get(i).getTypename());
				ja.add(jo);
			}
			return ja.toString();
		}
		@RequestMapping("/cudRoomType")	
		@ResponseBody
		public String doCudRoomType(HttpServletRequest req) {
			if(req.getParameter("optype").equals("delete")) {
				int typenum=Integer.parseInt(req.getParameter("typenum"));
				emp.deleteRoomType(typenum);
			}else if(req.getParameter("optype").equals("insert")) {
				String typename = req.getParameter("typename");
				emp.insertRoomType(typename);
			}else if(req.getParameter("optype").equals("update")) {
				String typename = req.getParameter("typename");
				int typenum=Integer.parseInt(req.getParameter("typenum"));
				emp.updateRoomType(typename, typenum);
			}
			return "Ok";
		}
		@RequestMapping("/xroominfo")	
		public String viewRoomInfo() {
		
			return "ajax_roominfo";	
		}
		@RequestMapping("/getRoominfo")
		@ResponseBody
		public String doGetRoomInfo() {
				ArrayList<RoominfoDTO> idto=emp.listRoomInfo();
				JSONArray ja = new JSONArray();
				for(int i=0; i<idto.size(); i++) {
					JSONObject jo = new JSONObject();
					jo.put("num",idto.get(i).getNum());
					jo.put("name",idto.get(i).getName());
					jo.put("type",idto.get(i).getType());
					jo.put("howmany",idto.get(i).getHowmany());
					jo.put("howmuch",idto.get(i).getHowmuch());
					ja.add(jo);
				}

				return ja.toString();		
		}
		@RequestMapping("/cudRoomInfo")	
		@ResponseBody
		public String doCudRoomInfo(HttpServletRequest req) {
			if(req.getParameter("optype").equals("delete")) {
				int num=Integer.parseInt(req.getParameter("num"));
				emp.deleteRoomInfo(num);
			}else if(req.getParameter("optype").equals("insert")) {
				String name = req.getParameter("name");
				String type = req.getParameter("type");
				String howmany = req.getParameter("howmany");
				String howmuch = req.getParameter("howmuch");
				emp.insertRoomInfo(name,Integer.parseInt(type),Integer.parseInt(howmany),Integer.parseInt(howmuch));
			}else if(req.getParameter("optype").equals("update")) {
				String num=req.getParameter("num");
				String name = req.getParameter("name");
				String type = req.getParameter("type");
				String howmany = req.getParameter("howmany");
				String howmuch = req.getParameter("howmuch");
				emp.updateRoomInfo(Integer.parseInt(num),name,Integer.parseInt(type),Integer.parseInt(howmany),Integer.parseInt(howmuch));
			}
			return "ok";	
		}
}

