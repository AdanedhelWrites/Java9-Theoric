package com.adanedhel.hafta04.gun05;

public class Main {

	public static void main(String[] args) {
		Kutuphane cafeKutuphane = new Kutuphane();
		Kitap kitap1 = new Kitap("978 852 02 2336 5", "Hobbit", "J.R.R Tolkien", 200, "1929", "Tolkien Studio", "Bilim Kurgu", 1);
		Kitap kitap2 = new Kitap("978 852 02 2556 5", "Return of the king", "J.R.R Tolkien", 200, "1938", "Tolkien Studio", "Bilim Kurgu", 2);
		
		cafeKutuphane.kitapEkle(kitap1);		
		cafeKutuphane.kitapEkle(kitap2);
		cafeKutuphane.tumKitapListesi();
		
		System.out.println("===============================================");
		Uye uye1=new Uye("Turin", "Turambar", "23423232", "232323232", "Sivas", "2023", 0, 0);
		Uye uye2=new Uye("Ali", "Sivali", "2398932", "23253453432", "Kars", "2023", 0, 0);
		Uye uye3=new Uye("Selim", "Furkan", "23423232", "277723232", "Elzaig", "2022", 0, 0);
		cafeKutuphane.uyeEkle(uye1);
		cafeKutuphane.uyeEkle(uye2);
		cafeKutuphane.uyeEkle(uye3);
		cafeKutuphane.tumUyeListesi();
		
		cafeKutuphane.oduncVer(kitap1, uye3, "2023");
		cafeKutuphane.oduncVer(kitap1, uye2, "2023");
		cafeKutuphane.oduncListele();
	}

}
