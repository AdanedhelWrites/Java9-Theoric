package com.adanedhel.hafta03.gun03;

public class TekrarEdenElemanSilmeDizi {

	public static void main(String[] args) {
		int[] dizi = { 20, 19, 20, 40, 3, 40, 5, 3, 7, 3 };
		int[] dizi2;
		int dizi2Uzunluk = dizi.length;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					dizi2Uzunluk--;
					break;
				}
			}
		}
		dizi2 = new int[dizi2Uzunluk];
		dizi2[0] = dizi[0];
		boolean esitMi = false;
		int sayac = 0;
		for (int i = 0; i < dizi.length; i++) {
			esitMi=false;
			for (int j = 0; j < dizi2.length; j++) {
				if (dizi[i] == dizi2[j]) {
					esitMi = true;
				}
			}
			if (!esitMi) {
				sayac++;
				dizi2[sayac] = dizi[i];
				
			}
			
		}
		for (int i = 0; i < dizi2.length; i++) {
			System.out.print(dizi2[i] + " ");
		}
				
		System.out.println(dizi2Uzunluk);
	}

}
