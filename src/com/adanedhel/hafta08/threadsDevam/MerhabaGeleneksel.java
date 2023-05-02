package com.adanedhel.hafta08.threadsDevam;

public class MerhabaGeleneksel implements ISelamVer, IBesArtir, IStringBirlestir{

	public static void main(String[] args) {
		MerhabaGeleneksel merhabaGeleneksel = new MerhabaGeleneksel();
		System.out.println(merhabaGeleneksel.selamVer());
		
		System.out.println(merhabaGeleneksel.stringBirlestir("Merhaba", "Java"));
		
	}

	@Override
	public String selamVer() {
		// TODO Auto-generated method stub
		return "Selamlar";
	}

	@Override
	public int besArttir(int a) {
		// TODO Auto-generated method stub
		return a + 5;
	}

	@Override
	public String stringBirlestir(String a, String b) {
		// TODO Auto-generated method stub
		return a + " " + b;
	}	
}

interface ISelamVer {	
	public String selamVer();	
}

interface IBesArtir{
	public int besArttir(int a);
}

interface IStringBirlestir{
	public String stringBirlestir(String a, String b);
}