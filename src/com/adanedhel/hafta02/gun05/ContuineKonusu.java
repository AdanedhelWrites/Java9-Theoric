package com.adanedhel.hafta02.gun05;

public class ContuineKonusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);

		}
		int i = 1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	

	disDongu:for(

	int j = 0;j<3;j++)
	{
		for (int j2 = 0; j2 < 2; j2++) {
			if (j == 1 && j2 == 1) {
				break disDongu;
			}
			System.out.println(j + " " + j2);
		}
		}

	}

}


