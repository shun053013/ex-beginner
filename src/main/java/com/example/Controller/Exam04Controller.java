package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;


@Controller
@RequestMapping("/ex04")
public class Exam04Controller {
	@ModelAttribute
	public UserForm userform() {
		return new UserForm();
	}

	
	@RequestMapping("")
	public String index(Model model) {
		return "exam04";
	}
	@RequestMapping("/input")
	public String input(@Validated UserForm userform,BindingResult result ,Model model) {
		
		if(result.hasErrors()) {
			return index(model);
		}
		
		
		User user= new User();
		user.setName(userform.getName());
		user.setAge(userform.getAge());
		user.setComment(userform.getComment());
		
		model.addAttribute("user",user);
		
		return "exam04-result";
		
	}

}
