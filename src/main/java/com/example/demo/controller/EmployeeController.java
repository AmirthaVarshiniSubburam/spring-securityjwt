package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping("/emp")
	public String getAnEmployee() {
		return "Id: 123, Name: Hello, Salary: 1234" ;
	}
}
