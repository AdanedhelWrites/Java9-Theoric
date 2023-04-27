package com.adanedhel.hafta07.MultiThread;


public class MultiThreadOrnek1 {
/*
 * Teams : Multithread bir uygulamadırr
 * 
 * Multitasking : Bilgisayarınızın bir çok işlemi aynı anda çalıştırması
 * Multithreading : Bir işlem için birden çok thread oluşturulması 1den fazla işi aynı işlem içinde gerçekleştirir
 */
	public static void main(String[] args) throws Exception {
//		int x = 10;
//		for (int i = 0; i < 10; i++) {
//			System.out.println(x++);
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
		MyThread myThread1 = new MyThread("Adanedhel");
		MyThread2 myThread2 = new MyThread2("Elrond");
		
		myThread1.start();
		myThread2.start();
		
		//mainthread join edilen threadler bitene kadar calisir
		myThread1.join();
		myThread2.join();
		
		System.out.println("Main thread calisiyor..");

	}

}
