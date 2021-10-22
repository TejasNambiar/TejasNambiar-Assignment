package com.springRest.Assignment7;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Long,Orders> orders=new HashMap<>();
	public static Map<Long,Orders> getOrders(){
		return orders;
	}
	

}
