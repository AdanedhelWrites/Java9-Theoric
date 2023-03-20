package com.adanedhel.hafta02.gun05;

import java.util.Scanner;
public class IciceFor {

	public static void main(String[] args) {
		//*'lar ile dikdörtgen oluştur
		Scanner input = new Scanner(System.in);
		int satir,sutun;
		char karakter ='*';
		System.out.println("Satir sayisi giriniz: ");
		satir=input.nextInt();
		System.out.println("Sutun sayisi giriniz: ");
		sutun=input.nextInt();
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				
				System.out.print(karakter);
			}
			System.out.println();
			
		}
		// TODO Auto-generated method stub
		input.close();
	}

}
