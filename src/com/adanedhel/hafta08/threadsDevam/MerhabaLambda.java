package com.adanedhel.hafta08.threadsDevam;

public class MerhabaLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISelamVer2 iSelamVer = () -> "Merhaba Lambda";
		System.out.println(iSelamVer.selamVer());
		
		IBesArtir2 iBesArtir = (x) -> x + 5;
		System.out.println(iBesArtir.besArttir(20));
		
		IStringBirlestir iStringBirlestir = (a , b) -> a + " " + b;
		System.out.println(iStringBirlestir.stringBirlestir("Merhaba", "Lambda"));
	}

}
@FunctionalInterface
interface ISelamVer2{	
	public String selamVer();
	
}

interface IBesArtir2{
	public int besArttir(int a);
}
