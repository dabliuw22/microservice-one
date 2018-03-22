package com.leysoft.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ApiOneController {
	
	@Value(value = "${service.message}")
	private String message;
	
	@GetMapping(value = {"/"})
	public ResponseEntity<String> message() {
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
}
