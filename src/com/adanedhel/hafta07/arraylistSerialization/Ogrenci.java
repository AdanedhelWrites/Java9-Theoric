package com.adanedhel.hafta07.arraylistSerialization;

import java.io.Serializable;

public class Ogrenci implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ad;
	private int no;
	

	public Ogrenci(String ad, int no) {
		
		this.ad = ad;
		this.no = no;
		
	}	
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
	
	@Override
	public String toString() {
		return "Ogrenci{" + ", ad='" + ad + '\'' + ", soyad='" + no + '\'' 
				+ '}';
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}
}
