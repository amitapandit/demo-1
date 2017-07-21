package com.siemens.azure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

	@RequestMapping("/greeting")
	public ResponseEntity<String> helloWorld() {
		ResponseEntity<String> response = new ResponseEntity<String>("Hello World", HttpStatus.OK);
		
		return response;
	}
	
}
