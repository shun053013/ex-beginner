package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex-02")
public class exam02 {
	@Autowired
	private HttpSession session;
	

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("input")
	public String Input(Integer num1, Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);

		int answer = num1 + num2;
		session.setAttribute("answer", answer);

		return "exam02-result";

	}
	@RequestMapping("/to-page2")
	public String toPage() {
		return "exam02-result2";
	}

}
