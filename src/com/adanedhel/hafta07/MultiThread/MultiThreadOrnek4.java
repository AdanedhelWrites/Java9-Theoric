package com.adanedhel.hafta07.MultiThread;

public class MultiThreadOrnek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isim = "Lambda Thread Adanedhel";
		Thread thread1 = new Thread(()->{
			System.err.println(isim + " isimli thread calisiyor!!");
			
			for (int i = 0; i < 5; i++) {
				System.err.println(isim + " says orcs must die: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.err.println(isim + " isini bitirdi.");
					
			
		});
		thread1.start();
		String isim2 = "Lambda Elrond";
		Thread thread2 = new Thread(()->{
			System.out.println(isim2 + " isimli thread calisiyor!!");
			
			for (int i = 0; i < 5; i++) {
				System.out.println(isim2 + " says orcs must die: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(isim2 + " isini bitirdi.");
			
		});
		thread2.start();
	}

}
