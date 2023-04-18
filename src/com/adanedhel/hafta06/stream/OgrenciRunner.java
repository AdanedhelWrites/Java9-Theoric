package com.adanedhel.hafta06.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class OgrenciRunner {

	public static void main(String[] args) {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		ogrenciler.add(new Ogrenci(1, "Ahmet", "Yılmaz", "Makine Mühendisliği", 80.0));
		ogrenciler.add(new Ogrenci(2, "Mehmet", "Aksoy", "Elektrik Elektronik Mühendisliği", 60.0));
		ogrenciler.add(new Ogrenci(3, "Ayşe", "Kara", "Bilgisayar Mühendisliği", 90.0));
		ogrenciler.add(new Ogrenci(4, "Fatma", "Şahin", "Endüstri Mühendisliği", 75.0));
		ogrenciler.add(new Ogrenci(5, "Ali", "Yıldız", "Makine Mühendisliği", 85.0));
		ogrenciler.add(new Ogrenci(6, "Zeynep", "Süre", "Bilgisayar Mühendisliği", 95.0));
		ogrenciler.add(new Ogrenci(7, "Hakan", "Demir", "Elektrik Elektronik Mühendisliği", 55.0));
		ogrenciler.add(new Ogrenci(8, "Emine", "Kara", "Endüstri Mühendisliği", 70.0));
		ogrenciler.add(new Ogrenci(13, "Gül", "Kaya", "Bilgisayar Mühendisliği", 85.0));
		ogrenciler.add(new Ogrenci(14, "Ahmet", "Güçlü", "İnşaat Mühendisliği", 60.0));
		ogrenciler.add(new Ogrenci(19, "Ayşe", "Yıldız", "Gıda Mühendisliği", 80.0));
		ogrenciler.add(new Ogrenci(20, "Ali", "Öz", "Elektrik Elektronik Mühendisliği", 65.0));
		ogrenciler.add(new Ogrenci(21, "Fatma", "Tek", "Endüstri Mühendisliği", 75.0));
		ogrenciler.add(new Ogrenci(24, "Deniz", "Aksoy", "Bilgisayar Mühendisliği", 95.0));
		ogrenciler.add(new Ogrenci(25, "Merve", "Özdemir", "İnşaat Mühendisliği", 55.0));
		ogrenciler.add(new Ogrenci(30, "Hüseyin", "Yılmaz", "Gıda Mühendisliği", 70.0));
		// Öğrencileri yazdırma
		ogrenciler.stream().forEach(p -> System.out.println(p));
		// Not ortlaması 70 üzeri
		System.out.println("************************************");
		ogrenciler.stream().filter(p -> p.getNot() > 70).forEach(p -> System.out.println(p));
		// Bilgisayar Mühendislik öğrencilerinin sayısı
		System.out.println("************************************");
		System.out.println(ogrenciler.stream().filter(p -> p.getBolum().contains("Bilgisayar")).count());
		// Adi ali olan öğrencileri getir
		ogrenciler.stream().filter(p -> p.getAd().contains("Ali")).forEach(p -> System.out.println(p));
		System.out.println("************************************");
		// Adı hakan olan ögrenci
		System.out.println(ogrenciler.stream().anyMatch(p -> p.getAd().equals("Hakan")));
		// nota ögrenci siralayın
		System.out.println("************************************");
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNot)).forEach(p -> System.out.println(p)); // comparing getiriyor sıralamayı
		// Notu 70 ve üstü olanların isim ve bölüm
		System.out.println("************************************");
		ogrenciler.stream().filter(p -> p.getNot() > 70)
				.forEach(p -> System.out.println(p.getAd() + " " + p.getBolum()));
		// en yuksek not ortalamasi sahip ogrenci bilgileri
		System.out.println("************************************");
		ogrenciler.stream().sorted(Comparator.comparing(Ogrenci::getNot).reversed()).limit(1)
				.forEach(p -> System.out.println(p));

		System.out.println("************************************");
		Optional<Ogrenci> ogr = ogrenciler.stream().max(Comparator.comparing(Ogrenci::getNot));
		System.out.println(ogr.get());
		System.out.println("************************************");
		// bölümlere göre öğrencilerin not ortalamasını hesaplayın
		Map<String, Double> bolumOrt = ogrenciler.stream()
				.collect(Collectors.groupingBy(Ogrenci::getBolum, Collectors.averagingDouble(Ogrenci::getNot)));
		for (Map.Entry<String, Double> entry : bolumOrt.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			System.out.println(key + ":" + value);
		}

	}

}
