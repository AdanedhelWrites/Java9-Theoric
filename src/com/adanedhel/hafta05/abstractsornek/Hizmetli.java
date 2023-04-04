package com.adanedhel.hafta05.abstractsornek;

public class Hizmetli extends Personel {
	
	public int [] gorevYaptigiKatlar;

	@Override
	public int getMaasKatSayisi() {
		// TODO Auto-generated method stub
		return super.getMaasKatSayisi();
	}

	@Override
	public String bilgiGetir() {		
		return "Ad: " + ad + " Adres: " + adres + " Telefon: " + telNo;		
	}
	
	
}
