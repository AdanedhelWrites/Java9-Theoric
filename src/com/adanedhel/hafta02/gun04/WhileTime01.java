package com.adanedhel.hafta02.gun04;
import java.util.Scanner;
public class WhileTime01 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num;
		System.out.println("Bir sayi gir 0 girersen program sonlanir");
		while((num = input.nextInt()) != 0) {
			sum += num;
			System.out.println("Bir sayi girin 0a basarak sonlandirin");
					
		}
		System.out.println("Girilenlerin toplami: " + sum);
		input.close();
	}

}
