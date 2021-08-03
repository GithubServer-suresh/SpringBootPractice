package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	//select * from student where email = ?
	//@Query("select s from student s where s.email = ?1 ")
	Optional<Student> findByEmail(String email);
}
