/**
 * =========================================
 * Date			Author 		Description 		
 * ========================================
 * 20-11-2017	Sangeeth	Inital creation
 */
package com.sarashwathy.customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sangeeth Kumar
 * 
 * This is the controller for customer object
 *
 */

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	/**
	 * Returns list of all customers from the collection
	 * 
	 * @return List 
	 */
	@RequestMapping("/customers")
	public List<CustomerTO> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@RequestMapping("/customers/{id}")
	public CustomerTO getCustomers(@PathVariable String id){
		return customerService.getCustomers(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/customers")
	public void addCustomer(@RequestBody CustomerTO customer){
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	public void updateCustomer(@PathVariable String id,@RequestBody CustomerTO customer){
		customerService.updateCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void deleteCustomers(@PathVariable String id){
	 customerService.deleteCustomer(id);
	}
}
