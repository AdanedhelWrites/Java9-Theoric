package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern;

public class Kamyon extends Tasima{
	
	public Kamyon() {
		super(ETasimaTip.KARA);
		tasi();
		// TODO Auto-generated constructor stub
	}

	@Override
	void tasi() {
		System.out.println("Kamyon tasima yapti");		
	}	
}
