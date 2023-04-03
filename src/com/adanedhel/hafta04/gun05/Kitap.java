package com.adanedhel.hafta04.gun05;

public class Kitap {
	private String ISBN;
	private String kitapIsmi;
	private String kitapYazari;
	private int kitapSayfaSayisi;
	private String basimTarihi;
	private String yayinEvi;
	private String kitapTuru;
	private int kitapAdedi;
	//Constructor
	public Kitap(String ISBN,String kitapIsmi, String kitapYazari,int kitapAdedi) {
		super();
		this.ISBN=ISBN;
		this.kitapIsmi=kitapIsmi;
		this.kitapYazari=kitapYazari;
		this.kitapAdedi = kitapAdedi;
	}
	public Kitap(String ISBN, String kitapIsmi, String kitapYazari, int kitapSayfaSayisi, String basimTarihi,
			String yayinEvi, String kitapTuru, int kitapAdedi) {
		super();
		this.ISBN = ISBN;
		this.kitapIsmi = kitapIsmi;
		this.kitapYazari = kitapYazari;
		this.kitapSayfaSayisi = kitapSayfaSayisi;
		this.basimTarihi = basimTarihi;
		this.yayinEvi = yayinEvi;
		this.kitapTuru = kitapTuru;
		this.kitapAdedi = kitapAdedi;
	}
	//GETTER & SETTER
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getKitapIsmi() {
		return kitapIsmi;
	}
	public void setKitapIsmi(String kitapIsmi) {
		this.kitapIsmi = kitapIsmi;
	}
	public String getKitapYazari() {
		return kitapYazari;
	}
	public void setKitapYazari(String kitapYazari) {
		this.kitapYazari = kitapYazari;
	}
	public int getKitapSayfaSayisi() {
		return kitapSayfaSayisi;
	}
	public void setKitapSayfaSayisi(int kitapSayfaSayisi) {
		this.kitapSayfaSayisi = kitapSayfaSayisi;
	}
	public String getBasimTarihi() {
		return basimTarihi;
	}
	public void setBasimTarihi(String basimTarihi) {
		this.basimTarihi = basimTarihi;
	}
	public String getYayinEvi() {
		return yayinEvi;
	}
	public void setYayinEvi(String yayinEvi) {
		this.yayinEvi = yayinEvi;
	}
	public String getKitapTuru() {
		return kitapTuru;
	}
	public void setKitapTuru(String kitapTuru) {
		this.kitapTuru = kitapTuru;
	}
	public int getKitapAdedi() {
		return kitapAdedi;
	}
	public void setKitapAdedi(int kitapAdedi) {
		this.kitapAdedi = kitapAdedi;
	}
	
		
	
	
	
	
	
}
