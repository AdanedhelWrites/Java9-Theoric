package com.adanedhel.hafta07.fileiobuffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderOrnek {

	public static void main(String[] args) {
		//dosyadanBirSatir();
		dosyayiKompleOku();
	}

	public static void dosyadanBirSatir() {
		try(BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))){
			String okunanSatir = reader.readLine();//satır satır okuma yapılabilir.
			System.out.println(okunanSatir);
			String okunanSatir2 = reader.readLine();//satır satır okuma yapılabilir.
			System.out.println(okunanSatir2);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void dosyayiKompleOku() {
		try(BufferedReader reader = new BufferedReader(new FileReader("liste.txt"))){//TÜM DOSYAYI TEK TEK OKUR VE ÇIKARTIR SORUNSUZ ŞEKİLDE
			String okunanSatir = null;
			int sayac = 1;
			while (reader.readLine() != null) {				
				System.out.println(sayac+ " -> " +okunanSatir);						
				sayac++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
}
