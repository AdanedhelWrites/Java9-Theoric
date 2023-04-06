package com.adanedhel.hafta05.interfacekatman;

import com.adanedhel.hafta05.interfacekatman.repository.entities.*;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusteriUrunRepositoryImplement dbMusteri = new MusteriUrunRepositoryImplement();
		dbMusteri.kaydet(new Musteri("Kemal", "Kemcal", "delikedi", "1234"));
		dbMusteri.kaydet(new Musteri("mert", "soylu", "akillikedi", "12354"));
		UrunRepositoryImplement dbUrun=new UrunRepositoryImplement();
		dbUrun.kaydet(new Urun());
		dbMusteri.listele();
	}

}
