package com.aws.s3.eventbridge.ecs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.s3.eventbridge.ecs.util.EmployeeUtil;

@RestController
@RequestMapping("/s3")
public class AWSS3Controller {
	
	
	
	@GetMapping("/emp")
	public ResponseEntity<Object> getEmployee() {
		return  ResponseEntity.status(HttpStatus.OK).body(EmployeeUtil.getEmp());
	}

}
