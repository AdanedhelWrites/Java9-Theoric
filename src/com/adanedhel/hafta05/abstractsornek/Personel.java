package com.adanedhel.hafta05.abstractsornek;

public abstract class Personel {
	public String ad;
	public String adres;
	public String telNo;
	public String tcNo;
	public int yas;
	private int maas;
	private int maasKatSayisi;

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public int getmaas() {
		return maas;
	}

	public int getMaasKatSayisi() {
		return 1;
	}

	public int gorevTazminati;

	public Personel() {
		super();
		System.out.println("Personel Sinifi bos constructor calisti..");
	}

	public Personel(String ad, String adres, String telNo) {
		this.ad = ad;
		this.adres = adres;
		this.telNo = telNo;
		System.out.println("Personel Sinifi 3Parametreli constructor calisti..");
	}

	@Override
	public String toString() {
		return "Personel [ad=" + ad + ", adres=" + adres + ", telNo=" + telNo + "]";
	}

	public abstract String bilgiGetir();

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getGorevTazminati() {
		return gorevTazminati;
	}

	public void setGorevTazminati(int gorevTazminati) {
		this.gorevTazminati = gorevTazminati;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaasKatSayisi(int maasKatSayisi) {
		this.maasKatSayisi = maasKatSayisi;
	}
	
	

}
