package com.springRest.Assignment7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	Orderservice orderservice;

	@RequestMapping("/orders")
	public List<Orders> getOrders() {
		return orderservice.getAllOrders();

	}

	@RequestMapping("/orders/{id}")
	public Orders getOrders(@PathVariable Long id) {
		return orderservice.getOrders(id);

	}

	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public Orders addOrders(@RequestBody Orders order) {
		return orderservice.addOrders(order);
	}

	@RequestMapping(value = "/orders", method = RequestMethod.PUT)
	public Orders updateOrders(@RequestBody Orders order) {
		return orderservice.updateOrders(order);
	}

	@RequestMapping(value = "/orders/{id}", method = RequestMethod.DELETE)
	public Orders deleteOrders(@PathVariable Long id) {
		return orderservice.deleteOrders(id);
	}

}
