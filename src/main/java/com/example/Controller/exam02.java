package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex-02")
public class exam02 {

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("input")
	public String Input(Integer num1, Integer num2, Model model) {
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);

		int answer = num1 + num2;
		model.addAttribute("answer", answer);

		return "exam02-result";

	}
	@RequestMapping("/to-page2")
	public String toPage() {
		return "exam02-result2";
	}

}
