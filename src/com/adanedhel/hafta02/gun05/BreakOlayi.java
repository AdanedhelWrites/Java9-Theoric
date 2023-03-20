package com.adanedhel.hafta02.gun05;

public class BreakOlayi {

	public static void main(String[] args) {
		// break döngüyü sonlandırır , kırar. switch,for,while,dowhile
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("********");
		int i = 1;
		while (i <= 10) {
			if (i == 5)
				break;
			System.out.println(i);
			i++;
		}
		int gun = 2; //burasi kacsa o degere gidicek.. Bunu kullanicidan isteyebiliriz.
		switch (gun) {
		case 1: {
			System.out.println("Pazartesi");
			break;

		}
		case 2: {
			System.out.println("Sali");
			break;
		}
		default:
			System.out.println("Gunsuzluk");

		}
		disDongu:
		for (int j = 0; j < 3; j++) {
			for (int j2 = 0; j2 < 2; j2++) {
				if(j == 1 && j2 == 1) {
					break disDongu;
				}
				System.out.println(j+ " "+ j2);
				
			}
			
		}

	}

}
