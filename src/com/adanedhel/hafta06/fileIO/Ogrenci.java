package com.adanedhel.hafta06.fileIO;

public class Ogrenci {
	private String adSoyad;
	private int ogrNo;
	
	public Ogrenci(String adSoyad, int ogrNo) {
		super();
		this.adSoyad = adSoyad;
		this.ogrNo = ogrNo;
	}
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public int getOgrNo() {
		return ogrNo;
	}
	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}
	@Override
	public String toString() {
		return "Ogrenci [adSoyad=" + adSoyad + ", ogrNo=" + ogrNo + "]";
	}
	
	
}
