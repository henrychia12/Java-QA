package com.qa.Vehicle;

public abstract class Vehicle {

	private int wheels;
	private int mileage;
	private String brand;
	private int id;

	public Vehicle(int id, int wheels, int mileage, String brand) {
		this.id = id;
		this.setWheels(wheels);
		this.setMileage(mileage);
		this.brand = brand;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
