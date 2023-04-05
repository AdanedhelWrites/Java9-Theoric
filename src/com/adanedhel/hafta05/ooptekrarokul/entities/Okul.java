package com.adanedhel.hafta05.ooptekrarokul.entities;

import java.util.ArrayList;

public class Okul {

	private String okulAd;
	private String okulAdres;
	private ArrayList<Sinif> siniflar;

	public Okul(String okulAd, String okulAdres, ArrayList<Sinif> siniflar) {
		super();
		this.okulAd = okulAd;
		this.okulAdres = okulAdres;
		this.siniflar = siniflar;
	}

	public Okul(String okulAd, String okulAdres) {
		super();
		this.okulAd = okulAd;
		this.okulAdres = okulAdres;
		siniflar = new ArrayList<>();
	}
	
	public void sinifEkle(Sinif sinif) {
		siniflar.add(sinif);
	}
	public void sinifYazdir() {
		for (Sinif sinif : siniflar) {
			System.out.println("Sinif ad: " + sinif.getSinifAd()+" Sinif Lokasyon: "+ sinif.getLokasyon());
		}
	}
	public void okulOgrListe() {
		System.out.println("========"+ okulAd+"Ogrenci Listesi "+"========");
		System.out.println("-------------------------------------------------------");
		for (Sinif sinif : siniflar) {//			-
			sinif.ogrListele();
		}	
		
	}

	public String getOkulAd() {
		return okulAd;
	}

	public void setOkulAd(String okulAd) {
		this.okulAd = okulAd;
	}

	public String getOkulAdres() {
		return okulAdres;
	}

	public void setOkulAdres(String okulAdres) {
		this.okulAdres = okulAdres;
	}

	public ArrayList<Sinif> getSiniflar() {
		return siniflar;
	}

	public void setSiniflar(ArrayList<Sinif> siniflar) {
		this.siniflar = siniflar;
	}

}
