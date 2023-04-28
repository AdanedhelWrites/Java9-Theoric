package com.adanedhel.hafta07.ThreadSorun;

public class ThreadSorun1 {
	private int count = 0;
	private volatile int sayac = 0; //volatile sayesinde değişkene aynı anda 1 thread erişim sağlar
	public static void main(String[] args) {
		ThreadSorun1 ts1 = new ThreadSorun1();
		ts1.threadleriBaslar();

	}
	/*
	 * Synchronized keywordlü methodlara aynı anda sadece 1 thread erişim sağlayabilir.
	 * Unsafe bir thread kullanımı vardır. Synchronized eklendikten sonra burası threa safe bir yapıya dönüştü
	 */
	public synchronized void threadSenkronErisimMetodu() { //volatile yerine synchronized tercih edilmelidir 
		count++;
	}
	public void threadleriBaslar() {
		Thread th1 = new Thread(()-> {
			for (int i = 0; i < 5000; i++) {
				threadSenkronErisimMetodu();
				sayac++;
			}
			System.out.println("Thread 1: " + count);
			System.out.println("Thread 1 Sayac: " + sayac);
		});
		Thread th2 = new Thread(()-> {
			for (int i = 0; i < 5000; i++) {
				threadSenkronErisimMetodu();
				sayac++;
			}
			System.out.println("Thread 2: " + count);
			System.out.println("Thread 2 Sayac: " + sayac);
		});
		th1.start(); //start(): Yaratılmış  thread'in çalışmasını sağlar.ıuu8oııııııııı
		th2.start();
		
		System.out.println("Join Count: " + count); //0 yazmıştı
		
		//join komutu
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Join sonrasi count: " + count);
		System.out.println("Join sonrasi sayac: " + sayac);
	}
}
