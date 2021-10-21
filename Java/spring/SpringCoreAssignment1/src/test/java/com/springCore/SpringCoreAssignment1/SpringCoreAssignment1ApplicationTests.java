package com.springCore.SpringCoreAssignment1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringCoreAssignment1ApplicationTests {

	Customer customer;
	Address address;

	@BeforeEach
	private void init() {

		@SuppressWarnings("resource")
		ApplicationContext customerContext = new ClassPathXmlApplicationContext("customer.xml");
		customer = (Customer) customerContext.getBean("Customer");

	}

	@Test
	void contextLoads() {
		String expected = "Customer [customerId=101, customerName=Naveen, customerContact=96185777, address=Address [street=Edururu, city=Anantapur, state=Andhra Pradesh, country=India, zip=515775]]";
		assertEquals(expected, customer.toString());
	}

}
