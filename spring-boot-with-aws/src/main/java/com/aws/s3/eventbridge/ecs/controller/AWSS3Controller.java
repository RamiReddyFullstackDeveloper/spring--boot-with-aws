package com.aws.s3.eventbridge.ecs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.s3.eventbridge.ecs.util.EmployeeUtil;


import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/s3")
public class AWSS3Controller {
	
	@Value("${employee.name}")
	private String name;
	
	
	@GetMapping("/emp/{pathName}")
	public ResponseEntity<Object> getEmployee(@PathVariable String pathName) {
		return  ResponseEntity.status(HttpStatus.OK).body(EmployeeUtil.getEmp(pathName));
	}

	@GetMapping("/emp/name")
	public ResponseEntity<String> getName(){
		return ResponseEntity.status(200).body(name);
	}

	@Value("${read.env.value.from.ecs.task}")
	String bucketName;

	@GetMapping("emp/ecs")
	public ResponseEntity<String> getBucketNameFromECSTask(){
		return ResponseEntity.status(200).body(bucketName);
	}

}
