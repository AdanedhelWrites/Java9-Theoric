package com.adanedhel.hafta06.exceptions;



public class userDefinedException extends Exception{ //Checked yapmak istersen : Exceptiondan miras al.
	//UnChecked exception için : RunTimeException'dan miras al.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//construcktor
	userDefinedException(){
		
	}
	@Override
	public String getMessage() {
		
		return "0-100 arasinda not girilmelidir.";
	}
	
	
}
