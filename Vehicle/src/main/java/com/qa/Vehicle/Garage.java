package com.qa.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {

	private List<Vehicle> storage = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vehicle) {
		this.storage.add(vehicle);
	}

	public void removeVehicle(int id) {

		List<Vehicle> list = this.storage.stream().filter(n -> n.getId() == id).collect(Collectors.toList());

		this.storage.removeAll(list);

	}

	public void emptyGarage() {
		this.storage.clear();
	}

	public void showStorage() {
		this.storage.stream().forEach(System.out::println);
	}

	public void billVehicle() {

		int total = 0;

		for (Vehicle vehicle : storage) {
			if (vehicle instanceof Car) {
				total = vehicle.getMileage() * ((Car) vehicle).getWeight();
				System.out.println("Brand: " + vehicle.getBrand() + ", Bill: £" + total);
			} else if (vehicle instanceof Motorcycle) {
				total = vehicle.getMileage() * ((Motorcycle) vehicle).getSpeed();
				System.out.println("Brand: " + vehicle.getBrand() + ", Bill: £" + total);
			} else if (vehicle instanceof Aeroplane) {
				total = vehicle.getMileage() * ((Aeroplane) vehicle).getNumberOfSeats();
				System.out.println("Brand: " + vehicle.getBrand() + ", Bill: £" + total);
			}

		}
	}
}
