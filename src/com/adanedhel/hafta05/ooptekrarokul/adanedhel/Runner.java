package com.adanedhel.hafta05.ooptekrarokul.adanedhel;

import java.util.ArrayList;

import com.adanedhel.hafta05.ooptekrarokul.entities.*;


public class Runner {

	public static void main(String[] args) {
		//ogrenciler
		Ogrenci ogr1 = new Ogrenci("Ibo", "Kara", 500, 0);
		Ogrenci ogr2 = new Ogrenci("Kemal", "Ak", 501, 0);
		Ogrenci ogr3 = new Ogrenci("Gizem", "Soner", 502, 0);
		Ogrenci ogr4 = new Ogrenci("Kamil", "Karabas", 503, 0);
		//siniflar
		Sinif sinif1 = new Sinif("1A", "Zemin Kat 101 nolu derslik",new ArrayList<Ogrenci>());
		sinif1.getOgrenciler().add(ogr1);
		sinif1.getOgrenciler().add(ogr2);
		sinif1.getOgrenciler().add(ogr3);
		sinif1.getOgrenciler().add(ogr4);
		//siniftaki ogrencileri lsitese
		sinif1.ogrListele();
		
		//2. sinif için ögrenci atama
		Ogrenci ogr5 = new Ogrenci("Cem", "Kara", 505, 0);
		Ogrenci ogr6 = new Ogrenci("Celal", "Ak", 506, 0);
		Ogrenci ogr7 = new Ogrenci("Cenk", "Soner", 507, 0);
		Ogrenci ogr8 = new Ogrenci("Can", "Karabas", 508, 0);
		//ArrayList olusturma ve arrayliste ogrenci ekleme
		ArrayList<Ogrenci> sinif2ogrenciListesi = new ArrayList<>();
		sinif2ogrenciListesi.add(ogr5);
		sinif2ogrenciListesi.add(ogr6);
		sinif2ogrenciListesi.add(ogr7);
		sinif2ogrenciListesi.add(ogr8);
		//sinif oluşturma
		Sinif sinif2 = new Sinif("1B", "Zemin Kat 102 Nolu derslik", sinif2ogrenciListesi);
		sinif2.ogrListele();
		
		//3. sinif ogrenciler
		Ogrenci ogr9 = new Ogrenci("Ali", "Leyn", 507, 0);
		Ogrenci ogr10 = new Ogrenci("Adnan", "Lol", 508, 0);
		Ogrenci ogr11 = new Ogrenci("Asim", "Cani", 509, 0);
		Ogrenci ogr12 = new Ogrenci("Asli", "Kiyo", 510, 0);
		
		Sinif sinif3 = new Sinif("2A","1. Kat 201 Nolu derslik");
		ArrayList<Ogrenci> sinif3ogrenciListesi = new ArrayList<>();
		sinif3ogrenciListesi.add(ogr9);
		sinif3ogrenciListesi.add(ogr10);
		sinif3ogrenciListesi.add(ogr11);
		sinif3ogrenciListesi.add(ogr12);
		
		sinif3.setOgrenciler(sinif3ogrenciListesi);
		sinif3.ogrListele();
		
		//sinif4 ögrenciekle methodu ile
		Ogrenci ogr13 = new Ogrenci("Ferin", "Kara", 552, 0);
		Ogrenci ogr14 = new Ogrenci("Fahri", "Ak", 521, 0);
		Ogrenci ogr15 = new Ogrenci("Felal", "Soner", 553, 0);
		Ogrenci ogr16 = new Ogrenci("Fini", "Karabas", 565, 0);
		Sinif sinif4=new Sinif("2B", "1. Kat 202 Nolu derslik");
		sinif4.ogrenciEkle(ogr13);
		sinif4.ogrenciEkle(ogr14);
		sinif4.ogrenciEkle(ogr15);
		sinif4.ogrenciEkle(ogr16);
		sinif4.ogrListele();
		//sinif5 ogrenci
		Sinif sinif5= new Sinif("3A","2. Kat 301 Nolur derslik");
		sinif5.ogrenciEkle("Kaan","Kantil",580,0);
		sinif5.ogrenciEkle("Leyle","Kanil",585,0);
		sinif5.ogrenciEkle("Sakir","Melor",568,0);
		sinif5.ogrenciEkle("Lilith","Sanki",591,0);
		sinif5.ogrListele();
		//System.out.println(sinif5.getOgrenciler().get(3).getAd());
		
		//Okul oluşturma. Sinifi okula ekle ve listele
		Okul okul1= new Okul("Gazi Mustafa Kemal Pasa","Istanbul");
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif2);
		okul1.sinifEkle(sinif3);
		okul1.sinifEkle(sinif4);
		okul1.sinifEkle(sinif5);
		//okuldaki siniflari lsitelem
		okul1.sinifYazdir();
		//okuldaki siniftakki ögrenci liste
		okul1.okulOgrListe();
		
	}

}
