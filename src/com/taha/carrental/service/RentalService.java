package com.taha.carrental.service;
import com.taha.carrental.model.Rental;
import com.taha.carrental.model.Customer;
import com.taha.carrental.dao.RentalDao;
import com.taha.carrental.model.Car;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;





public class RentalService {
	RentalDao rentalDao = new RentalDao();
	
	public int calculateDays(String datestart, String enddate) {
	    return (int) ChronoUnit.DAYS.between(LocalDate.parse(datestart), LocalDate.parse(enddate));
	}
	
	List<Rental> rentals = rentalDao.getRentals();
    
    public Rental rentCar(Car car, Customer customer, String datestart, String enddate) {
    	if (!car.isAvail()) {
    		System.out.println("Can not rent someone using this car!");
			return (null);
		}
    	
    	int days = calculateDays(datestart, enddate);
    	if (days <= 0) {
    		System.out.println("Has to be at least more than 0 day");
    		return null;
			
		}
    	else {
			System.out.println(days+"selected");

			
			
		}
    	
    	double totalprice = car.getPpd() * days;
    	
    	Rental rental = new Rental(car.getId(), customer.getId(), datestart, enddate, totalprice, rentals.size()+1);
    	
    	rentalDao.addRental(rental);
    	car.setAvail(false);
    	return rental;
		
	}
    
    
	public void returncar(Car car) {
		if (car.isAvail()) {
			System.out.println("Already exist no need to return back");
			
		}
		
		else {
			car.setAvail(true);
			System.out.println("Car returned successfully.Available for rent.");
			
		}
	}
    



}
