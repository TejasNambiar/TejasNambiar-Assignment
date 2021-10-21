package com.SipringCore.Assignment3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
//		SpringApplication.run(Assignment3Application.class, args);

		@SuppressWarnings("resource")
		ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
		BankAccountController contr = (BankAccountController) con.getBean("controller");

		System.out.println("---------------------------------------------");
		System.out.println("Total Balance of accountid:125");
		System.out.println(contr.getBalance(125));
		System.out.println("---------------------------------------------");

		System.out.println("Total Balance of accountid:450");
		System.out.println(contr.getBalance(450));
		System.out.println("---------------------------------------------");

		System.out.println("Total Balance of accountid:965");
		System.out.println(contr.getBalance(965));
		System.out.println("---------------------------------------------");

		System.out.println("Total Balance of accountid:450 after withdrawing 500000");
		System.out.println(contr.withdraw(450, 500000));
		System.out.println("---------------------------------------------");

		System.out.println("Total Balance of accountid:450 after depositing 200000");
		System.out.println(contr.deposit(450, 200000));
		System.out.println("---------------------------------------------");

		System.out.println("Fund transfer");
		System.out.println(contr.fundTransfer(125, 965, 2000));
		System.out.println("---------------------------------------------");

		System.out.println("Total Balance of accountid:125 after fund transfer of 2000 to accountid:965");
		System.out.println(contr.getBalance(125));
		System.out.println("---------------------------------------------");

		System.out.println("Total Balance of accountid:965 after fund transfer from accountid:125");
		System.out.println(contr.getBalance(965));
		System.out.println("---------------------------------------------");
	}

}
