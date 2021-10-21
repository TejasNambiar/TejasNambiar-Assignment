package com.SipringCore.Assignment8_9_10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment8910Application {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		context.registerShutdownHook();
		Question_9 q9 = (Question_9) context.getBean("s1");
		System.out.println(q9);

		Question_8_10 stu3 = (Question_8_10) context.getBean("s3");
		System.out.println(stu3);

		context.close();
	}

}
