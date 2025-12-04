package com.taha.carrental.model;

public class Car {
	private int id ;
	private String brand;
	private String model;
	private int year;
	private double ppd;
	private boolean avail;
	
	
	public Car() {
		
	}
	
	
	public Car(int id, String brand, String model, int year, double ppd, boolean avail) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.ppd = ppd;
		this.avail = avail;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPpd() {
		return ppd;
	}


	public void setPpd(double ppd) {
		this.ppd = ppd;
	}


	public boolean isAvail() {
		return avail;
	}


	public void setAvail(boolean avail) {
		this.avail = avail;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car id: " + id +
			       ", Car brand: " + brand +
			       ", Car model: " + model +
			       ", Car year: " + year +
			       ", Car priceperday: " + ppd +
			       ", Car avail: " + avail;

		
	}
	
	

}
