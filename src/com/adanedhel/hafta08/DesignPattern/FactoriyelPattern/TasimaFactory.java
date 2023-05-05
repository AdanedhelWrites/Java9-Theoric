package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern;

public class TasimaFactory {
	public static Tasima builder(ETasimaTip tip) {
		switch (tip) {
		case KARA: return new Kamyon();
		case DENIZ: return new Gemi();	
		default:return new Kamyon();			
		}
	}
}
