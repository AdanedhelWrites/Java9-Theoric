package com.adanedhel.hafta05.interfacekatman.repository.entities;

import java.util.UUID;

public class Satis {
	String uuid;
	String calisanID;
	String musteriID;
	double fiyat;
	double kdv;
	double tamFiyat;
	String satisTarihi;
	
	public Satis() {
		super();
	}

	public Satis(String calisanID, String musteriID, double fiyat, double kdv, double tamFiyat, String satisTarihi) {
		super();
		this.uuid=UUID.randomUUID().toString();
		this.calisanID = calisanID;
		this.musteriID = musteriID;
		this.fiyat = fiyat;
		this.kdv = kdv;
		this.tamFiyat = tamFiyat;
		this.satisTarihi = satisTarihi;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCalisanID() {
		return calisanID;
	}

	public void setCalisanID(String calisanID) {
		this.calisanID = calisanID;
	}

	public String getMusteriID() {
		return musteriID;
	}

	public void setMusteriID(String musteriID) {
		this.musteriID = musteriID;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public double getKdv() {
		return kdv;
	}

	public void setKdv(double kdv) {
		this.kdv = kdv;
	}

	public double getTamFiyat() {
		return tamFiyat;
	}

	public void setTamFiyat(double tamFiyat) {
		this.tamFiyat = tamFiyat;
	}

	public String getSatisTarihi() {
		return satisTarihi;
	}

	public void setSatisTarihi(String satisTarihi) {
		this.satisTarihi = satisTarihi;
	}
	
	
	
}
