package com.qa.Vehicle;

public class Aeroplane extends Vehicle {

	private int numberOfSeats;
	private int numberOfParachutes;

	public Aeroplane(int id, int wheels, int mileage, String brand, int numberOfSeats, int numberOfParachutes) {
		super(id, wheels, mileage, brand);
		this.numberOfSeats = numberOfSeats;
		this.numberOfParachutes = numberOfParachutes;
	}

	@Override
	public String toString() {
		return "Aeroplane (ID: " + getId() + ", Brand: " + getBrand() + ", No. Wheels: \" + getWheels() + \", Mileage: \" + getMileage() + \", No. of Seats: " + numberOfSeats + ", No. of Parachutes: " + numberOfParachutes + "]";
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfParachutes() {
		return numberOfParachutes;
	}

	public void setNumberOfParachutes(int numberOfParachutes) {
		this.numberOfParachutes = numberOfParachutes;
	}

}
