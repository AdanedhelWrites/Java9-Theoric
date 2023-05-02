package com.adanedhel.hafta08.threadsDevam;
/*
 * Butun kodlar sirali sekilde calisir
 * 
 */
public class SiraliOrnek {
	public static void main(String[] args) {
		Isci1 isci1 = new Isci1();
		Isci2 isci2 = new Isci2();
		
		isci1.calis();
		isci2.calis();
		
		System.out.println(Thread.currentThread().getName());
	}
}

class Isci1 {
	public void calis() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1 saniye suren is
			System.out.println("Isci 1 calisiyor: " + i + ". isi getirdi.");
		}
	}
}
class Isci2 {
	public void calis() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1 saniye suren is
			System.out.println("Isci 2 calisiyor:" + i + ". isi getirdi.");
		}
	}
}