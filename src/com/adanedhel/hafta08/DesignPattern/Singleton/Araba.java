package com.adanedhel.hafta08.DesignPattern.Singleton;

public class Araba {
	//Adresi değişmeyen static
	//Ilk degeri null olan araba tipinde bir instance adında üye değişken oluşturduk
	private static Araba instance = null;
	
	
	// default constructor
	private Araba() {
		System.out.println("Araba Cons Calisti");
	}
	
	public static Araba getInstance() {
		if (instance==null) {
			instance = new Araba();			
		}
		return instance;
	}
}
