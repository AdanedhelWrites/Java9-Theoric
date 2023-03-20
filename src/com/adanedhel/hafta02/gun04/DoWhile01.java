package com.adanedhel.hafta02.gun04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num;

		do {
			System.out.println("Bir sayi gir 0 girersen program sonlanir");
			num = input.nextInt();
			sum += num;
			

		} while (num != 0);
		System.out.println("Girilenlerin toplami: " + sum);
		input.close();
	}

}
