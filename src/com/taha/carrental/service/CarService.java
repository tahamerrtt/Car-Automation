package com.taha.carrental.service;
import com.taha.carrental.dao.CarDao;
import com.taha.carrental.model.Car;
import java.util.List;

public class CarService {
	CarDao carDao = new CarDao();



	
	public void	addCar(Car car) {
		carDao.addCar(car);
		System.out.println(car.getBrand()+" "+ car.getModel()+" " +car.getYear() + " added." );
	}
	public void	removeCar(Car car) {
		System.out.println(car.getBrand()+" "+ car.getModel()+" " +car.getYear() + " removed." );
		carDao.removeCar(car);
	}
	
	public void listCars() {
	    List<Car> list = carDao.getCars();

	    if (list.isEmpty()) {
	        System.out.println("No cars found.");
	        return;
	    }

	    for (Car c : list) {
	        System.out.println(c);
	    }
	}

			
		

	public Car getCarById(int id) {
		return carDao.getCarById(id);
	}
	


	
	
	
}
