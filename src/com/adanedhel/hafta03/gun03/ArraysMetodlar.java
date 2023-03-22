package com.adanedhel.hafta03.gun03;

import java.util.Arrays;

public class ArraysMetodlar {

	public static void main(String[] args) {
		int[] sayilar = { 5, 1, 3, 2, 4 };
		String[] iller = { "Ankara", "Kars", "Izmir", "Konya" };
		// Diziyi sirali hale getirme.
		Arrays.sort(sayilar);
		for (int i = 0; i < sayilar.length; i++) {
			System.out.println(sayilar[i] + " ");
		}
		Arrays.sort(iller);
		for (int i = 0; i < iller.length; i++) {
			System.out.println(iller[i] + " ");
		}

		// Eleman arama metodu
		int index = Arrays.binarySearch(sayilar, 2);
		if (index >= 0) {

			System.out.println("Eleman dizide bulundu");
		} else {
			System.out.println("Eleman dizide yok");
		}
		// Dizileri karşılaştırma.
		int[] array1 = { 0, 1, 2 };
		int[] array2 = { 0, 1, 2 };
		boolean esitMi = Arrays.equals(array1, array2);
		System.out.println(esitMi);

		// Diziyi doldurma..
		int[] array3 = new int[10];
		Arrays.fill(array3, 5);
		System.out.println(Arrays.toString(array3));

		// Dizide baştan belirli elaman sayısın bir kısmı kopyalama..
		int[] sayilar2 = { 5, 1, 3, 2, 4 };
		int[] sayilar2Copy = Arrays.copyOf(sayilar2, 4);
		System.out.println(Arrays.toString(sayilar2Copy));
		// Diziden belirli bir aralıkta elemanları kopyalama..
		int[] sayilar3 = { 5, 1, 3, 2, 4 };
		int[] sayilar3Copy = Arrays.copyOfRange(sayilar3, 2, 4);
		System.out.println(Arrays.toString(sayilar3Copy));
		
		int[] sayilar4 = { 5, 1, 3, 2, 4 };
		int toplam = Arrays.stream(sayilar4).sum();
		System.out.println(Arrays.stream(sayilar4).average());
		System.out.println(toplam);
	}

}
