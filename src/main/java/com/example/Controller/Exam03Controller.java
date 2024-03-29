package com.example.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/input")
	public String Input(Integer num1, Integer num2, Integer num3) {
//		application.setAttribute("num1",num1);
//		application.setAttribute("num2",num2);
//		application.setAttribute("num3",num3);

		Integer taxExcludeTotal = num1 + num2 + num3;

		Double taxIncludeTotal = taxExcludeTotal * 1.1;

		application.setAttribute("taxExcludeTotal", taxExcludeTotal);
		application.setAttribute("taxIncludeTotal", taxIncludeTotal);

		return "exam03-result";

	}

}
