package com.adanedhel.hafta08.threadsDevam;

public class VolatileOrnek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		myThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myThread.threadDurdur();
		
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class MyThread extends Thread{
	volatile boolean calis = true;
	@Override
	public void run() {
		int sayac = 0;
		while (calis) {
			sayac++;
		}
		System.out.println("Sayac :" + sayac);
	}
	
	public void threadDurdur() {
		calis =  false;
	}
	
}
