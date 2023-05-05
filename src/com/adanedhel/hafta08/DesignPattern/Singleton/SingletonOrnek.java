package com.adanedhel.hafta08.DesignPattern.Singleton;
/*
 * Oluşturulan sınıfın sadece bir tane instance'i olması için kullanılır.
 * Neden kullanıcın istediği kadar nesne üretmesini istemeyebiliriz?
 * -Bellek problemleri
 * -Performans problemleri
 * Singleton Sınıfıa Ait instance'a ulaşmak için global erişimi kapatmalıdır
 * Constructor private olmalıdır. Böylece dışarıdan new keywordu oluşturulması engellenir.
 * Singleton sınıfı instance'i sınıf içinde private static olarak tutulmalıdır.
 * Bu tutulan instance'i döndürmek için public static bir metod olmalıdır
 * 
 * 
 * 
 */
public class SingletonOrnek {
	
	public static void main(String[] args) {
		Araba a1 = Araba.getInstance();
		System.out.println(a1);
		a1 = Araba.getInstance();
		System.out.println(a1);	
		a1 = Araba.getInstance();
		System.out.println(a1);
		//bir nesne varsa onu alıyor ve referansını tutuyor referansı varsa aynı nesneyi getiriyor
	}
}
