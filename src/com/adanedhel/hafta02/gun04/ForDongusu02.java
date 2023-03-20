package com.adanedhel.hafta02.gun04;

import java.util.Scanner;

public class ForDongusu02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int a = input.nextInt();
		int top = 0;
		for (int i = 1; i <= a; i++) {
			top += i;

		}
		System.out.println("Toplam " + top);
		// TODO Auto-generated method stub
		input.close();
	}

}
