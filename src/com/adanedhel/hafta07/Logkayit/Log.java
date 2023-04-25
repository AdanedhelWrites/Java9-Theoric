package com.adanedhel.hafta07.Logkayit;

import java.io.Serializable;

public class Log implements Serializable{
	String id;
	String errorMesaj;
	String classAd;
	String metodAd;
	String detay;
	Long timeStamp; // zaman damgasi.		
		
	public Log() {
		super();
	}
	
	public Log(String errorMesaj, String classAd, String metodAd, String detay, Long timeStamp) {
		super();
		this.errorMesaj = errorMesaj;
		this.classAd = classAd;
		this.metodAd = metodAd;
		this.detay = detay;
		this.timeStamp = timeStamp;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getErrorMesaj() {
		return errorMesaj;
	}
	public void setErrorMesaj(String errorMesaj) {
		this.errorMesaj = errorMesaj;
	}
	public String getClassAd() {
		return classAd;
	}
	public void setClassAd(String classAd) {
		this.classAd = classAd;
	}
	public String getMetodAd() {
		return metodAd;
	}
	public void setMetodAd(String metodAd) {
		this.metodAd = metodAd;
	}
	public String getDetay() {
		return detay;
	}
	public void setDetay(String detay) {
		this.detay = detay;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Log [id=" + id + ", errorMesaj=" + errorMesaj + ", classAd=" + classAd + ", metodAd=" + metodAd
				+ ", detay=" + detay + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
