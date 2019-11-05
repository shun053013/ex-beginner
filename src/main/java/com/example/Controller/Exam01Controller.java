package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex-01")
public class Exam01Controller {

	@RequestMapping("")
	public String index() {
		return "exam01";
	}

	@RequestMapping("input")
	public String Input(String name, Model model) {
		model.addAttribute("name",name);
		return "ex-01-result";
	}
}
