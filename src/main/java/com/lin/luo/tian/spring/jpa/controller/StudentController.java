package com.lin.luo.tian.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lin.luo.tian.spring.jpa.domain.Student;
import com.lin.luo.tian.spring.jpa.repositry.StudentRepositry;

@Controller
public class StudentController {
	@Autowired
	private StudentRepositry studentRepositry;
		
	public List<Student> getAllStudents() {
		return studentRepositry.findAll();
	}
	
	public Student getStudentById(Long id) {
		return studentRepositry.findOne(id);
	}
	
	public Student getStudentWithName(String name) {
		return studentRepositry.getStudentWithName(name);
	}
}
