package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmigoscodeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeApplication.class, args);
		System.out.println("Spring boot Main class");
	}
	
	public void test() {
		System.out.println("test method");
	}
	
}
