package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public Long registerStudent(@RequestBody Student student) {
		return studentService.addNewStudent(student);
	}
	
	@GetMapping("/")
	public List<Student> hello(){
		return studentService.hello();
	}
	
	@DeleteMapping(value = "{studentId}")
	public void deleteStudent(@PathVariable("studentId") Long id) {
		studentService.deleteStudent(id);
	}
	
	@PutMapping(value = "{studentId}")
	public void updateStudent(
			@PathVariable("studentId") Long studentId,
			@RequestParam(required = false) String name,
			@RequestParam(required = false) String email ) {
		
		studentService.updateStudent(studentId, name, email);
		
	}
	
	
	
}
