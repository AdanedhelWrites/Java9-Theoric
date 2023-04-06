package com.adanedhel.hafta05.interfacekatman.repository.entities;

public class Calisan extends Kullanici {
	String ad;
	String soyad;
	
	
	public Calisan(String ad,String soyad,String kullaniciAdi, String sifre) {
		super(kullaniciAdi, sifre);
		this.ad=ad;
		this.soyad=soyad;
	}
	
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
}
