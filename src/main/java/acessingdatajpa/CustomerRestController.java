package acessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CustomerRestController {

	@Autowired
	private CustomerRepository repository;

	//@GetMapping("/customers")
	public Iterable<Customer> getCustomers() {
		Iterable<Customer> lista = repository.findAll(); 
		return lista; 
	}	
}