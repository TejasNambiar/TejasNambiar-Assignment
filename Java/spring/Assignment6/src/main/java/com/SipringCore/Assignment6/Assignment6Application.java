package com.SipringCore.Assignment6;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment6Application {

	static MessageSource messageSource;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		project p = (project) context.getBean("project");
		p.projectInfo();

		messageSource = (MessageSource) context.getBean("messageSource");
		String msg = messageSource.getMessage("message", null, "Hello", null);
		System.out.println(msg);
	}

}
