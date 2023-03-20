package com.adanedhel.hafta03.gun01;

public class SubstringOrnek {

	public static void main(String[] args) {
//		String str = "Hello World"; //substring örneği
//		String altStr=str.substring(6, 11);
//		System.out.println(altStr);
		
		
		String str1="Ahmet";
		String str2="Zeynep";
		//compareTo alfabetik olarak yerini söyler..
		int selam = str2.compareTo(str1);
		System.out.println("Sonuc " + selam);
				
		String str3 = str1.replace('A','E');//replace metodunu unutma harflerin yerini değiştirir
		System.out.println(str3);
		
		String str4 = "Adanedhel";
		String str5 = "adanedhel";
		
		if (str4.equalsIgnoreCase(str5)) {// büyük harfleri küçük yapıp karşılaştırır ona göre eşit mi diye bakar
			System.out.println("Stringler eşittir..");
			
		}else {
			System.out.println("Stringler eşit değildir..");
		}
		boolean aIleBasladiMi = str1.startsWith("A");//startswith metodu o harfle mi başlar olayını kontrol eder.
		System.out.println(aIleBasladiMi);
		
		
		
	}

}
