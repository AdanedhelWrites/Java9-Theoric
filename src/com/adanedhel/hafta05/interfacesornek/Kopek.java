package com.adanedhel.hafta05.interfacesornek;

public class Kopek extends Hayvan implements IKuyruklu{

	public Kopek(String ad, int kilosu, int boy) {
		super(ad, kilosu, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+" Bark");
	}

	@Override
	public void kuyrukSalla() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" kopegi kuyruk salliyor");
	}
}
