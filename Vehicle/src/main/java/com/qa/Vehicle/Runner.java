package com.qa.Vehicle;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car lambo = new Car(1, 4, 256, "Lambo", "Yellow", "Huracan", 60);
		Car ferrari = new Car(2, 4, 4321, "Ferrari", "Black", "812", 55);
		Motorcycle honda = new Motorcycle(3, 2, 1654, "Honda", 180, "Sports Bike");
		Aeroplane jet = new Aeroplane(4, 6, 3212, "Lufthansa", 20, 20);
		Aeroplane jumbo = new Aeroplane(5, 10, 4365, "Cathay Pacific", 300, 300);

		Garage store = new Garage();

		store.addVehicle(jumbo);
		store.addVehicle(jet);
		store.addVehicle(honda);
		store.addVehicle(ferrari);
		store.addVehicle(lambo);

		//store.showStorage();
		//store.billVehicle();
		store.removeVehicle(2);
		store.showStorage();
	}

}
