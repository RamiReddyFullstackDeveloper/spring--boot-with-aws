package com.aws.s3.eventbridge.ecs.util;

import com.aws.s3.eventbridge.ecs.model.Employee;

public class EmployeeUtil {
	
	public static Employee getEmp(String name) {
		
		return new Employee(name, "7396126247", "02-07-1991", "Module Lead");
	}

}
