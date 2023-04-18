package com.adanedhel.hafta06.exceptions;

public class ExceptionsOrnek {

	public static void main(String[] args) {
		sifiraBolmeIslemi();
		//Exception in thread "main" : Bir exception meydana geldigini belli eder.
		//java.lang.ArithmeticException: Buu exception'i fırlatan sınıfımız
		// / by zero: 0'a bölme hatası verdi
		//at ExceptionsOrnek.main: Hatanın oluştugu sınıf adı.method adı
		//(ExceptionsOrnek.java:7): Hatanın oluştugu sınıf

	}

	public static void sifiraBolmeIslemi() {
		int payda = 0;
		int pay = 20;
		int sonuc = pay / payda;
		System.out.println(sonuc);
	}

}
