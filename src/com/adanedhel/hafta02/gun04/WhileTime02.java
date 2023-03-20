package com.adanedhel.hafta02.gun04;
import java.util.Scanner;
public class WhileTime02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int a = input.nextInt();
		int sonuc = 1;
		int temp = a;
		
		while(a > 0) {
			sonuc *= a;
			a--;
			
					
			
		}
		System.out.println(temp+"!" + " Faktorilyel = " + sonuc);
		input.close();
		
		

	}

}
