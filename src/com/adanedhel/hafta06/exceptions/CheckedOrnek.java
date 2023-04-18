package com.adanedhel.hafta06.exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedOrnek {
	//Checked exceptions: kontrolü zorunlu olan exceptionlardır.
	//Derleme zamanında kontrolü zorunlu kılar.
	//Bu kontrol2 yolla sağlanır.
	//1. yol: Try-Catch içine alarak
	//2. yol: throws parametresi ekleyerek.
	public static void main(String[] args) throws InterruptedException {
		FileInputStream file_data= null;
		//1.YOL
		try {
			file_data = new FileInputStream("C:/javaFiles/Hello.txt");
			int m;
			try {
				while((m=file_data.read())!= -1) {
					System.out.print((char)m);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
			//burda log tutulabilir burası KRİTİK BENİM İÇİN
			System.out.println("Catch blogundayiz");
		}finally {
			try {
				file_data.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Calismaya devam ediyoruz");
		//Unhandled exception type FileNotFoundException
		
			//2.YOL: YUKARIYA THROWS ILE EXCEPTION ATTIK
			Thread.sleep(1000);
			System.out.println("Calismaya devam ediyoruz");
		
			// TODO Auto-generated catch block
			
		//Unhandled exception type InterruptedException
			
		
	//BURDAN SONRASIDA FARKLI BİR BAKIŞ AÇISI
		try {
			dosyaOku();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void dosyaOku() throws IOException{
		FileInputStream file_data1 = null;
		file_data1 = new FileInputStream("C:/javaFiles/Hello.txt");
		int m;
		while((m=file_data1.read()) != -1) {
			System.out.println((char)m);
		}
		file_data1.close();
	}
}
