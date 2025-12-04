package com.taha.carrental.service;
import java.util.List;
import com.taha.carrental.dao.CustomerDao;
import com.taha.carrental.model.Customer;


public class CustomerService {
	CustomerDao customerDao = new CustomerDao();
	
	
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
		System.out.println("Customer added:");
		
	}
	
	public void removeCustomer(Customer customer) {
		customerDao.removeCustomer(customer);
		System.out.println("Customer removed");
		
	}
	
	public void listCustomers() {
		List<Customer> list = customerDao.getCustomers();
	    if (list.isEmpty()) {
	        System.out.println("No customers found.");
	        return;
	    }

	    for (Customer c : list) {
	        System.out.println(c);
	    }
	}

		
	
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}


	
	
	

}
