package com.adanedhel.hafta08.threadsDevam;
//0 - 5000 arasi sayilari toplamak istiyoruz.

import java.util.stream.IntStream;

public class RunnableSayiToplama {
	
	public static int sonuc;
	
	public static void main(String[] args) throws InterruptedException {
		int toplam = IntStream.rangeClosed(0, 5000).sum();
		System.out.print("IntStream'den geldi: ");
		System.out.println(toplam);
		
		int[] dizi = IntStream.rangeClosed(0, 5000).toArray();
		
		IsciBaris isciBaris = new IsciBaris(dizi);
		IsciSavas isciSavas = new IsciSavas(dizi);
		
		Thread thread1 = new Thread(isciBaris);
		Thread thread2 = new Thread(isciSavas);
		
		thread1.start();
		thread2.start();		
		
		thread1.join();
		thread2.join();
		System.out.println("Threadlerden Gelen sonuc: " + sonuc);
		
	}
	public static void topla(int sayi) {
		sonuc += sayi;
	}
}

class IsciBaris implements Runnable{
	private int[] arr;
	private int toplam;
	
	public IsciBaris(int[] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length/2; i++) {
			toplam += arr[i];
		}
		RunnableSayiToplama.topla(toplam);
	}
	
}
class IsciSavas implements Runnable{
	private int[] arr;
	private int toplam;
	
	public IsciSavas(int[] arr) {
		super();
		this.arr = arr;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = arr.length/2; i < arr.length; i++) {
			toplam += arr[i];
		}
		RunnableSayiToplama.topla(toplam);
	}
	
}
