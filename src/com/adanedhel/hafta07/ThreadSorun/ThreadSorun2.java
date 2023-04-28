package com.adanedhel.hafta07.ThreadSorun;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSorun2 {

	public static void main(String[] args) {
		/*
		 * Atomic veri türleri.
		 * 
		 */	
		AtomicInteger sayac = new AtomicInteger(1);
		List<String> isimList = List.of("Adriana","Miranda","Candice","Barbara","Lian");
		isimList.forEach(x -> {
			System.out.println(sayac + ".kisi "+ x);
			sayac.getAndIncrement();
		});

	}

}
