package com.adanedhel.hafta02.gun05;

import java.util.Scanner;

public class IciceFor2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int satir;
		char karakter = '*';
		System.out.println("Satir sayisi giriniz: ");
		satir = input.nextInt();
//		System.out.println("Sutun sayisi giriniz: ");
//		sutun = input.nextInt();

		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(karakter);

			}
			System.out.println();

		}
		input.close();

	}

}
