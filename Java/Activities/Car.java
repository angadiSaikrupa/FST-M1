package Activity2;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	Car(String color, String transmission, int tyres, int doors) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;
		this.tyres = 4;
		this.doors = 4;

	}

	public void displayCharactetistics() {
		System.out.println("Color:" + color);
		System.out.println("Transmission type:" + transmission);
		System.out.println("Year of making:" + make);
		System.out.println("No. of tyres:" + tyres);
		System.out.println("No. of doors:" + doors);

	}

	public void accelarate() {
		System.out.println("car is moving forward");
	}

	public void brake() {
		System.out.println("car is stopped");
	}

}
