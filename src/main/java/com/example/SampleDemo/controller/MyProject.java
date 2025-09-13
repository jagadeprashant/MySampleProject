package com.example.SampleDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyProject {

	@GetMapping("/display")
	public String MyDisplay() {
		return "My first project !!";
	}
}
