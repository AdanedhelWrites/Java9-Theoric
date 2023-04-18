package com.adanedhel.hafta06.fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderListedenOgrOlustur {

	public static void main(String[] args) {
		List<Ogrenci> ogrListem = new ArrayList<>();
		//okuma için Scanner'i bir deniyelim
		
		
		
		try(Scanner input=new Scanner(new FileReader("liste.txt")))//parantez içi yani resources closeable içermek zorundadır!!
		{
			while(input.hasNextLine()) {
				String s = input.nextLine();
				System.out.println(s);
				String[] array = s.split(",");
				System.out.println(array[0]+ "-"+array[1]);
				Ogrenci ogr1 = new Ogrenci(array[0], Integer.parseInt(array[1]));
				ogrListem.add(ogr1);
			}
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for (Ogrenci ogrenci : ogrListem) {
			System.out.println(ogrenci);
		}
	}

}
