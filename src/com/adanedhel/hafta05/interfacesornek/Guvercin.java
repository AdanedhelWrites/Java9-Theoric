package com.adanedhel.hafta05.interfacesornek;

public class Guvercin extends Hayvan implements IUcabilir{

	public Guvercin(String ad, int kilosu, int boy) {
		super(ad, kilosu, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println("Ci pet pet giuv giuv");
	}

	@Override
	public void kanatCirp() {
		System.out.println(getAd()+" kanat cirpiyor.(sn'de 5 kez)");
		
	}

	@Override
	public void kanatTemizle() {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" kanat temizliyor.");
	}

	@Override
	public void gagala(String nesne) {
		// TODO Auto-generated method stub
		System.out.println(getAd()+" guvercin "+nesne+" gagaliyor.");
	}
	
}
