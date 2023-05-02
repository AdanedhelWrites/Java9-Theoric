package com.adanedhel.hafta08.threadsDevam;

public class RunnableLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			int toplam = 0;
			for (int i = 0; i < 11; i++) {
				toplam += i;
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(toplam);			
		};
		new Thread(runnable).start();
		
		//2. Kullanım
		new Thread(() -> {
			int toplam = 0;
			for (int i = 0; i < 11; i++) {
				toplam += i;
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(toplam);			
		}).start();
	}

}
