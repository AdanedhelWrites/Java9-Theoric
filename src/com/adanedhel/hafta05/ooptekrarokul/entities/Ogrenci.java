package com.adanedhel.hafta05.ooptekrarokul.entities;

public class Ogrenci {
	//Uye degiskenler
	private String ad;
	private String soyad;
	private int okulNo;
	private double notOrt;
	//Construcktor:
	public Ogrenci(String ad, String soyad, int okulNo, double notOrt) {
		super();
//		this.ad = ad;
//		this.soyad = soyad;
//		this.okulNo = okulNo;
//		this.notOrt = notOrt;
		//Kontrolden geçerek deger atamasi gerceklestirmeliyiz
		setAd(ad);
		setSoyad(soyad);
		setOkulNo(okulNo);
		setNotOrt(notOrt);
	}
	//Getter && Setter
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
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}
	public double getNotOrt() {
		return notOrt;
	}
	public void setNotOrt(double notOrt) {
		if (notOrt>= 0 && notOrt <= 100) {
			this.notOrt = notOrt;			
		}
		else {
			System.err.println("Gecerli sayi giriniz..Sayi 0-100 arasi olmalidir.");
		}
	}
	@Override
	public String toString() {
		return "Ogrenci ad=" + ad + " Soyad=" + soyad + " OkulNo=" + okulNo + " NotOrt=" + notOrt;
	}
	
	
}
