package mvc.quest6;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



public class Customer {
	
	@NotEmpty(message="User Name cannot be empty")
	@Size(min=8, max=20, message="Please enter User Name between 8 and 20.")
	String username;
	
	@NotEmpty(message="Password cannot be empty")
	@Size(min=8, max=20, message="Please enter password between 8 and 20.")
	String password;
	
	@NotEmpty(message="Email cannot be empty")
	String email;
	
	long contact;
	String city;
	
	@NotEmpty(message="Zipcode cannot be empty")
	@Size(min=6, max=6, message="Please enter zipcode of size 6")
	String zipcode;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	
}
