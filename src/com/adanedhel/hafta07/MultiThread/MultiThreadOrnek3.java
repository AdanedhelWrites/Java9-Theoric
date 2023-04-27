package com.adanedhel.hafta07.MultiThread;

public class MultiThreadOrnek3 {
	//interfaceler new'lenEmez!!
	public static void main(String[] args) {
		
	new Thread(new Runnable() {
	String isim = "Unknown Elf";
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
	}).start();
	
	}
}
