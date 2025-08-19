package org.pack1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/regSt")
	String getStudent(@ModelAttribute("student") Student student) {
		return "success";
	}

}
