package com.example.demo.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
@Service
public class StudentService {

	
	public List<Student> hello(){
		return Arrays.asList(
				new Student(1L,"Mariam","Mariam.jamal@gmail.com",LocalDate.of(2000, Month.JANUARY, 5),21)
				//new Student(1L,"Mariam","Mariam.jamal@gmail.com",LocalDate.of(2001, Month.FEBRUARY, 5),22)
				);
	}
}
