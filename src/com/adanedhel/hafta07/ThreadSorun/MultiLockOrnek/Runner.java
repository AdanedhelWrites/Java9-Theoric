package com.adanedhel.hafta07.ThreadSorun.MultiLockOrnek;

public class Runner {

	public static void main(String[] args) {
		ThreadsizListeYazici threadsizListeYazici = new ThreadsizListeYazici();
		long baslangic = System.currentTimeMillis();
		threadsizListeYazici.listelereDegerEkle();
		long bitis = System.currentTimeMillis();
		System.out.println("ThreadsizListeYazici suresi: " + (bitis-baslangic));
		
		
		ThreadliListeYazici threadliListeYazici = new ThreadliListeYazici();
		long baslangic2 = System.currentTimeMillis();		
		threadliListeYazici.threadOlusturVeCalistir();
		long bitis2 = System.currentTimeMillis();
		System.out.println("ThreadliListeYazici suresi: " + (bitis2-baslangic2));
		
		
		ThreadMultiLockluListeYazici threadliMultiListeYazici = new ThreadMultiLockluListeYazici();
		long baslangic3 = System.currentTimeMillis();		
		threadliMultiListeYazici.threadOlusturVeCalistir();
		long bitis3 = System.currentTimeMillis();
		System.out.println("ThreadliMultiListeYazici suresi: " + (bitis3-baslangic3));
	}

}
