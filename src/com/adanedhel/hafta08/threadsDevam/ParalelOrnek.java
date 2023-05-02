package com.adanedhel.hafta08.threadsDevam;
/*
 * Thread: Eşzamanlı olarak çalışan yapı veya işlemler
 * Thread java.lang paketinin içindedir
 * MultiThread: Bir process içinde birden fazla thread'in çalıştığı yapıdır
 * Thread neden kullanilir? : Aynı anda birden fazla görevin paralel olarak yürütülmesini sağlamak için kullanılır
 * 
 * Thread Stateleri:
 * new : Thread'in yeni taratıldığı an
 * Runnable : Start metodu ile tetiklenince geçilen durum
 * Running : Thread çalışmaya başladığında geçtiği durum
 * Blocked : Lock yüzünden geçiçi olarak pasif duruma geçmesi.
 * Waiting : Notify gelene kadar bekleme durumu.
 * Dead : İçindeki işlemleri bitirdikten sonra geçtiği durum.
 */
public class ParalelOrnek {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ParalelIsci1 paraIsci1 = new ParalelIsci1();
		ParalelIsci2 paraIsci2 = new ParalelIsci2();
		
		paraIsci1.start();
		paraIsci2.start();
		
	}

}

class ParalelIsci1 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Calisan Thread: " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1 saniye suren is
			System.out.println("Paralel Isci 1 calisiyor: " + (i+1) + ". isi getirdi.");
		}
	}
	
}
class ParalelIsci2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Calisan Thread: " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1 saniye suren is
			System.out.println("Paralel Isci 2 calisiyor: " + (i + 1 ) + ". isi getirdi.");
		}
	}
	
}
