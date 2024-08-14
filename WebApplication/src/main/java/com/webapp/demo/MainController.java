package com.webapp.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {

	@GetMapping("/login")
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		return "index";
	}

	@GetMapping("/Welcome")
	public String welcome(HttpServletRequest request, HttpServletResponse response) {
		String parameter = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("username", parameter);
		System.out.println("parameter :: " + parameter);
		if (parameter.equals("sandesh") && password.equals("sandesh")) {
			return "Welcome";
		} else {
			return "Error";
		}
	}
}
