package com.adanedhel.hafta02.gun05;

public class StringKonu {

	public static void main(String[] args) {

		String ad = "Java String Konusu";
		// string uzunlugu
		System.out.println(ad.length());

		// string icindeki belirlenen index
		System.out.println(ad.charAt(3));

		for (int i = 0; i < ad.length(); i++) {
			System.out.print(ad.charAt(i));
			// ters yazdirma
		}
		System.out.println();
		for (int i = ad.length() - 1; i >= 0; i--) {
			System.out.print(ad.charAt(i));

		}
		System.out.println();
		// bir karakterin kacinci index oldugunu bulma
		System.out.println(ad.indexOf('a'));
		// 5inci indexten sonra kacinci indexte var
		System.out.println(ad.indexOf('o', 5));
		// string oluncada işe yarıyor.
		System.out.println(ad.indexOf("oo", 5));
		// substring ne işe yarar. metinden bir parça alır EMAİLDE DENENİR
		System.out.println(ad.substring(4));
		System.out.println(ad.substring(1, 5));
		String password = "123456";
		String passwordInput = " 123456";
		// trim komutu başta ve sondaki karakterleri temizler..
		if (password.equals(passwordInput.trim()))// passwordları karşılaştırıyor
		{
			System.out.println("Ayni deger");

		} else {
			System.out.println("Farklidir");
		}
		String userName = "adanedhel";
		String userNameInput = "Adanedhel";
		if (userName.equals(userNameInput.toLowerCase())) {
			System.out.println("Degerler ayni");

		} else {
			System.out.println("Degerler farkli");
		}
		int yas = 18;
		String yasDeger = String.valueOf(yas);// valueof ile string'e convert edilebilir(dönüştürülebilir).
		System.out.println(yasDeger);

	}
}
