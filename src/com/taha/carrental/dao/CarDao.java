package com.taha.carrental.dao;
import java.util.ArrayList;
import java.util.List;
import com.taha.carrental.model.Car;

public class CarDao {
	private List<Car> cars = new ArrayList<>();
	int idcounter =1;
	
	
	public List<Car> getCars() {
		return cars;
	}

	public void	addCar(Car car) {
		car.setId(idcounter);   // ID atıyoruz
		cars.add(car);
		idcounter++;
	}
	
	public void	removeCar(Car car) {
		System.out.println(car.getBrand()+" "+ car.getModel()+" " +car.getYear() + " removed." );
		cars.remove(car);
	}
	
	
	
	
	public Car getCarById(int id) {
	    for (Car c : cars) {
	        if (c.getId() == id) {
	            return c;
	        }
	    }
	    return null;
	}
	
	
	
	



}
