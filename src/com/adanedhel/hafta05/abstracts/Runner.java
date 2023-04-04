package com.adanedhel.hafta05.abstracts;

public class Runner {
	public static void main(String[] args) {
		Hayvan h = new Kedi("Sulo",8,70); 
		System.out.println(h.getAd());
		h.sesCikar();
		
		Hayvan h1=new Kopek("Piti", 15, 120);
		h1.sesCikar();
	}
}
