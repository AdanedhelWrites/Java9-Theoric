package com.adanedhel.hafta06.exceptions;

import java.util.Scanner;

public class MultiCatchOrnek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int bolen = input.nextInt();
			int sonuc = 20 / bolen;
			
			int[] dizi = {10,20,30};
			System.out.println(dizi[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.toString());			
		}finally {
			System.out.println("Finally calisti");
		}
		
		
		
		System.out.println("Calismaya devam eder");

	}

}
