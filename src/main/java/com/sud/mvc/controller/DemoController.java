package com.sud.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DemoController {

	@RequestMapping("/show")
	public ResponseEntity show() {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("This is show() of SB..");
	}
	
	@PostMapping("/show1")
	public ResponseEntity show1() {
		return ResponseEntity.status(HttpStatus.OK).body("This is show1() of SB..");
	}
	

	@DeleteMapping("/show2")
	public ResponseEntity show2() {
		return ResponseEntity.status(HttpStatus.OK).body("This is show2() of SB..");
	}
}
