package com.adanedhel.hafta07.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

public class RunnerDate01 {

	public static void main(String[] args) {
		/*
		 * Yapılan işlemin ne kadar sürede gerçekleştiğini izlemek için kullanılabilir.
		 * Hangi kullanıcı hangi işlemi ne zaman gerçekleştirdi.
		 * Hangi kullanıcı ne zaman sisteme giriş/çıkış yaptı.
		 * Üyelerinizin doğum tarihini tutmak için.
		 * Programın çalışma süresi tutmak için.
		 * Date Calendar 
		 * Java8 ile beraber tim kütüphanesi gelmiştir.
		 * Zaman damgası ilke tarih tutma long üstünde
		 * 
		 * Long tipinmde veri tutmak daha az yer kaplar.
		 * Hesaplama işlemlerinde çok daha efektif sonuçlar alınabilir.
		 */
		System.out.println("Şimdiki zaman: " + System.currentTimeMillis()); //Şimdiki zaman: 1682404582417
		/*
		 * Date
		 * Çoğu method deprecated olmuş durumdadır
		 * Yeni yeni java versiyonlarında tamamen kaldırılacaktır
		 * Programınızı yeni java versiyonlarından yazmak durumunda kalırsanız bunlar desteği kalkcağı icin yeniden yazılmak durumundadır
		 */
		Date date= new Date();
		System.out.println("Tarih: " + date);
		System.out.println("Tarih: " + date.getTime()); //Long tutuyor 
		System.out.println("Tarih: " + date.getDate());	//Ayın kaçıncı günü
		System.out.println("Tarih: " + date.getDay());  //Haftanın kaçıncı günü
		/*
		 * LocalDate, > Tarih 25/04/2023
		 * LocalTime, > Zaman 09:57:53
		 * LocalDateTime, > Tarih + Zaman
		 * ZonedDateTime,			
		 */
		System.out.println("Local Date: " + LocalDate.now());
		LocalDate bugun = LocalDate.now();
		System.out.println(bugun.getDayOfMonth());
		System.out.println(bugun.getDayOfYear());
		System.out.println(bugun.getDayOfWeek());
		System.out.println();
		System.out.println(bugun.getYear());
		System.out.println(bugun.getMonth());
		System.out.println(bugun.getMonthValue());
		System.out.println("LeapYear: " + bugun.isLeapYear());
		System.out.println();
		LocalDate yarin = bugun.plusDays(1);
		System.out.println("Yarin: " + yarin);
		LocalDate dun = bugun.minusDays(1);
		System.out.println("Dun: "+ dun);
		System.out.println();
		
		System.out.println(bugun.minusMonths(4));
		
		LocalDate belirledigimTarih = LocalDate.of(2020, 2, 28);
		System.out.println(belirledigimTarih.plusMonths(1));
		belirledigimTarih = belirledigimTarih.plusMonths(2);
		System.out.println(belirledigimTarih);
		System.out.println();
		System.out.println();
		LocalDate yuzYilOnce = LocalDate.now().minus(100,ChronoUnit.YEARS);
		LocalDate elliAyOnce = LocalDate.now().minus(100,ChronoUnit.MONTHS);
		System.out.println("Yuz Yil Oncesi: " + yuzYilOnce);
		System.out.println("Elli Ay Once: " + elliAyOnce);
		
		LocalDate besyuzGunSonra = LocalDate.now().plus(500,ChronoUnit.DAYS);
		System.out.println("500 Gun Sonrasi: "+ besyuzGunSonra);
		
		LocalDate belirledigimTarih2 = LocalDate.of(2025, Month.MAY, 22);
		System.out.println(belirledigimTarih2);
		System.out.println();
		System.out.println("Local Time: " + LocalTime.now());
		LocalTime zaman = LocalTime.now();
		System.out.println("Saat: " + zaman.getHour());
		System.out.println("Dakika: " + zaman.getMinute());
		System.out.println("Saniye: " + zaman.getSecond());
		System.out.println("Nano: " + zaman.getNano());
		System.out.println();
		LocalTime ikiSaatSonra = LocalTime.now().plusHours(2);
		System.out.println("Ikı Saat Sonra: " +ikiSaatSonra);
		LocalTime ikiSaatSonra2 = zaman.plus(2,ChronoUnit.HOURS);
		System.out.println("Iki Saat Sonra: " +ikiSaatSonra2);
		LocalTime onbesDakikaOnce = zaman.minus(15,ChronoUnit.MINUTES);
		System.out.println("15 Dakika Once: " +onbesDakikaOnce);
		LocalTime belirledigimZaman3 = LocalTime.of(12, 0, 50);
		System.out.println(belirledigimZaman3);
		
		LocalDateTime yerelZaman = LocalDateTime.of(belirledigimTarih2, belirledigimZaman3);
		System.out.println(yerelZaman);
		
		LocalDate ld = LocalDate.of(2000, 1, 31);
		System.out.println(ld);
		ld = ld.plusMonths(1);
		System.out.println(ld.plusMonths(1));
		
		
		ZonedDateTime zdt = ZonedDateTime.of(yerelZaman, ZoneId.of("Europe/Istanbul"));
		System.out.println(zdt);
		
		ZonedDateTime zdtIst = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
		System.out.println(zdtIst);
		
		ZonedDateTime zdtLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(zdtLondon);
		System.out.println("==========");
		Set<String> zoneId =  ZoneId.getAvailableZoneIds();
		int sayac = 1;
		for (String string : zoneId) {
			System.out.println(sayac++ +"-"+ string);
		}
		
		LocalDateTime ikibinYilOnce = LocalDateTime.now().minus(2,ChronoUnit.MILLENNIA);
		System.out.println("2 Milenya Oncesi(2000Yıl): " + ikibinYilOnce);
		/*
		 * Period Kullanımı
		 */
		LocalDate dogumGunu = LocalDate.of(2015, 5, 23);
		LocalDate bugun2 = LocalDate.now();
		Period gecenSure = Period.between(dogumGunu, bugun2);
		System.out.println(gecenSure.getYears() + " yil " + gecenSure.getMonths() + " ay " + gecenSure.getDays() + " gunluksunuz");
		
		Period period = Period.ofDays(1000);
		System.out.println(dogumGunu.plus(period));
		
		/*
		 * Yapılan işlem süresi takibi
		 */
		Long calismaBaslangic = System.currentTimeMillis();
		Long calismaBaslangic2 = System.nanoTime();
		Instant baslangicIns = Instant.now();
		long toplam = 0;
		for (long i = 0; i < 20_000_000_000L; i++) {
			toplam++;
		}
		Long calismaBitis = System.currentTimeMillis();
		Long calismaBitis2 = System.nanoTime();
		Instant bitisIns = Instant.now();
		System.out.println("Milisaniye: " + (calismaBitis-calismaBaslangic));
		System.out.println("Nanosaniye: " + (calismaBitis2-calismaBaslangic2));
		/*
		 * Duration: Geçen süre
		 */
		Duration duration = Duration.between(baslangicIns, bitisIns);
		System.out.println("Instant Milisaniye: " + duration.toMillis());
		System.out.println("Instant Nanosaniye: " + duration.toNanos());
		
		/* 
		 * DateTimeFormatter
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		LocalDate dogumGunu2 = LocalDate.of(2015, 5, 23);
		System.out.println("Formatsiz hali: " + dogumGunu2);
		System.out.println("Formatli hali: " + dogumGunu2.format(dtf));
		
		System.out.println(dogumGunu2.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));
		
		
//		System.out.println("Local Time: " + LocalTime.now());
//		
//		System.out.println("Local DateTime: " + LocalDateTime.now());
//		
//		System.out.println("Local ZonedTime: " + ZonedDateTime.now());
		
		
	}

}
