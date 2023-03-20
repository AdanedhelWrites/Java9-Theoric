package com.adanedhel.hafta03.gun01;

import java.util.Random;

public class DiziGiris {

	public static void main(String[] args) {
		int notlar[] = new int[20];

		Random rand = new Random();
		for (int i = 0; i < notlar.length; i++) {
			notlar[i] = rand.nextInt(101);
			System.out.println((i + 1) + " " + notlar[i]);

		}

	}

}
