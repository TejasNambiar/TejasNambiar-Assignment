package com.springRest.Assignment5;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Long,Employee> employees=new HashMap<>();
	public static Map<Long,Employee> getEmployees(){
		return employees;
	}
	

}