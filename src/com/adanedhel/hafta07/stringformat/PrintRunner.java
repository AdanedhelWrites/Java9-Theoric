package com.adanedhel.hafta07.stringformat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Locale.Category;

public class PrintRunner {
/*
 * String Formatlama
 */
	public static void main(String[] args) {
		//System.out.println("Adanedhel");
		
		/*
		 * printf
		 */
//		System.out.printf("Adanedhel\n");
//		System.out.printf("Adanedhel");
		
		String metin = "Adanedhel";
		String metin2 = "Elrond";
		//System.out.printf(metin+metin2);
		int sayi = 50;
		int sayi1 = 55;
//		System.out.printf("Elfler bu savasi kazanamicak gibi ihtiyac olan tek sey %s'dir. Kralimiz %s'un yardimi sağolsun%n",metin,metin2);
		
		String metin3 = "Orc";
//		System.out.printf("%-15s",metin3);
		
		/*
		 * %d sayilarla calismak icin kullanilir decimal demek		 * 
		 */
		byte byteDegis = Byte.MAX_VALUE;
		short shortDegis = Short.MAX_VALUE;
		int intDegis =Integer.MAX_VALUE;
		long lonDegis = Long.MAX_VALUE;
//		System.out.printf("%10d %n",byteDegis);
//		System.out.printf("%d %n",shortDegis);
//		System.out.printf("%d %n",intDegis);
//		System.out.printf("%d %n",lonDegis);
		/*
		 * %f : float ve double tiplerini stringe dönüştürür
		 */
		float floatDegis = 987.564645f;
		double doubleDegis = 987.34235;
		
//		System.out.printf("%20.8f%n", floatDegis);
//		System.out.printf("%-20.8f", doubleDegis);
		
		/*
		 * %o : Octal sayi (8lik sayi)
		 * 16 = 8 - 8
		 */
		int i = 16;
//		System.out.printf("%o",i);
		/*
		 * %x : hexadecimal (16lik sayi)
		 */
		int j = 10;
//		System.out.printf("%x",j);
		String s = "Izmir";
		int a = 100;
		double d = 25.25d;
//		System.out.printf("%s--%d--%f--%1$s--%3$f",s,a,d);
		/*
		 * $
		 */
//		System.out.printf("%1$s %1$s",s);
		/*
		 * Input : 2500
		 * Ouput : $2,500
		 */
//		int maas = 2500;
//		System.out.printf("$%,d",maas);
		
		/*
		 * Tarih formatlama
		 */
		LocalDate ld = LocalDate.now();
//		System.out.printf("Yil: %d Ay: %02d Gun: %d",ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth());
		/*
		 * %b boolean değer yazdırmak
		 */
		boolean dogruMu = true;
//		System.out.printf("%b",dogruMu);
		
		/*
		 * + : işareti göstermek için + için oluyor
		 */
		int sayi11 = 10;
		int sayi12 = -10;
//		System.out.printf("%+d ",sayi11);
//		System.out.println();
//		System.out.printf("%+d ",sayi12);
		/*
		 * String.format ile format
		 */
		String s1 = String.format("%+d", sayi11);
		System.out.println(s1);
		/*
		 * Kaan 19/01/2000'de dogdu
		 * Ali 15/01/2002'de dogdu
		 */
		String ad1= "Kaan";
		String ad2 = "Ali";
		
		LocalDate dt1 = LocalDate.of(2000, 1, 19);
		LocalDate dt2 = LocalDate.of(2002, 1, 15);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.printf("%s %d/%02d/%d tarihinde dogdu %n",ad1,dt1.getDayOfMonth(),dt1.getMonthValue(),dt1.getYear());
		System.out.printf("%s %s'de dogdu",ad2,dt2.format(formatter));
	}

}
