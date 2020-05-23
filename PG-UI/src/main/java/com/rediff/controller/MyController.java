package com.rediff.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public ModelAndView getAdmin()
	{
		return new ModelAndView("views/admin.html");
	}
	
	@GetMapping({"/user","/"})
	@PreAuthorize("hasRole('USER')")
	public ModelAndView getUser()
	{
		return new ModelAndView("views/user.html");
	}
}
