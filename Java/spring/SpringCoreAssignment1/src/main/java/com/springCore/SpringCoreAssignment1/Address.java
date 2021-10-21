package com.springCore.SpringCoreAssignment1;

public class Address {
	private String street;
	private String city;
	private String state;
	private String country;
	private int zip;

	public Address(String street, String city, String state, String country, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	String getStreet() {
		return street;
	}

	String getCity() {
		return city;
	}

	String getState() {
		return state;
	}

	String getCountry() {
		return country;
	}

	int getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + ", zip="
				+ zip + "]";
	}

}
