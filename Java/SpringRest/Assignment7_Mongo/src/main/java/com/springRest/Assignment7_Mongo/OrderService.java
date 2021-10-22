package com.springRest.Assignment7_Mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public List<Order> getAll() {
		return orderRepository.findAll();
	}

	public Order addOrder(Order order) {
		return orderRepository.insert(order);
	}

	public Order updateOrder(Order order) {
		return orderRepository.save(order);
	}

	public void delete(String id) {
		orderRepository.deleteById(id);
	}

	public Object getOrderId(String id) {
		return orderRepository.findById(id);
	}
}
