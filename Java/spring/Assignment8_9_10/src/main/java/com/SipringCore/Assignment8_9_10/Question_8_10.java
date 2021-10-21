package com.SipringCore.Assignment8_9_10;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Question_8_10 implements ApplicationContextAware {
	private String name;
	private long regNo;
	private String branch;
	private ApplicationContext context = null;

	public Question_8_10() {

	}

	public Question_8_10(String name, long regNo, String branch) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRegNo() {
		return regNo;
	}

	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student3 [name=" + name + ", regNo=" + regNo + ", branch=" + branch + "]";
	}

	/**
	 * The PostConstruct annotation is used on a method that needs to be executed
	 * after dependency injection is done to perform any initialization. This method
	 * must be invoked before the class is put into service. This annotation must be
	 * supported on all classes that support dependency injection.
	 */
	@PostConstruct
	public static void postCont() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("PostConstruct method is called for Student 3 before constructor initialization");
		System.out.println("-------------------------------------------------------------------");
	}

	/**
	 * The PreDestroy annotation is used on a method as a callback notification to
	 * signal that the instance is in the process of being removed by the container.
	 * The method annotated with PreDestroy is typically used to release resources
	 * that it has been holding.
	 */
	@PreDestroy
	public static void preDest() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("PreDestroy method is called for Student 3, i.e student 3 obj about to be destroyed");
		System.out.println("-------------------------------------------------------------------");
	}

	/**
	 * Set the ApplicationContext that this object runs in. Normally this call will
	 * be used to initialize the object.
	 */
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

}
