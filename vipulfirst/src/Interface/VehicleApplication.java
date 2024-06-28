package Interface;

import java.util.*;

interface Vehicle {
	// all are the abstract methods
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {
	int speed;
	int gear;

	// to change the gear
	public void changeGear(int newGear) {
		gear = newGear;
	}

	// to increase the speed
	public void speedUp(int increment) {
		speed = increment;
	}

	// to decrease the speed
	public void applyBrakes(int decrement) {
		speed = decrement;
	}

	public void detailMechanism() {
		System.out.println("Speed: " + speed + " Gear: " + gear);
	}
}

class Bike implements Vehicle {

	int gear;
	int speed;

	// to change the gear
	public void changeGear(int changeGear) {
		gear = changeGear;
	}

	// to increase the speed
	public void speedUp(int increment) {
		speed = increment;
	}

	// to decrease the speed
	public void applyBrakes(int decrement) {
		speed = decrement;
	}

	public void detailMechanism() {
		System.out.println("Speed: " + speed + " Gear: " + gear);
	}
}

public class VehicleApplication {

	public static void main(String[] args) {

		// creating the instance of bicycle
		Scanner xyz = new Scanner(System.in);
		Bicycle bc = new Bicycle();
		bc.changeGear(2);
		bc.speedUp(3);
		bc.applyBrakes(1);

		System.out.println("Bicycle present state : ");
		bc.detailMechanism();

		// creating the instance of bike
		Bike bk = new Bike();
		bk.changeGear(1);
		bk.speedUp(4);
		bk.applyBrakes(3);

		System.out.println("Bike present state : ");
		bk.detailMechanism();
	}

}
