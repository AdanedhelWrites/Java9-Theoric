package com.adanedhel.hafta07.MultiThread;
/*
 * class MyThread3 implements Runnable seklinde oluşturulursa 
 * Bu thread çalıştırılırken;
 * 
 * 3 Farklı Thread oluştur 1'den 50ye kadar 3'er yazdır
 * 1den 50ye kadar 5er
 * 1den 50ye kadar 7ser
 */
public class MultiThreadOrnekInterfaceTest {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread3("Adanedhel"));
		thread1.start();
	}

}
