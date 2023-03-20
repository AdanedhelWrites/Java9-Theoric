package com.adanedhel.hafta02.gun03;

public class Gun3Deneme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b;
		int i = 257;
		double d= 323.142;
		System.out.println("int >> btye oluyor");
		b = (byte) i ;
		System.out.println("i = " + i + " b = "+ b);
		System.out.println("Double >> int oluyor");
		i = (int)d;
		System.out.println(" d = "+d+" b = "+i );
		System.out.println("double >> byte oluyor");
		b=(byte)d;
		System.out.println("d = " + d + " b = "+b);

	}

}
