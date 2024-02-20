package com.example.springboot.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class SecurityController {
	
	
	@GetMapping("/notAuthorized")
	public String error()
	{
		return "notAuthorized";
	}
	@GetMapping("/login")
	public String loginPage()
	{
		return "login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) throws ServletException
	{
		request.logout();
		
		return "redirect:/login";
	}
	
	
	@GetMapping("/profil")
	public String profil()
	{		
		return "profil";
	}
}
