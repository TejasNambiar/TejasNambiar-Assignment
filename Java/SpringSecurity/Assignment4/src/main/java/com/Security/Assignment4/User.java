package com.Security.Assignment4;

public class User {
	String username;
	String password;
	int failedAttempts;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getFailedAttempts() {
		return failedAttempts;
	}
	public void setFailedAttempts(int failedAttempts) {
		this.failedAttempts = failedAttempts;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", failedAttempts=" + failedAttempts + "]";
	}
	
	
}
