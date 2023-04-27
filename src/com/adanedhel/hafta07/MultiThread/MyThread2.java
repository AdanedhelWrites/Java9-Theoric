package com.adanedhel.hafta07.MultiThread;

public class MyThread2 extends Thread{
private String isim;
	
	
	public MyThread2(String isim) {
		super();
		this.isim = isim;
	}
	

	//Threadin çalışmasını istedigimiz kodları run metodu içine yazmalıyız
	@Override
	public void run() {
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
		
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}
}
