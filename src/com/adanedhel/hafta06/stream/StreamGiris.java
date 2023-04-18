package com.adanedhel.hafta06.stream;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGiris {
	//stream bir veri yapısı değildir. veri saklamaz. veri tabanı gibi kullanılmaz
	//stream oluşturmak veri kaynağında değişikliğe sebep olmaz
	public static void main(String[] args) {
		//Stream oluşturma
		Stream<String> bosKayit = Stream.empty(); // boş bir stream oluşturur
		Stream<String> tekKayit = Stream.of("Pazartesi"); //tek kayıtlı stream oluşturur
		Stream<Double> cokKayit = Stream.of(2.0,5d,15d,20d); //çok kayıtlı bir stream oluşturur
		List<String> gunler = List.of("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"); 
		//listeyi akışa çevirme
		Stream<String> gunlerStream = gunler.stream();
		gunlerStream.forEach(System.out::println);
		
		
		List<Personel> personeller = new ArrayList<>();
		personeller.add(new Personel(1, "Tarkan", "Tevetoğlu", "Müzik", 10000));
		personeller.add(new Personel(2, "Cem", "Yılmaz", "Sinema", 15000));
		personeller.add(new Personel(3, "Seda", "Sayan", "Televizyon", 12000));
		personeller.add(new Personel(4, "Kıvanç", "Tatlıtuğ", "Dizi", 20000));
		personeller.add(new Personel(5, "Demet", "Akbağ", "Sinema", 13000));
		personeller.add(new Personel(6, "Kenan", "İmirzalıoğlu", "Dizi", 18000));
		personeller.add(new Personel(7, "Beren", "Saat", "Dizi", 18000));
		personeller.add(new Personel(8, "Murat", "Boz", "Müzik", 12000));
		personeller.add(new Personel(9, "Cansu", "Dere", "Dizi", 16000));
		personeller.add(new Personel(10, "Serenay", "Sarıkaya", "Dizi", 16000));
		
		Stream<Personel> personelStream = personeller.stream(); // stream methodu her geldiğinde akış başlatılır.
		
		//stream.of içierisine atılan arraydan akış oluşturma
		Stream<Personel> personelStream1 = Stream.of(personeller.toArray(new Personel[personeller.size()]));
		//arrays.stream yukarıdakiyle aynı işi yapar
		Stream<Personel> personelStream2 = Arrays.stream(personeller.toArray(new Personel[personeller.size()]));
		
		//method 1 : ForEach: Streamdeki her bir öğe için verilen işlemi gerçekleştirir.
		//personelStream.forEach(p -> System.out.println(p));
		for (Personel personel : personeller) {			
			System.out.println(personel);
		}
		System.out.println("*********************");
		//personellerin maaşına %10 zam yap ve foreachle dağıt
		personeller.stream().forEach(p -> p.maasArtir(10.0));
		for (Personel personel : personeller) {			
			System.out.println(personel);
		}
		System.out.println("*********************");
		personeller.stream().forEach(p -> System.out.println(p));
		//System.out.println(personeller.get(1).getMaas()); //en son ki değişiklikler kalıyormuş
		
		//2.method filter streamdeki verileri kosula göre filtrelicek ve yeni bir stream oluşturucak
		System.out.println("*********************");
		System.out.println("*********************");
		
		personeller.stream()
		.filter(p -> p.getAd().contains("e"))
		.forEach(p -> p.maasArtir(10.0));; //isminde e harfi olanları filtreliyecek
		//Personel{id=2, ad='Cem', soyad='Yılmaz', departman='Sinema', maas=16500.0}
		for (Personel personel : personeller) {
			System.out.println(personel);
		}
		System.out.println("*********************");
		personeller.stream()
		.filter(p -> p.getMaas()<18000)
		.forEach(p -> p.maasArtir(10.0));;
		for (Personel personel : personeller) {
			System.out.println(personel);
		}
		//3.method Distinct: 1,2,2,3,3,4 -> 1,2,3,4 birbirinden farklı elemanları alır. TEKİLLEŞTİRİR.
		//4. method Map: Koşula göre yeni stream oluşturdu
		System.out.println("*********************");
		personeller.stream().map(p -> p.getDepartman()).
		distinct().forEach(System.out::println);
		//5.  Method Sorted: sıralar.
		System.out.println("*********************");
		personeller.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		//6. Method Limit() akıştan kaç eleman alınacağını belirler
		//7. Method Skip() akıştan kaç eleman atlanacagını yazabilirsiniz.
		System.out.println("*********************");
		personeller.stream()
		.skip(2)
		.limit(5)
		.forEach(System.out::println);
		System.out.println("*********************");
		//8. Method Count() akıştaki eleman sayısını verir
		Long elemanSayisi = personeller.stream()
		.map(p-> p.getDepartman())
		.distinct().count();
		System.out.println(elemanSayisi);
		System.out.println("*********************");
		long elSay = personeller.stream()
		.filter(p -> p.getAd().startsWith("T"))  // K ile başlayanları yazdırır
		.count();
		System.out.println(elSay);
		
		long elSayisi= personeller.stream().count(); //Eleman saysını yazdırır
		System.out.println(elSayisi);
		//9.Method anyMatch() : Koşula uygun en az bir tane eleman varsa True döner
		//10.Method allMatch() :Tüm elemanlar koşula uyuyorsa True döner
		//11.Method noneMatch()	: Koşula hiç biri uymuyorsa true dönecek
		System.out.println("*********************");
		System.out.println(personeller.stream().
		anyMatch(p -> p.getMaas()<18000)); //Koşula uygun en az bir tane eleman varsa True döner
		System.out.println(personeller.stream().
				allMatch(p -> p.getMaas()<18000));//Tüm elemanlar koşula uyuyorsa True döner
		System.out.println(personeller.stream().
				noneMatch(p -> p.getMaas()<10000));//Tüm elemanlar koşula uymuyorsa true döner
		//12.Method map(): Üzerinde işlemler yapıp yeni bir akış oluşturabilir.
		System.out.println("*********************");
		personeller.stream()
		.filter(p -> p.getMaas() < 15000)
		.map(p-> p.getMaas()+5000) //Üzerinde işlem yapıp maaşları 5000 arttırdı
		.forEach(p -> System.out.println(p));
		//13. Method reduce(): Elemanları tek bir değerde işlemek için
		//reduce(başlangıç değeri, lambda expression
		System.out.println("*********************");
		List<Integer> sayilar = Arrays.asList(1,2,3,4,5);
		int top = sayilar.stream().reduce(0,(a,b) -> a+b);
		System.out.println(top);
		
		int carp = sayilar.stream().reduce(1,(a,b) -> a*b);
		System.out.println(carp);
		
		System.out.println("*********************");
		//Optional: Bu değişken boş olabilir.
		Optional<Integer> max = sayilar.stream().reduce(Integer::max); //Type mismatch: cannot convert from Optional<Integer> to int
		if (max.isPresent()) { //içinde eleman varsa. 
			System.out.println(max.get());
		}
		//14. Method Collect(): Streamden collection oluşturmayı sağlar.
		System.out.println("*********************");
		List<String> zamliMaas = personeller.stream()		
		.map(p -> p.getMaas()*2 +" TL") //yeni bir stream oluşturdu
		.collect(Collectors.toList());	//o streami List'e dönüştürdü
		for (String zamli : zamliMaas) {
			System.out.println(zamli);
		}
		//15. Method peek(): Göz gezdirmek
		System.out.println("*********************");
		Set<String> zamliM = personeller.stream()
				.peek(p -> System.out.println("Zamdan once " +p.getMaas()))
				.map(p -> p.getMaas()*2 +" TL") //yeni bir stream oluşturdu
				.peek(s -> System.out.println("Zamdan sonra " +s))
				.collect(Collectors.toSet());	//o streami List'e dönüştürdü
		for (String zam : zamliM) {
			System.out.println(zam);
		}
		//16. Collectors.joining birleştirme işlemi yapar
		List<String> kelimeler = List.of("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar");
		String yeniHali = kelimeler.stream()
		.collect(Collectors.joining("^^"));
		System.out.println(yeniHali);
	}
	

}
