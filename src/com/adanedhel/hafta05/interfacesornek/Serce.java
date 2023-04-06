package com.adanedhel.hafta05.interfacesornek;

public class Serce extends Hayvan implements IUcabilir {

	public Serce(String ad, int kilosu, int boy) {
		super(ad, kilosu, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kanatCirp() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" kanat cirpiyor.(sn'de 15 kez)");
	}

	@Override
	public void kanatTemizle() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" kanat temizliyor.");
	}

	@Override
	public void gagala(String nesne) {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" serce "+nesne+" gagaliyor.");
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+"cikliyor.");
	}

}
