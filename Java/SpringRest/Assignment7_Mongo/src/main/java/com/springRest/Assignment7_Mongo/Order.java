package com.springRest.Assignment7_Mongo;

import org.springframework.stereotype.Component;

@Component
public class Order {

	private String id;
	private String name;
	private double price;
	private String description;
	private Long likes;

	public Order() {

	}

	public Order(String name, double price, String description, Long likes) {
		this.likes = likes;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public Long getLikes() {
		return likes;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

}
