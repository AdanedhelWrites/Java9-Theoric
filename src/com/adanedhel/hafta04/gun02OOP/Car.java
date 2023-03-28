package com.adanedhel.hafta04.gun02OOP;

public class Car {
	//MEMBER VARIABLE
	public String marka;
	public String model;
	public int yil;
	public double km;
	public int hiz;
	
	public double go(double gidilenKm) {
		km+=gidilenKm;
		//Zamani dönelim
		double zaman=(double)gidilenKm / hiz;
		return zaman;
	}
	public void hizlan(int hizArtisi) {
		hiz += hizArtisi;
	}
	public void yavasla(int hizDusurme) {
		hiz -= hizDusurme;
	}
	public void dur() {
		hiz = 0;
	}
	public String getInfo() {
		String info = "Arac Bilgileri: \nMarka: "+ marka +"\nModel: " + model + "\nYil Bilgisi: "+ yil+ "\nKM bilgisi: " + km + "\nHiz durumu: "+ hiz;
		return info;
	}
}
