package com.niit;

import javax.sound.midi.SysexMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDAO;

@Controller
public class Homecontroller
{
	@RequestMapping("/")
	
	public String homePage()
	{
		System.out.println("executing method home page");
		
		return "index";
	
	}
	
	@RequestMapping("/login")
	public ModelAndView showLoginPage()  //1.change from string to modelandview
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg","you clicked login link");
		mv.addObject("showloginpage","true");
		return mv;
	}
	
	@RequestMapping("/registration")
	public ModelAndView showRegistrationpage()  //1.change from string to modelandview
	{
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("msg","you clicked registration link");
		mv.addObject("showregistrationpage","true");
		return mv;
	}

	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("id")String id, @RequestParam("password")String pwd)
	{
	   System.out.println("In validate method");
	   System.out.println("id:"+id);
	   System.out.println("pwd:"+pwd);
	   ModelAndView mv= new ModelAndView("index");
	   
	   
	   UserDAO userDAO = new UserDAO();
	   
	   if( userDAO.isValidCredentials(id, pwd) == true)
	   {
		   mv.addObject("successMsg","You logged in successfully");
	   }
	   else
	   {
		   mv.addObject("errorMsg","invalid credentials.. Please try again");
	   }
	   
	   return mv;
	}


}
