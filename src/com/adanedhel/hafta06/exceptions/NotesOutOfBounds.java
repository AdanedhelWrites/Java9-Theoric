package com.adanedhel.hafta06.exceptions;

public class NotesOutOfBounds {
	public static void notKontrolcu(int not) throws userDefinedException {
		if (not < 0 || not > 100) {
			throw new userDefinedException();
		}else
			System.out.println("Not Duzgun Girildi.");
	}
	public static void main(String[] args) {
		try {
			notKontrolcu(150);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Program devam ediyor");
	}
}
