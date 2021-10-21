package com.SipringCore.Assignment3;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class Assignment3ApplicationTests {

	BankAccountController controller;

	@BeforeEach
	private void onIntit() {
		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		controller = (BankAccountController) con.getBean("controller");
	}

	@Test
	void contextLoads() {
		double expectedBalance = 1697000.0, expectedWithdrawBalance = 8000000.0;
		assertAll(() -> {
			assertEquals(expectedBalance, controller.getBalance(125));
			assertEquals(expectedWithdrawBalance, controller.withdraw(450, 500000));
		});

	}

}
