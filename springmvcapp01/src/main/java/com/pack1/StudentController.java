package com.pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("addStudent")
	public String addStudent(@ModelAttribute("st1") Student cust) {
		return "result";
	}

}
