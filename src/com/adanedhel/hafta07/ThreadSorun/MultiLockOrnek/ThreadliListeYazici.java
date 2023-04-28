package com.adanedhel.hafta07.ThreadSorun.MultiLockOrnek;


import java.util.Random;
import java.util.*;

public class ThreadliListeYazici {
//	ArrayList<Integer> list1 = new ArrayList<>();
//	ArrayList<Integer> list2 = new ArrayList<>();
	Random rnd = new Random();
	
	Vector<Integer> list1 = new Vector<>();
	Vector<Integer> list2 = new Vector<>();
	
	
	public void list1DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(rnd.nextInt(100));
	}
	
	public  void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(rnd.nextInt(100));
	}
	
	public  void listelereDegerEkle() {
		for (int i = 0; i < 500; i++) {
			list1DegerEkle();
			list2DegerEkle();
		}
	}
	
	public void threadOlusturVeCalistir() {
		Thread t1 = new Thread(() -> {
			listelereDegerEkle();
		});
		Thread t2 = new Thread(() -> {
			listelereDegerEkle();
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println("List1Boyut: " + list1.size() + "\nList2Boyut: " + list2.size());
	}
	
	
	
}
