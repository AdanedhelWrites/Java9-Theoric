package com.adanedhel.hafta03.gun04;

import java.util.Scanner;

public class ArraySinifListesiOrnek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secim;
		String[] sinifListesi = null;
		int [] matNotlar = null;
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
			sinifListesi = new String[sinifMevcudu];
			break;
		case 2:
			System.out.println("*******************************");
			System.out.println("*******ÖĞRENCİ TANIMLA*********");
			System.out.println("*******************************");
			for (int i = 0; i < sinifListesi.length; i++) {
				System.out.println((i+1)+"Öğrencinin adını giriniz: ");
				sinifListesi[i] = input.nextLine();				
			}
			break;
		case 3:
			System.out.println("*******************************");
			System.out.println("*******SINIF LİSTELE***********");
			System.out.println("*******************************");
			for (int i = 0; i < sinifListesi.length; i++) {
				System.out.println(sinifListesi[i]);								
			}
			System.out.println("Ana menü için ENTER'a bas");
			input.nextLine();			
			break;
		case 4:
			System.out.println("*******************************");
			System.out.println("*********NOT VER***************");
			System.out.println("*******************************");
			matNotlar = new int[sinifMevcudu];
			for (int i = 0; i < matNotlar.length; i++) {
				System.out.println(sinifListesi[i]+"1. notunu Giriniz: ");
				int not1= input.nextInt(); input.nextLine();
				System.out.println(sinifListesi[i]+"2. notunu Giriniz: ");
				if (0 > not1 || 100 < not1) {
					System.out.println("Not girişi 0-100 aralıgı olmalı");
					i--;
					continue;
				}
				int not2= input.nextInt(); input.nextLine();
				if (0 > not2 || 100 < not2) {
					System.out.println("Not girişi 0-100 aralıgı olmalı");
					i--;
					continue;
				}
				//matNotlar[i] = input.nextInt(); input.nextLine();//ENTER'I YAKALAR
				int ort = (not1+not2)/2;
				matNotlar[i] = ort ;
			}
			System.out.println("Ana menü için entera bas");
			input.nextLine();
			break;
			
		case 5:
			System.out.println("*******************************");
			System.out.println("*********NOT LİSTELE***********");
			System.out.println("*******************************");
			System.out.println("Ad \t Not");
			for (int i = 0; i < matNotlar.length; i++) {
				System.out.println(sinifListesi[i]+"\t "+ matNotlar[i]);
			}
			System.out.println("Ana menü için entera bas");
			input.nextLine();
			break;
		case 0:
			System.out.println("PROGRAMDAN ÇIKIŞ YAPILDI.");
			break;
		default:
			System.out.println("Geçerli bir olay giriniz.");
			System.out.println("Ana menü için entera bas");
			input.nextLine();
			break;
		}
		}while(secim!=0);
		input.close();
	}

}
