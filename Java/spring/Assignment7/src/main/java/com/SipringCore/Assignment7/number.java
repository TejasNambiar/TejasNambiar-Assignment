package com.SipringCore.Assignment7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @component tells its a bean
 * @PropertySource to define the class path and
 * @Value to inject values
 */
@Component
@PropertySource("classpath:application.properties")
public class number {

	@Value("${x.value}")
	private int x;
	@Value("200")
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "number [x=" + x + ", y=" + y + "]";
	}

}
