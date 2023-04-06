package com.adanedhel.hafta05.interfacesornek;

public class Kedi extends Hayvan implements IKuyruklu{

	public Kedi(String ad, int kilosu, int boy) {
		super(ad, kilosu, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		
		System.out.println(getAd()+" Meow");
	}

	@Override
	public void kuyrukSalla() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" kedisi kuyruk salliyor.");
		
	}
	
	

}
