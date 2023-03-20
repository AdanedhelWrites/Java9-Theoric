package com.adanedhel.hafta02.gun04;
import java.util.Scanner;

public class WhileTime03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime giriniz harf sayisini bulalim: ");
		String kelime = input.next();
		
		int uzunluk=0;
		
		while (uzunluk< kelime.length()) {
			uzunluk++;
			
			
		}
		System.out.println("Kelimenin harf sayisi: " + uzunluk);
		input.close();
	}

}
