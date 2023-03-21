package com.adanedhel.hafta03.gun02;

import java.util.Scanner;

public class SoruDeneniyoruz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi = new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = input.nextInt();// diziye kullanıcıdan alınan elemanları yerleştiriyoruz
		}
		// dizideki elemanları normal yazdırma
		for (int i = 0; i < dizi.length; i++) {
			System.out.println( dizi[i]);
		}
		System.out.println("**************");
		
		// dizideki elemanların yerini değiştirmece
		
		for (int i = 0; i < dizi.length/2; i++) {
			
			int j = dizi[i];
			dizi[i] = dizi[dizi.length-(i+1)];
			dizi[dizi.length-(i+1)]=j;								
			
		}
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		
		System.out.println("******************");
		
		
		// dizideki elemanları tersinden yazdırma
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[dizi.length - i - 1]);

		}
		
		
		input.close();

	}

}
