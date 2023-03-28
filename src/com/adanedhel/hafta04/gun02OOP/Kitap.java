package com.adanedhel.hafta04.gun02OOP;

public class Kitap {	
	
	public String yazar;
	public String kitapAdi;
	public String yayinEvi;
	public String sekil;
	public String konu;
	public String kapakResmi;
	public String arkaSayfaYazisi;
	public String onYazi;
	public boolean resimliMi;
	public boolean ilustratorluMu;
	public int sayfaSayisi;
	public int kalinlik;
	public int fiyat;
	
	public void kalinlik() {
		kalinlik = sayfaSayisi;
	}
	
	public String yazar(String yazar) {
		return yazar;
	}
	public String getInfo() {
		String info = "Kitabin Adı: " + kitapAdi + "\nKitabin Yazari: " + yazar + "\nYayin Evi: " + yayinEvi + "\nKitabin Sekli: " + sekil + "\nKitabi Konusu: " + konu
				+ "Sayfa Sayisi: " + sayfaSayisi + "\nKitabin Ucreti: " + fiyat;
		return info;
	}

}
