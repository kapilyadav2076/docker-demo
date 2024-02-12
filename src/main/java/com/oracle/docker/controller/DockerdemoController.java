package com.oracle.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerdemoController {

	@GetMapping("/test-docker")
	public String testDocker() {
		return "Hello, docker test is successful. It works!!";
	}
}
