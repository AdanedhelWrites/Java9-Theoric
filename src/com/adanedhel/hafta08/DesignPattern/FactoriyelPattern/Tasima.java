package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern;

public abstract class Tasima {
	private ETasimaTip tip;
	
	public Tasima(ETasimaTip tip) {
		this.tip = tip;
		islemler();
	}
	abstract void tasi();
	//abstract keywordu metoda konursa ne anlama gelir?
	//metodun alt sınıflarda zorunlu olarak implemente edip doldurtuluyor
	private void islemler() {
		
	}
	
	public ETasimaTip getTip() {
		return tip;
	}
	public void setTip(ETasimaTip tip) {
		this.tip = tip;
	}
		
}
