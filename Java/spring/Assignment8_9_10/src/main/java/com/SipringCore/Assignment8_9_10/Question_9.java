package com.SipringCore.Assignment8_9_10;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Question_9 implements InitializingBean, DisposableBean {
	private String name;
	private long regNo;
	private String branch;

	public Question_9() {

	}

	public Question_9(String name, long regNo, String branch) {
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
		return "Student [name=" + name + ", regNo=" + regNo + ", branch=" + branch + "]";
	}

	public void init() throws Exception {
		System.out.println("MyInit method is called for Student 2");
	}

	/**
	 * This method allows the bean instance to perform validation of its overall
	 * configuration and final initialization when all bean properties have been
	 * set.
	 */
	public void afterPropertiesSet() throws Exception {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("InitializingBean method is called for Student 1 Bean, i.e student 1 bean obj created");
		System.out.println("-------------------------------------------------------------------");
	}

	/**
	 * Invoked by the containing BeanFactory on destruction of a bean.
	 */
	public void destroy() throws Exception {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("DisposableBean Method is called for Student 1 Bean, i.e student 1 obj destroyed");
		System.out.println("-------------------------------------------------------------------");
	}

}