package com.adanedhel.hafta03.gun01;

public class StringOrnek {

	public static void main(String[] args) {
		String isim = new String("Adanedhel");
		String soyisim = new String("Adanedhel");
		
		if (isim==soyisim) {
			System.out.println("new ile aynı string == ile kontrol edilince EŞİT");
			
		}else {
			//new ile farklı nesneler oluşturulduğu için bu kısım çalışır
			System.out.println("new ile aynı string == ile kontrol edilince EŞİT DEĞİL");
		}
		
		
		
		if (isim.equals(soyisim)) {
			//bu parametrede bire bir kontrol edicegi için equals EŞİT VERİR.
			System.out.println("new ile aynı string == ile kontrol edilince EŞİT");
		}
		else {
			
			System.out.println("new ile aynı string == ile kontrol edilince EŞİT DEĞİL");
		}
						
		
		String isim2 ="Adanedhel";
		String isim1 ="Adanedhel";
		
		if (isim1==isim2) {
			//havuzdaki aynı nesneyi gösterdikleri için burası çalışıyor
			System.out.println("new ile aynı string == ile kontrol edilince EŞİT");
			
		}else {
			System.out.println("new ile aynı string == ile kontrol edilince EŞİT");
			
		}
		System.out.println("\" \" işaretleri çok iyidir ");//tırnakları tırnak içinde kullandırır
		System.out.println("\t Java");//tab bırakır
		System.out.print("Java\nJava");//aşağı atar
		
	}

}
