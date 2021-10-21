package com.springCore.SpringCoreAssignment1;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address address;

	public Customer() {
	}

	public Customer(int customerId, String customerName, long customerContact, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.address = address;
	}

	public void CustomerInfo() {
		System.out.println("Customer Information:\nCustomer Id: " + getCustomerId() + "\nCustomer Name: "
				+ getCustomerName() + "\nCustomer Contact: " + getCustomerContact() + "\nCustomer Address: "
				+ getAddress().getStreet() + "," + getAddress().getCity() + "," + getAddress().getState() + ","
				+ getAddress().getCountry() + "-" + getAddress().getZip());
	}

	int getCustomerId() {
		return customerId;
	}

	String getCustomerName() {
		return customerName;
	}

	long getCustomerContact() {
		return customerContact;
	}

	Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", address=" + address + "]";
	}

}
