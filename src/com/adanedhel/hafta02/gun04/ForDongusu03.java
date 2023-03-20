package com.adanedhel.hafta02.gun04;

public class ForDongusu03 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) { // EN BUYUK OLAN EN NADİR OLAN EN BAŞTA OLUR !!! UNUTMA !!
				System.out.println("5KAT");
				
			}
			else if (i % 3 == 0) {
				System.out.println("3KAT");
				
			}
			else if (i % 5 == 0) {
				System.out.println("15kat");
				
			}
				
			
			else {
				System.out.println(i);
			}
			
		}
		// TODO Auto-generated method stub

	}

}
