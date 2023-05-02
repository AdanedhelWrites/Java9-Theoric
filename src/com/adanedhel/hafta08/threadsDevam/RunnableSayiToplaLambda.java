package com.adanedhel.hafta08.threadsDevam;

import java.util.stream.IntStream;

public class RunnableSayiToplaLambda {
	public static int sonuc;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int toplam = IntStream.rangeClosed(0, 5000).sum();
		System.out.print("IntStream'den geldi: ");
		System.out.println(toplam);
		
		int[] dizi = IntStream.rangeClosed(0, 5000).toArray();
		
		Thread thread1 = new Thread(()->{
			for (int i = 0; i < dizi.length/2; i++) {
				topla(dizi[i]);
				//sonuc += dizi[i];
			}
			
		});
		Thread thread2 = new Thread(()->{
			for (int i = dizi.length/2; i < dizi.length; i++) {
				topla(dizi[i]);
				//sonuc += dizi[i];
			}
			
		});
		thread1.start();
		thread2.start();		
		
		thread1.join();
		thread2.join();
		/*
		 * Join metodunun çalıştığı thread(main) Waiting state'e gecer.
		 * Join edilen threadlerin calismasi bitene kadar ilerlemez
		 * 
		 * Sorun : Join edilen thread calismayi hic bitirmezse ne olur? : PROGRAM YANIT VERMEZ BEKLEMEYE DEVAM EDER. Waiting State'de kalir
		 */
		System.out.println("Threadlerden Gelen sonuc: " + sonuc);
	}
	public synchronized static void topla(int sayi) {
		sonuc += sayi;
	}

}
