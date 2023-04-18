package com.adanedhel.hafta06.exceptions;

import java.util.Scanner;

public class MatematikIslemleri {

	public static void main(String[] args) {
		System.out.println("Matematik islemler");
		System.out.println("1-->Topla");
		System.out.println("2-->Cikar");
		System.out.println("3-->Carpma");
		System.out.println("4-->Bolme");
		System.out.println("0-->Cikis");
		Scanner input = new Scanner(System.in);
		int secim = input.nextInt(); input.nextLine();
		if (secim > 4 || secim < 0) {
			isle();
			
		}else
			System.out.println("Helal kanks.. Switch case baslarsin burdan sonra");
	}
	
	
	public static void isle() {
		try {
			throw new WrongChoiceException();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
