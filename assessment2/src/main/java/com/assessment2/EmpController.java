package com.assessment2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {

	
	@RequestMapping("/register")
	 public String display(@RequestParam("EmpNo") String EmpNo,@RequestParam("EmpName") String EmpName,@RequestParam("Desg") String Desg,@RequestParam("Sal") int Sal, Model m)
	  {
		  String s1 = "Hello "+ EmpName +" Registered";
		  String s2 = "Your's";
		  String s3 = "Your Unique ID is  "+EmpNo;
		  String s4 = "The Designation : "+ Desg;
		  String s5 = "The Salary : "+Sal;
		  
		  
		  m.addAttribute("String1",s1);
		  m.addAttribute("String2",s2);
		  m.addAttribute("String3",s3);
		  m.addAttribute("String4",s4);
		  m.addAttribute("String5",s5);
		 
		  return "viewpage";
		  
	  }
}