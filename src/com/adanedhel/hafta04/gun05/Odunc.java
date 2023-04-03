package com.adanedhel.hafta04.gun05;

public class Odunc {
	private Kitap kitap;
	private Uye uye;
	private String oduncAlinmaTarihi;	
	
	public Odunc(Kitap kitap, Uye uye, String oduncAlinmaTarihi) {
		super();
		this.kitap = kitap;
		this.uye = uye;
		this.oduncAlinmaTarihi = oduncAlinmaTarihi;
	}

	public Kitap getKitap() {
		return kitap;
	}

	public Uye getUye() {
		return uye;
	}
	
	public String getOduncAlinmaTarihi() {
		return oduncAlinmaTarihi;
	}		
}
