package com.mkyong.common.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.applet.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@Scope("request")
public class StudentController {
   
   @Autowired
   private Studentdetails studentdetails = null;
   
   public Studentdetails getStudentdetails() {
	return studentdetails;
	}
	
	public void setStudentdetails(Studentdetails studentdetails) {
		this.studentdetails = studentdetails;
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
   public String student(HttpServletResponse response, Model model) {
	   //Map<String, Object> model = new HashMap<String, Object>();
	   //model.put("studentdetail", new Studentdetails());
       //model.put("department", "dept");
	   //return new ModelAndView("student",model);
	   //return new ModelAndView("student",getStudentdetails());
		List<String> genderList = new ArrayList<String>();  
        genderList.add("M");  
        genderList.add("F");  
		model.addAttribute("studentdetailBean",getStudentdetails());
		model.addAttribute("genderlist", genderList);
		//System.out.println("studentdetail bean = " + getStudentdetails().getSt().getGender()[0]);
	return "student";
      
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWe1")Studentdetails student, 
   ModelMap model) {
   //   model.addAttribute("name", student.getName());
   //   model.addAttribute("age", student.getAge());
   //   model.addAttribute("id", student.getId());
   //   
      return "result";
   }
   
   
}