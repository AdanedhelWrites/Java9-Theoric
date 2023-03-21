package com.adanedhel.hafta03.gun02;
import java.util.Scanner;
public class Soru2Deneniyoruz {

	public static void main(String[] args) {
		//Dizideki eleman sayısını ve dizideki elemanları kullanıcıdan alınız..
		//Dizideki en büyük elemanı bulan ve bulundugu indexi yazdır..
		Scanner input = new Scanner(System.in);
		System.out.println("Kac elemanli dizi oldugunu belirleyiniz: ");
		int a = input.nextInt();
		int dizi[] = new int[a];
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Dizideki elemanları giriniz: ");
			dizi[i] = input.nextInt();
						
		}
		int min =  dizi[0];
		int max = dizi[0];
		int indexi = 0;
		int minIndexi = 0;
		for (int i = 0; i < dizi.length; i++) {			
			if (max<=dizi[i]) {
				indexi = i;
				max=dizi[i];
				
			}
			//en kucuk sayıyıda bulunuz
			if (min >= dizi[i]) {
				minIndexi = i;
				min=dizi[i];
				
			}
		}
		System.out.println("Max: "+ max + "\nMax Indexi: " + indexi + "\nMin: " + min + "\nMin Indexi: " + minIndexi);
		
		input.close();
	}

}
