package com.adanedhel.hafta06.exceptions;

public class UncheckedOrnek {
//KONTROL EDİLMESİ ZORUNLU OLMAYAN EXCEPTIONLARDIR
	//DERLEYİCİ BU TÜR EXCEPTIONLARI KONTROL ETMEZ
	//UNCHECKED EXCEPTIONLAR: RUNTIME EXCEPTIONLARDIR
	public static void main(String[] args) {
		try {
			int[]sayilar = {10,20,30,40};
			System.out.println(sayilar[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Indexinde hata var");
			//e.printStackTrace();
		}
		System.out.println("Program calismaya devam eder");
		
		try {
			String ad = "adanedhel";
			System.out.println(ad.length());
			String boy= "170cm";
			int i = Integer.parseInt(boy);
			System.out.println(i);
			
		} catch (NullPointerException e) {
			System.out.println("Icinde eleman olmayan nesnenin uzunlugu olmaz aga");
			//e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("Karakterler integer'a donusmezler bro. Sadece rakam yaz");
		}
		System.out.println("Program calismaya devam eder");
		
		try {
			String boy = "170cm";
			int i = Integer.parseInt(boy);			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("e.getMesaage(): " + e.getMessage());
			System.out.println("e.getMesaage(): " + e.toString());
			//System.out.println("e.getMesaage(): " + e.printStackTrace());
		}
	}	
}
