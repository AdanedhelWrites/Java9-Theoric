package com.adanedhel.hafta05.interfacesornek;


public abstract class Hayvan {
	private String ad;
	private int kilosu;
	private int boy;
	//abstract metood gövdesi olmaz. Interface yazdık..
	public abstract void sesCikar();	
	
	

	public Hayvan(String ad, int kilosu, int boy) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.boy = boy;
	}


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilosu() {
		return kilosu;
	}

	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	
}
