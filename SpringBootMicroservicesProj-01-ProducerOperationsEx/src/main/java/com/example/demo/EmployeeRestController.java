package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(){
		ResponseEntity<String> response=
		        new ResponseEntity<String>("FROM SAVE POST",HttpStatus.OK);
		return response;
		
	}
	@GetMapping("/find")
	public ResponseEntity<String> fetchOneEmployee(){
		ResponseEntity<String> response=
		        new ResponseEntity<String>("FROM FETCH",HttpStatus.OK);
		return response;
		
	}
	 @PutMapping("/modify")
	public ResponseEntity<String> updateEmployee(){
		ResponseEntity<String> response=
		        new ResponseEntity<String>("FROM UPDATE",HttpStatus.OK);
		return response;
		
	}
	@PatchMapping("/Email")
	public ResponseEntity<String> updateEmployeeEmail(){
		ResponseEntity<String> response=
		        new ResponseEntity<String>("FROM PATCH",HttpStatus.OK);
		return response;
		
	}
	@DeleteMapping("/remove")
	public ResponseEntity<String> removeEmployee(){
		ResponseEntity<String> response=
		        new ResponseEntity<String>("FROM DELETS",HttpStatus.OK);
		return response;
		
	}

}
