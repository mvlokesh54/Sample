package com.javatpoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response){
		
		 String name= request.getParameter("name");
		 String password = request.getParameter("password");
		 String message="error, password worng";
		 System.out.println("Name and Password"+name+password);
		 System.out.println(" password ----"+(password.equals("admin")));
		 if(name.equalsIgnoreCase("admin"))
		 {
			 System.out.println(" password ----"+(password.equals("admin")));
			 return new ModelAndView("hellopage", "password", password);
		 }
		 else{
			 System.out.println(" password in else ----"+(password.equals("admin")));
			 
			 return new ModelAndView("errorPage","password","Sorry, username or password error");
		 }
		
	}
}
