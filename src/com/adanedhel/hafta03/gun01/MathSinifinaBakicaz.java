package com.adanedhel.hafta03.gun01;

import java.util.Random;

public class MathSinifinaBakicaz {

	public static void main(String[] args) {
		Random rand = new Random();
		int sayi = rand.nextInt(101);//0dan 100 dahil'e kadar sayı üretir rastgele JAVA
		System.out.println(sayi);
	
		//zar 1-6
		
		
		for (int i = 0; i <100; i++) {
			System.out.println(rand.nextInt(1, 7));
			
		}
	}

}
