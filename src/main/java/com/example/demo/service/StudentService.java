package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public Long addNewStudent(Student student) {
		Optional<Student> findByEmail = studentRepository.findByEmail(student.getEmail());
		if(findByEmail.isPresent()) {
			throw new IllegalStateException("Email taken");
		}
		 Student dbStudent = studentRepository.save(student);
		 return dbStudent.getId();
	}
	
	public List<Student> hello(){
		return studentRepository.findAll();
	}

	public void deleteStudent(Long studentId) {
		boolean exists = studentRepository.existsById(studentId);
		if(!exists) {
			throw new IllegalStateException("Student with id "+studentId+" does not exists");
		}
		studentRepository.deleteById(studentId);
	}

	@Transactional
	public void updateStudent(Long studentId, String name, String email) {
		Student student = studentRepository.findById(studentId).
				orElseThrow(()->new IllegalStateException("Student with id " +studentId+ " does not exist"));
		if(name !=null && name.length()>0 && !Objects.equals(student.getName(), name)) {
			student.setName(name);
		}
		if(email!=null && email.length()>0 && !Objects.equals(student.getEmail(), email)) {
			Optional<Student> studentOptional = studentRepository.findByEmail(email);
			if(studentOptional.isPresent()) {
				throw new IllegalStateException("Email taken");
			}
			student.setEmail(email);
		}
	}
}
