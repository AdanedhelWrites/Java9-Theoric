package com.adanedhel.hafta05.interfacekatman.repository.entities;

import java.util.UUID;

public class Kullanici {
	String uuid;
	String kullaniciAdi;
	String sifre;
	int durum;//0 -> Pasif durumda 1 -> Aktif durumda demek
		
	
	public Kullanici(String kullaniciAdi, String sifre) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}
	
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public int getDurum() {
		return durum;
	}
	public void setDurum(int durum) {
		this.durum = durum;
	}


	public String getUuid() {
		return uuid;
	}
	
	
}
