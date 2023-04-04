package com.adanedhel.hafta05.abstractsornek;

public class Muhasebeci extends Personel{
		
	public String muhasebeUnvani;
	
	
	
	public Muhasebeci() {
		super();
	}



	public Muhasebeci(String ad,String adres,String telNo,String muhasebeUnvani) {
		super(ad,adres,telNo);
		this.muhasebeUnvani=muhasebeUnvani;
		// TODO Auto-generated constructor stub
		System.out.println("muhasebe Sinifi 4 parametreli constructor calisti..");
	}
	
	@Override
	public int getMaasKatSayisi() {
		// TODO Auto-generated method stub
		return 4;
	}



	@Override
	public String bilgiGetir() {		
		return "Ad: " + ad + " Adres: " + adres + " Telefon: " + telNo;		
	}
}
