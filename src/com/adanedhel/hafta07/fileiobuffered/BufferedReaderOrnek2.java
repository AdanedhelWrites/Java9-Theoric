package com.adanedhel.hafta07.fileiobuffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BufferedReaderOrnek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ogrenci> ogrListe = new ArrayList<>();
		try(Scanner sc= new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){
			while (sc.hasNextLine()) {
				String okunanSatir = (String) sc.nextLine();
				//csv dosyalari: Excelden ,
				String dizi[] = okunanSatir.split(",");
				Ogrenci ogr = new Ogrenci(dizi[0],Integer.parseInt(dizi[1]));
				ogrListe.add(ogr);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Ogrenci ogrenci : ogrListe) {
			System.out.println(ogrenci);
		}
	}

}
