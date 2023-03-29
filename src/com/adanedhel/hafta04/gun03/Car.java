package com.adanedhel.hafta04.gun03;

public class Car {
	//MEMBER VARIABLE
	public String marka;
	public String model;
	public int yil;
	public double km;
	public int hiz;
	public Motor motor;
	
	public Car() {
		//deneme
		System.out.println("Constructor Calisiyor");
	}
	
	public Car(String markaYeni,String modelYeni) {
		this(markaYeni,modelYeni,0);
		System.out.println("2 parametreli constructor calisti");
	
	}
	public Car(String markaYeni,String modelYeni,int yilYeni) {
		this(markaYeni,modelYeni,0,0,null);
		System.out.println("3 parametreli constructor calisti");

	}	
	
	public Car(String markaYeni,String modelYeni, int yilYeni,double kmYeni,Motor motorYeni) {
		marka=markaYeni;
		yil = yilYeni;
		model=modelYeni;
		km=kmYeni;
		motor = motorYeni;
		System.out.println("6 parametreli constructor calisti");
		
	}
	
	
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
