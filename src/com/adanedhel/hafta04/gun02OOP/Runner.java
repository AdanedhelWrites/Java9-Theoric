package com.adanedhel.hafta04.gun02OOP;

public class Runner {
	
	public static void main(String[] args) {
		Car araba1 = new Car();
		Car araba2 = new Car();
		
		//System.out.println(araba1.getInfo());
		//System.out.println(araba2.getInfo());
		
		araba1.marka="Mercedes";
		araba1.model="S450";
		araba1.yil=2020;
		araba1.hiz=0;
		araba1.km=10000;
		System.out.println(araba1.getInfo());
		
		
		araba2.marka = "Toyota";
		araba2.model = "Corolla";
		System.out.println(araba2.getInfo());
		
		araba1 = araba2;
		System.out.println(araba1.marka);
		System.out.println(araba2.marka);
		araba2.marka = "Volkswagen";
		System.out.println(araba1.marka);
		System.out.println(araba2.marka);
		
	}
	
	
}
