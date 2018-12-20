package com.qa.Vehicle;

public class Motorcycle extends Vehicle {

	private int speed;
	private String typeOfMotorcycle;

	public Motorcycle(int id, int wheels, int mileage, String brand, int speed, String typeOfMotorcycle) {
		super(id, wheels, mileage, brand);
		this.speed = speed;
		this.typeOfMotorcycle = typeOfMotorcycle;

	}

	@Override
	public String toString() {
		return "Motorcycle (ID: " + getId() + ", Brand: " + getBrand() + ",No. Wheels: " + getWheels() + ", Mileage: " + getMileage() + ", Speed: " + speed + ", Type of Motorcycle: " + typeOfMotorcycle + ")";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getTypeOfMotorcycle() {
		return typeOfMotorcycle;
	}

	public void setTypeOfMotorcycle(String typeOfMotorcycle) {
		this.typeOfMotorcycle = typeOfMotorcycle;
	}

}
