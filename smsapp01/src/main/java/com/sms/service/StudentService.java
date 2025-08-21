package com.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.model.Student;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<>();// {}

	public List<Student> getAllStudents() {
		return students;// {}
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void deleteStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}

}
