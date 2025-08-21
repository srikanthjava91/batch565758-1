package com.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.model.Student;
import com.sms.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/")
	public String home() {
		return "index"; // home.jsp
	}

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "list-students";
	}

	@GetMapping("/addStudent")
	public String addStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "add-student";
	}

	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/students";
	}

	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}

}
