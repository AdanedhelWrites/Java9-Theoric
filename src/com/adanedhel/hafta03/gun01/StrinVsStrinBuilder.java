package com.adanedhel.hafta03.gun01;

public class StrinVsStrinBuilder {

	public static void main(String[] args) {
		
//		int islemAdet=100000;
//		//başlangıç zamanı:
//		long baslangic = System.currentTimeMillis();
//		String metin = "Adanedhel";
//		for (int i = 0; i < islemAdet; i++) {
//			metin+=i;			
//			
//		}
//		long bitis = System.currentTimeMillis();
//		System.out.println(metin);
//		System.out.println("Stringle işlem süresi: " + (bitis - baslangic));
		
		int islemAdet=100000;
		//başlangıç zamanı:
		long baslangic = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		sb.append("Adanedhel");
		for (int i = 0; i < islemAdet; i++) {
			sb.append(i);			
			
		}
		long bitis = System.currentTimeMillis();
		System.out.println(sb);
		System.out.println("StringBuilder ile işlem süresi: " + (bitis - baslangic));

	}

}
