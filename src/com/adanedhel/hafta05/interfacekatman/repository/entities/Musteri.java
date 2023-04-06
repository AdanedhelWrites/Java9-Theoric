package com.adanedhel.hafta05.interfacekatman.repository.entities;

public class Musteri extends Kullanici {
	String ad;
	String soyad;
	String telNo;
	String adres;
	
	
	public Musteri(String ad,String soyad,String kullaniciAdi, String sifre) {
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
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	
}
