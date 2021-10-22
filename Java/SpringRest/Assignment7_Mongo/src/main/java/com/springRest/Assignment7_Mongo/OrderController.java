package com.springRest.Assignment7_Mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@GetMapping("/")
	public List<Order> getAll() {
		return orderService.getAll();
	}

	@PostMapping("/")
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}

	@PutMapping("/")
	public Order updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}

	@DeleteMapping("/{id}")
	public void deleteOrder(@PathVariable String id) {
		orderService.delete(id);
	}

	@GetMapping("/{id}")
	public Object getOrderId(@PathVariable String id) {
		return orderService.getOrderId(id);
	}
}
