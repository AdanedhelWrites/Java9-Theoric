package com.adanedhel.hafta07.ThreadSorun.MultiLockOrnek;

import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListeYazici {
	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	Random rnd = new Random();
	public void list1DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(rnd.nextInt(100));
	}
	public void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(rnd.nextInt(100));
	}
	public void listelereDegerEkle() {
		for (int i = 0; i < 1000; i++) {
			list1DegerEkle();
			list2DegerEkle();
		}
		System.out.println("List1Boyut: " + list1.size() + "\nList2Boyut: " + list2.size());
	}
}
