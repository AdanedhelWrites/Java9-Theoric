package com.adanedhel.hafta06.exceptions;

public class WrongChoiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	WrongChoiceException(){
		
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Secim 0 ile 4 arasinda olmalidir";
	}
	
}
