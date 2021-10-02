package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AmigoscodeApplication {

	public static void main(String[] args) {
		System.out.println("This is from STS");
		System.out.println("This is main class added by dev");
		SpringApplication.run(AmigoscodeApplication.class, args);
		System.out.println("This is from Github");
	}

	/*
	 * @GetMapping("/") public String hello() { return "Hello World"; }
	 */
	
	/*
	 * @GetMapping("/") public List<String> hello() { return Arrays.asList("Hello",
	 * "World"); }
	 */
	
	/*
	 * @GetMapping("/") public List<Student> hello(){ return Arrays.asList( new
	 * Student(1L,"Mariam","Mariam.jamal@gmail.com",LocalDate.of(2000,
	 * Month.JANUARY, 5),21) //new
	 * Student(1L,"Mariam","Mariam.jamal@gmail.com",LocalDate.of(2001,
	 * Month.FEBRUARY, 5),22) ); }
	 */
	
	
}
