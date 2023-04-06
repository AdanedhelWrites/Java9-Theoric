package com.adanedhel.hafta05.interfacekatman.repository.entities;

import java.util.UUID;

public class SatisDetay {
	String uuid;
	String satisId;
	String urunID;
	int adet;
	double fiyat;
	double toplamFiyat;
	public SatisDetay(String satisId, String urunID, int adet, double fiyat, double toplamFiyat) {
		super();
		this.uuid=UUID.randomUUID().toString();
		this.satisId = satisId;
		this.urunID = urunID;
		this.adet = adet;
		this.fiyat = fiyat;
		this.toplamFiyat = toplamFiyat;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getSatisId() {
		return satisId;
	}
	public void setSatisId(String satisId) {
		this.satisId = satisId;
	}
	public String getUrunID() {
		return urunID;
	}
	public void setUrunID(String urunID) {
		this.urunID = urunID;
	}
	public int getAdet() {
		return adet;
	}
	public void setAdet(int adet) {
		this.adet = adet;
	}
	public double getFiyat() {
		return fiyat;
	}
	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	public double getToplamFiyat() {
		return toplamFiyat;
	}
	public void setToplamFiyat(double toplamFiyat) {
		this.toplamFiyat = toplamFiyat;
	}
	
}
