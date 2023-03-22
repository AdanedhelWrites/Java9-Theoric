package com.adanedhel.hafta03.gun03;

public class CokBoyutluSinifList {

	public static void main(String[] args) {
		String[][] sinifListesi = new String[4][4];
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ece";
		sinifListesi[0][3] = "80";

		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Su";
		sinifListesi[1][3] = "60";

		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Ali";
		sinifListesi[2][3] = "50";

		sinifListesi[3][0] = "4";
		sinifListesi[3][1] = "104";
		sinifListesi[3][2] = "Ertan";
		sinifListesi[3][3] = "30";
		// Cok boyutlu dizi tum elemanlari listeleme
		for (int i = 0; i < sinifListesi.length; i++) {// satir sayisina kadar gider..
			for (int j = 0; j < sinifListesi[i].length; j++) {
				System.out.print(sinifListesi[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("***********************");
		// dizide belirli bir satırdaki elemanları yazdır
		// [0][0] [0][1] [0][2] [0][3]
		int yazdirilacakSatir = 0;
		for (int i = 0; i < sinifListesi[yazdirilacakSatir].length; i++) {
			System.out.print(sinifListesi[yazdirilacakSatir][i] + "\t");

		}
		System.out.println("\n************************");

		// dizideki belirli sütundaki elemanları yazdırma
		// [0][0] [1][0] [2][0] [3][0]
		int yazdirilacakSutun = 3;
		for (int i = 0; i < sinifListesi.length; i++) {
			System.out.println(sinifListesi[i][yazdirilacakSutun]); // sutunu elinden de girebilirsin 0,1,2,3
		}
		System.out.println("\n*************************************");
		int top = 0;
		for (int i = 0; i < sinifListesi.length; i++) {

			int notlar = Integer.parseInt(sinifListesi[i][3]);
			top += notlar;

		}
		System.out.println("Toplam: " + top + "\nOrtalama: " + (top / sinifListesi.length));

	}

}
