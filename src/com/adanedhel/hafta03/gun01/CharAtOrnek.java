package com.adanedhel.hafta03.gun01;

public class CharAtOrnek {

	public static void main(String[] args) {
		String alfabe = "ABCÇDEFGĞHIİJKLMNOÖUÜPRSŞTVYZ";
		for (int i = 0; i < alfabe.length(); i++) {
			
			System.out.println(alfabe.charAt(i) + " harfi: "+ (int)alfabe.charAt(i));//castle yapmak çok mantıklı
			
		}
		

	}

}
