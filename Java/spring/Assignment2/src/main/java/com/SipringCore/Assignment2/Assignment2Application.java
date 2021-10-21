package com.SipringCore.Assignment2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) {
//		SpringApplication.run(Assignment2Application.class, args);

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		questions questionObject = (questions) context.getBean("questions");
		questionObject.displayList();
		questionObject.displaySet();
		questionObject.displayMap();
	}

}
