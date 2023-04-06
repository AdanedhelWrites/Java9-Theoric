package com.adanedhel.hafta05.interfacesornek;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		IUcabilir beyazPacaliGuvercin = new Guvercin("Piluyu", 2, 15);
		IUcabilir miniSerce = new Serce("Pitubi", 1, 5);
		HayvanBakicisi hb = new HayvanBakicisi();

		beyazPacaliGuvercin.gagala("yem");
		miniSerce.gagala("Yem");

		hb.kisaSureliUc(miniSerce);
		hb.kisaSureliUc(beyazPacaliGuvercin);

		hb.belirtilenSureUc(miniSerce, 5);
		hb.belirtilenSureUc(beyazPacaliGuvercin, 3);
		System.out.println("**********************************");

		IKuyruklu k = new Kopek("Karabas", 10, 55);
		IKuyruklu kedi = new Kedi("Sulo", 5, 35);

		hb.sevinme(k, 5);
		hb.sevinme(kedi, 3);
		
		hb.hayvaniOynat(kedi);
		IKuyruklu kangal = new Kopek("Kangal",7,120);
		hb.hayvaniOynat(kangal);
		
		ArrayList<IKuyruklu> kuyrukluHayvanListe = new ArrayList<>();
		kuyrukluHayvanListe.add(kedi);
		kuyrukluHayvanListe.add(k);
		hb.hayvanlariOynat(kuyrukluHayvanListe);

	}

}
