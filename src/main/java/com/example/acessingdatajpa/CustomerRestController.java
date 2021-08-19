package com.example.acessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class CustomerRestController {

	@Autowired
	private CustomerRepository repository;

	@GetMapping
	public Iterable<Customer> getCustomers() {
		Iterable<Customer> lista = repository.findAll(); 
		return lista; 
	}	
}