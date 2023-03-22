package com.adanedhel.hafta03.gun03;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		int[][] sayilar = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}};
		
		//dizideki her satir ve sütunu topla
		
		//[0][0]	[0][1]	[0][2]	[0][3]
		for (int i = 0; i < sayilar.length; i++) {
			int satirToplam = 0;
			for (int j = 0; j < sayilar[i].length; j++) {//sutün sayısı akdar ilerler
				satirToplam += sayilar[i][j];
			}
			System.out.println((i+1)+ ". satirin toplamı "+ satirToplam);
			
		}
		System.out.println("**********************");
		//2. adım sütun toplamları
		//[0][0] [1][0] [2][0] [3][0]
		for (int i = 0; i < sayilar[0].length; i++) { //sütun sayısı aldık 4'e kadar
			int sutunToplam = 0;
			for (int j = 0; j < sayilar.length; j++) { //satir sayısına kadar 3'e kadar
				sutunToplam +=sayilar[j][i];
			}
			System.out.println((i+1)+". sutun toplamı "+ sutunToplam);
		}

	}

}
