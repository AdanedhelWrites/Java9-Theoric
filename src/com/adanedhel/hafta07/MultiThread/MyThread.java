package com.adanedhel.hafta07.MultiThread;

public class MyThread extends Thread {

	private String isim;
	
	
	public MyThread(String isim) {
		super();
		this.isim = isim;
	}
	

	//Threadin çalışmasını istedigimiz kodları run metodu içine yazmalıyız
	@Override
	public void run() {
		System.out.println(isim + " isimli thread çalışıyor!!");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + " says orcs must die: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(isim + " isini bitirdi.");
		
	}


	public String getIsim() {
		return isim;
	}


	public void setIsim(String isim) {
		this.isim = isim;
	}


	
	
}
