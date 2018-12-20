package com.qa.Vehicle;

public class Car extends Vehicle {

	private String colour;
	private String model;
	private int weight;

	public Car(int id, int wheels, int mileage, String brand, String colour, String model, int weight) {
		
		super(id, wheels, mileage, brand);
		this.colour = colour;
		this.model = model;
		this.weight = weight;
	}

		// TODO Auto-generated constructor stub

	@Override
	public String toString() {
		return "Car(ID: " + getId() + ", Brand: " + getBrand() + ", No. Wheels: " + getWheels() + ", Mileage: " + getMileage() + ", Colour: " + colour + ", Model: " + model + ", Weight: " + weight + ")";
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
