package com.adanedhel.hafta04.gun03;

public class Runner {

	public static void main(String[] args) {
		Car araba1 = new Car();
		Car araba2 = new Car();

		// System.out.println(araba1.getInfo());
		// System.out.println(araba2.getInfo());

		araba1.marka = "Mercedes";
		araba1.model = "S450";
		araba1.yil = 2020;
		araba1.hiz = 0;
		araba1.km = 10000;
		System.out.println(araba1.getInfo());

		Motor motor1 = new Motor();
		motor1.setSasiNo("ADNDHL97");
		motor1.getSasiNo();
		motor1.motorHacmi = 1500;
		motor1.beygir = 90;
		motor1.tork = 350;

		araba1.motor = motor1;
		System.out.println("Motor hacmi: " + araba1.motor.motorHacmi);
		araba1.motor.getInfo();

		araba2.marka = "Toyota";
		araba2.model = "Corolla";
		System.out.println(araba2.getInfo());

		araba1 = araba2;
		System.out.println(araba1.marka);
		System.out.println(araba2.marka);
		araba2.marka = "Volkswagen";
		System.out.println(araba1.marka);
		System.out.println(araba2.marka);

		Car araba4 = new Car("Mazda", "G3");
		System.out.println(araba4.getInfo());

		Car araba5 = new Car("Hyundai", "i20", 2012, 120000, motor1);
		System.out.println(araba5.getInfo());
		araba5.motor.getInfo();

	}

}
