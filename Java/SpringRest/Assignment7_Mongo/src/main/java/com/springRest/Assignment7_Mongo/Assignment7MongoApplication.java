package com.springRest.Assignment7_Mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment7MongoApplication implements CommandLineRunner {

	@Autowired
	OrderRepository orderRepository;

	public static void main(String[] args) {
		SpringApplication.run(Assignment7MongoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Order> list = new ArrayList<Order>();
		list.add(new Order("Apple", 20, "Good", 60000L));
		list.add(new Order("Banana", 30, "Healthy", 78000L));
		list.add(new Order("carrot", 15, "Good", 80000L));
		list.add(new Order("dragonfruit", 50, "Healthy", 98000L));

		orderRepository.insert(list);

	}

}
