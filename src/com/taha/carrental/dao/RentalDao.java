package com.taha.carrental.dao;

import java.util.ArrayList;
import java.util.List;

import com.taha.carrental.model.Rental;

public class RentalDao {
	private List <Rental> rentals = new ArrayList<>();

	public List<Rental> getRentals() {
		return rentals;
	}
	
	public void addRental(Rental rental) {
		rentals.add(rental);	
	}
	

}
