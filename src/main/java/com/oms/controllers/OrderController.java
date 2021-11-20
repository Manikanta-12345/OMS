package com.oms.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.dto.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@PostMapping(value = "/placeOrder")
	public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
		String orderId = UUID.randomUUID().toString();
		order.setOrderId(orderId);
		return new ResponseEntity<Order>(order, HttpStatus.CREATED);
	}
	@GetMapping(value = "/orderslist")
	public ResponseEntity<Order> getOrders() {
		String orderId = UUID.randomUUID().toString();
		Order order=new Order();
		order.setOrderId(orderId);
		order.setItemName("DOLO-650");
		order.setItemPrice(500);
		order.setQuantity(2);
		return new ResponseEntity<Order>(order, HttpStatus.CREATED);
	}
}
