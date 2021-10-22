package com.springRest.Assignment7;

import org.springframework.stereotype.Component;

@Component
public class Orders {

	private int id;
	private String name;
	private double price;
	private String description;
	private Long likes;

	public Orders() {

	}

	public Orders(int id, String name, double price, String description, Long likes) {
		super();
		this.id = id;
		this.likes = likes;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return (long) id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getlikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
