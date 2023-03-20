package com.adanedhel.hafta02.gun05;

import java.util.Scanner;

public class IciceFor3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("Sayi giriniz: ");
//		int sayi = input.nextInt();
		//int sonuc;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				
				int sonuc = i * j;			
				System.out.println(i + "*" + j + "=" + sonuc);							
			}
			System.out.println("*******");
			
		}
		input.close();
	}

}
