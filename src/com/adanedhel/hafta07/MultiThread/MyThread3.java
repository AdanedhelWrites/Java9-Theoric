package com.adanedhel.hafta07.MultiThread;

public class MyThread3 implements Runnable{
	
private String isim;
	
	
	public MyThread3(String isim) {
		super();
		this.isim = isim;
	}
	

	//Threadin çalışmasını istedigimiz kodları run metodu içine yazmalıyız
	@Override
	public void run() {
		System.err.println(isim + " isimli thread calisiyor!!");
		
		for (int i = 1; i < 50; i++) {
			System.err.println(isim + " says orcs must die: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.err.println(isim + " isini bitirdi.");
		
	}
}
