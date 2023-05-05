package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern;

public class Gemi extends Tasima{

	public Gemi() {
		super(ETasimaTip.DENIZ);
		tasi();
	}

	@Override
	void tasi() {
		System.out.println("Gemi tasima yapti");
		
	}
	
}
