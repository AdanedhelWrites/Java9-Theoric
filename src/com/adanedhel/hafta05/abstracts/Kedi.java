package com.adanedhel.hafta05.abstracts;
public class Kedi extends Hayvan{

	public Kedi(String ad, int kilosu, int boy) {
		super(ad, kilosu, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		
		System.out.println(getAd()+" Meow");
	}

	

}
