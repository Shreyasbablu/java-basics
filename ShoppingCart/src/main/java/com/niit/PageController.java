package com.niit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
@RequestMapping("/")
public String getindex()
{
	System.out.println("Home page");
	return "index";
}

@RequestMapping("/index")
public String getindex1()
{
	System.out.println("Home page");
	return "index";
}

@RequestMapping("/404")
public String get404()
{
	System.out.println("404 page");
	return "404";
}

@RequestMapping("/brands")
public String getbrands()
{
	System.out.println("Product page");
	return "brands";
}

@RequestMapping("/checkout")
public String getcheckout()
{
	System.out.println("Checkout Page");
	return "checkout";
}

@RequestMapping("/contact")
public String getcontact()
{
	System.out.println("Contact page");
	return "contact";
}

@RequestMapping("/login")
public String getlogin()
{
	System.out.println("Login page");
	return "login";
}

@RequestMapping("/men")
public String getmen()
{
	System.out.println("MEN page");
	return "men";
}

@RequestMapping("/register")
public String getregister()
{
	System.out.println("Register page");
	return "register";
}

@RequestMapping("/single")
public String getsingle()
{
	System.out.println("Single page");
	return "single";
}

}
