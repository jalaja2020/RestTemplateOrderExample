package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.Orders;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@GetMapping("")
	public List<Orders> getAll() {

		System.out.println("from order controller ===============>>");

		List<Orders> orders = new ArrayList<>();

		Orders order = new Orders();
		order.setId(101);
		order.setDescription("desc1");
		orders.add(order);

		order = new Orders();
		order.setId(102);
		order.setDescription("desc2");
		orders.add(order);

		return orders;
	}
	@GetMapping("/{userId}")
	public List<Orders> getAllById(@PathVariable String userId) {

		System.out.println("from order controller ===============>>" + userId);

		List<Orders> orders = new ArrayList<>();

		Orders order = new Orders();
		order.setId(103);
		order.setDescription("desc3");
		orders.add(order);

		order = new Orders();
		order.setId(104);
		order.setDescription("desc4");
		orders.add(order);

		return orders;
	}
	
	@GetMapping("/byparam")
	public List<Orders> getAllByReqParam(@RequestParam String userId) {

		System.out.println("from order controller ===============>>" + userId);

		List<Orders> orders = new ArrayList<>();

		Orders order = new Orders();
		order.setId(105);
		order.setDescription("desc5");
		orders.add(order);

		order = new Orders();
		order.setId(106);
		order.setDescription("desc6");
		orders.add(order);

		return orders;
	}
	
	@PostMapping("/byparam")
	public List<Orders> getAllByPostReqParam() {
		System.out.println("from order controller ===============>>");
		List<Orders> orders = new ArrayList<>();
		Orders order = new Orders();
		order.setId(107);
		order.setDescription("desc7");
		orders.add(order);
		order = new Orders();
		order.setId(108);
		order.setDescription("desc8");
		orders.add(order);

		return orders;
	}
	@PostMapping("/bybody")
	public Orders getAllByPostReqBody(@RequestBody Orders order) {

		System.out.println("from order controller ===============>>");

		order.setDescription(order.getDescription()+ "updated");

		return order;
	}
	
	
}
