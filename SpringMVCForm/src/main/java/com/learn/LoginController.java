package com.learn;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learn.service.LoginService;

@Controller
public class LoginController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		
		String userName=request.getParameter("name");
		String password=request.getParameter("password");
		
		LoginService login=new LoginService();
		
		
		ModelAndView mv=new ModelAndView();
		
		System.out.println("Done   jgh");
		if(login.checkName(userName) && login.checkpassword(password)) {
			mv.setViewName("homePageInventory.jsp");
			mv.addObject("name",userName);
		}
		else {
			
			mv.setViewName("index.jsp");
			mv.addObject("error","Invalid Credentials");
			
			System.out.println("invalid credentials");
		}
		return mv;
	}

}
