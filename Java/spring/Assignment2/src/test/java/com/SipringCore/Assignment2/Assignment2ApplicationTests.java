package com.SipringCore.Assignment2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Assignment2ApplicationTests {

	questions questionObject;

	@BeforeEach
	private void init() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("customer.xml");
		questionObject = (questions) context.getBean("questions");
		System.out.println("list:\n" + questionObject.getL().get(0));
		System.out.println("set:\n" + questionObject.getS().toString());
		System.out.println("map:\n" + questionObject.getM().get(1));
	}

	@Test
	void contextLoads() {
		assertTrue(true);
		String expectedList = "Y.S.Jagan(2019-present)";
		String expectedMap = "RajaMouli";
		String expectedSet = "[Y.S.Jagan(2019-prasent), N.Chandra Babu Naidu(2014-2019), N.Kiran kumar Reddy(2010-2014)]";
		String givenValue = questionObject.getS().toString();
		assertAll(() -> {
			assertEquals(expectedList, questionObject.getL().get(0).toString());
			assertEquals(expectedMap, questionObject.getM().get(1).toString());
			assertEquals(expectedSet, givenValue);
		});
	}

}
