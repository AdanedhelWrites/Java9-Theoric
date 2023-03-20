package com.adanedhel.hafta02.gun04;
import java.util.Scanner;

public class WhileTime04KelimeTersi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kelime gir: ");
		String kelime = input.next();
		// TODO Auto-generated method stub
		String kelimeTers = " ";
		int i=kelime.length()-1;
		while (i>=0) {
			kelimeTers += kelime.charAt(i);
			i--;
			
		}
		if (kelime.equals(kelimeTers)) {
			System.out.println("Tersiyle aynidir.. Palindromdur.");
			
		}else {
			System.out.println("Tersi farkli");
		}
		input.close();
		
		
	}

}
