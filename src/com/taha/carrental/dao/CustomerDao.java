package com.taha.carrental.dao;
import java.util.ArrayList;
import java.util.List;
import com.taha.carrental.model.Customer;

public class CustomerDao {
	private List<Customer> customers = new ArrayList<>();
	int idcounter =1;
	
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		customer.setId(idcounter);
		customers.add(customer);
		idcounter++;
		
	}
	
	public void removeCustomer(Customer customer) {
		customers.remove(customer);
		
	}
	
	public Customer getCustomerById(int id) {
	    for (Customer c : customers) {
	        if (c.getId() == id) {
	            return c;
	        }
	    }
	    return null;
	}


	
	
	

}
