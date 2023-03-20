package com.adanedhel.hafta03.gun01;

import java.util.Random;

public class DiziDenemesi {

	public static void main(String[] args) {
		int sayi[] = new int[10];
		Random rand = new Random();
		int toplam = 0;
		int ort = 0;
		for (int i = 0; i < sayi.length; i++) {
			sayi[i] = rand.nextInt(101);
			toplam += sayi[i];
			System.out.println("Elemanlari: "+sayi[i]+" Toplamlari: " + toplam );
		}
		ort += toplam / sayi.length;
		System.out.println("Toplamlari: " + toplam +" Ortalamalari: " + ort);

	}

}
