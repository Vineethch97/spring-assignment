package com.customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.data.CustomerRepository;
import com.customer.model.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerData;

	@PostMapping(value = "/addNewCustomer")
	public String newEmployee(Customer employee) {

		return String.valueOf(customerData.save(employee));

	}

	
	@GetMapping(value = "/listCustomer")
	public List<Customer> customers() {
		return customerData.findAll();

	}

}
