package com.adanedhel.hafta08.threadsDevam;

public class RunnableGeleneksel {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() { //run methodu voiddir. Geri deger dönmez
				// TODO Auto-generated method stub
				int toplam = 0;
				for (int i = 0; i < 11; i++) {
					toplam += i;
				}
				System.out.println(Thread.currentThread().getName());
				System.out.println(toplam);
			}
		};
		
		System.out.println(Thread.currentThread().getName());
		new Thread(runnable).start();
	}
}
