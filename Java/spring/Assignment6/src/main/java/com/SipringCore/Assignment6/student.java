package com.SipringCore.Assignment6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class student {

	@Value("${user.Name}")
	private String name;
	private long regNo;

	public student() {

	}

	public student(String name, long regNo) {
		super();
		this.name = name;
		this.regNo = regNo;

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

	@Override
	public String toString() {
		return "student [name=" + name + ", regNo=" + regNo + "]";
	}

}
