package com.adanedhel.hafta04.gun05;

public class Kutuphane {
	private Kitap[] kitaplar;
	private Uye[] uyeler;
	private Odunc[] oduncListesi;	
	private int kitapSayisi;
	private int uyeSayisi;
	private int uyeIndex;
	private int oduncSayisi;

	public Kutuphane() {
		kitaplar = new Kitap[200];
		uyeler = new Uye[50];
		oduncListesi = new Odunc[100];
		kitapSayisi = 0;
		uyeSayisi = 0;
		oduncSayisi = 0;

	}

	public void kitapEkle(Kitap kitap) {

		if (kitapSayisi < 200) {
			kitaplar[kitapSayisi] = kitap;
			kitapSayisi++;
		} else
			System.out.println("Kitap eklenemiyor");

	}

	public void uyeEkle(Uye uye) {
		uyeIndex++;
		uye.setUyeNo(uyeIndex);
		if (uyeSayisi < 50) {
			uyeler[uyeSayisi] = uye;
			uyeSayisi++;
		} else
			System.out.println("Kutuphane Dolu uye alinamiyor");

	}

	public void tumKitapListesi() {
		System.out.println("Kitap adi \tKitap yazari \t Kitap adet ");
		for (Kitap kitap : kitaplar) {
			if (kitap != null) {
				System.out.println(
						kitap.getKitapIsmi() + "\t\t" + kitap.getKitapYazari() + "\t\t" + kitap.getKitapAdedi());
			}
		}
	}

	public void tumUyeListesi() {
		System.out.println("Uye No \t\t Uye adi \t\t Uye Soyad\t\t Odunc Kitap Sayisi");
		for (Uye uye : uyeler) {
			if (uye != null) {
				System.out.println(uye.getUyeNo() + "\t" + uye.getUyeIsim() + "\t\t" + uye.getUyeSoyisim() + "\t\t"
						+ uye.getOduncAldigiKitapSayisi());
			}
		}
	}

	public boolean oduncVer(Kitap kitap, Uye uye, String oduncTarihi) {
		if (oduncSayisi >= uyeler.length * 2) {
			System.err.println("Odunc verme kapasitesi dolu!!");
			return false;
		}
		if (uye.getPuan() >= 0 && kitap.getKitapAdedi() > 0) {
			oduncListesi[oduncSayisi++] = new Odunc(kitap, uye, oduncTarihi);
			kitap.setKitapAdedi(kitap.getKitapAdedi()-1);
			return true;
		} else {
			System.out.println("Puan yetersiz..");// else ifle kontrol et devam ordan 
		}

		return false;
	}

	public void oduncListele() {
		System.out.println("Odunc Uye\t Odunc Kitap\t Odunc Tarihi");
		for (Odunc odunc : oduncListesi) {
			if (odunc != null) {
				System.out.println(odunc.getUye().getUyeNo() + "\t" + odunc.getUye().getUyeIsim() + " \t"
						+ odunc.getKitap().getKitapIsmi() + "\t\t\t" + odunc.getOduncAlinmaTarihi());
			}
		}
	}

}
