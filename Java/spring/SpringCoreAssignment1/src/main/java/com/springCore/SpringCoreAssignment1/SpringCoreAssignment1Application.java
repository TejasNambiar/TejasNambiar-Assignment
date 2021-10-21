package com.springCore.SpringCoreAssignment1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreAssignment1Application {

	public static void main(String[] args) {
		// SpringApplication.run(SpringCoreAssignment1Application.class, args);

		@SuppressWarnings("resource")
		ApplicationContext customerContext = new ClassPathXmlApplicationContext("customer.xml");
		Customer customerObject = (Customer) customerContext.getBean("Customer");
		customerObject.CustomerInfo();
	}

}
