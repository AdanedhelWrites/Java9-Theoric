package com.adanedhel.hafta03.gun02;

public class CokBoyutluDizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] koordinatlar = { { 3, 7 }, { 2, 5 }, { 6, 10 } };
		int[][] noktalar = { { 1, 2, 3 }, { 2, 3, 4 } };

		int[][] dizi1 = new int[2][3];// 1.si satır 2.si sütun..

		dizi1[0][0] = 1;
		dizi1[0][1] = 2;
		dizi1[0][2] = 3;
		dizi1[1][0] = 4;
		dizi1[1][1] = 5;
		dizi1[1][2] = 6;
		System.out.println(dizi1.length);// satır sayısı uzunluğa denk geliyor
		System.out.println("************");
		for (int i = 0; i < dizi1.length; i++) {
			System.out.print(dizi1[i][0] + " ");
			System.out.print(dizi1[i][1] + " ");
			System.out.println(dizi1[i][2] + " ");

		}
		// sütun sayısı nasıl bulunur acaba?
		System.out.println("************");
		System.out.println(dizi1[0].length);// sütun sayısını gösteriyor
		System.out.println("************");
		// satır sütun sayısını for döngüsüyle gösteriyoruz
		for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j < dizi1[i].length; j++) {
				System.out.print(dizi1[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("********************");
		for (int i = 0; i < noktalar.length; i++) {
			for (int j = 0; j < noktalar[i].length; j++) {
				System.out.print(noktalar[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println("*******************");

		for (int i = 0; i < koordinatlar.length; i++) {
			for (int j = 0; j < koordinatlar[i].length; j++) {
				System.out.print(koordinatlar[i][j] + " ");

			}
			System.out.println();

		}
	}

}
