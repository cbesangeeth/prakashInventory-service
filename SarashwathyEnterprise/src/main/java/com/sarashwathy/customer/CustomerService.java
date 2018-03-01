/**
 * 
 */
package com.sarashwathy.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sangeeth
 *
 */

@Service // marks as service class
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	private List<CustomerTO> customers = new ArrayList(
			Arrays.asList(new CustomerTO("1", "Sangeeth", "Coimbatore", "9043991363", "cbe.sangeeth@gmail.com"),
					new CustomerTO("2", "Praveen", "Chennai", "9084904933", "kgnobel20@gmail.com")));

	
	public List<CustomerTO> getAllCustomers() {
//		return customers;
		return customerRepository.findAll();
	}

	
	public CustomerTO getCustomers(String id) {
//		return customers.stream().filter(c -> c.getCustomerId().equals(id)).findFirst().get();
		return customerRepository.findOne(id);

	}

	
	public void addCustomer(CustomerTO customer) {
//		customers.add(customer);
		customerRepository.save(customer);
		
	}

	public void updateCustomer(CustomerTO customer) {
		/*for (int i = 0; i < customers.size(); i++) {
			CustomerTO c = customers.get(i);
			if (c.getCustomerId().equals(id)) {
				customers.set(i, customer);
				return;
			}
		}*/
		customerRepository.save(customer);
	}


	
	public void deleteCustomer(String id) {
//		customers.removeIf(c -> c.getCustomerId().equals(id));
		customerRepository.delete(id);
	}

	

}
