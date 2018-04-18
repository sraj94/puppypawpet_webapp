package com.niit.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * Page Controller - used to return the response page based on requested 
 * url pattern(@controller)
 * @author hp
 *
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String goToIndex(){
		return "home";
	}
	
	@RequestMapping("/home")
	public String goToHome(){
		return "home";
	}
	
	@RequestMapping("/contactus")
	public String goToContact(){
		return "ContactUs";
	}
	@RequestMapping("/aboutus")
	public String goToAboutUs(){
		return "AboutUs";
	}
	@RequestMapping("/signin")
	public String goToSignIn(){
		return "SignIn";
	}
	@RequestMapping("/signup")
	public String goToSignUp(){
		return "SignUp";
	}
	@RequestMapping("/login")
	public String goToLogin(){
		return "loginForm";
	}
	@RequestMapping("/reset")
	public String goToReset(){
		return "ResetPassword";
	}
}

