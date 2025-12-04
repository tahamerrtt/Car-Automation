package com.taha.carrental.model;

public class Rental {
	private int carid;
	private int customerid;
	private String datestart;
	private String enddate;
	private double totalprice;
	private int rentid;
	
	public Rental() {
	}

	public Rental(int carid, int customerid, String datestart, String enddate, double totalprice, int rentid) {
		super();
		this.carid = carid;
		this.customerid = customerid;
		this.datestart = datestart;
		this.enddate = enddate;
		this.totalprice = totalprice;
		this.rentid = rentid;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getDatestart() {
		return datestart;
	}

	public void setDatestart(String datestart) {
		this.datestart = datestart;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public int getRentid() {
		return rentid;
	}

	public void setRentid(int rentid) {
		this.rentid = rentid;
	}
	
    @Override
    public String toString() {
        return "Rental ID: " + rentid +
               ", Car ID: " + carid +
               ", Customer ID: " + customerid +
               ", Start: " + datestart +
               ", End: " + enddate +
               ", Total Price: " + totalprice;
    }
	
	
	
	

}
