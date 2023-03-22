package com.adanedhel.hafta03.gun03;

import java.util.Scanner;

public class ArraySinifListesiOrnek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secim;
		int sinifMevcudu = 0;
		do {
		System.out.println("*******************************");
		System.out.println("******OKUL OTOMASYONU**********");
		System.out.println("*******************************");
		System.out.println("1-Sınıf Tanımla");
		System.out.println("2-Öğrencileri Tanımla");
		System.out.println("3-Sınıf Listele");
		System.out.println("4-Not Ver");
		System.out.println("5-Notları Listele");
		System.out.println("0-Çıkış");
		
		
		System.out.println("Seçiminizi Giriniz: ");
		secim = input.nextInt();input.nextLine();
		switch (secim) {
		case 1:
			System.out.println("*******************************");
			System.out.println("********SINIF TANIMLA**********");
			System.out.println("*******************************");
			System.out.println("Sınıf mevcudunu giriniz: ");
			sinifMevcudu = input.nextInt();input.nextLine();//nextInt kullandıgın herşeyin sonunda input.nextLine();
			String [] sinifListesi = new String[sinifMevcudu];
			break;
		case 2:
			System.out.println("*******************************");
			System.out.println("*******ÖĞRENCİ TANIMLA*********");
			System.out.println("*******************************");
			break;
		case 3:
			System.out.println("*******************************");
			System.out.println("***********NOT VER*************");
			System.out.println("*******************************");
			break;
		case 4:
			System.out.println("*******************************");
			System.out.println("*********NOT LİSTELE***********");
			System.out.println("*******************************");
			break;
			
		case 0:
			System.out.println("PROGRAMDAN ÇIKIŞ YAPILDI.");
			break;
		default:
			break;
		}
		}while(secim!=0);

	}

}
