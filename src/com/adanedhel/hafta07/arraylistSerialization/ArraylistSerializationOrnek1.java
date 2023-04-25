package com.adanedhel.hafta07.arraylistSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArraylistSerializationOrnek1 {
	public static void main(String[] args) {		
		Ogrenci ogr2= new Ogrenci("Ogr2", 2);
		Ogrenci ogr3= new Ogrenci("Ogr3", 3);
		
		ArrayList<Ogrenci> ogrListe = new ArrayList<>();
		ogrListe.add(new Ogrenci("Ogre1", 1));
		ogrListe.add(ogr2);
		ogrListe.add(ogr3);
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))){
			out.writeObject(ogrListe);
		} catch (FileNotFoundException e) {
			System.err.println("Dosya bulunamadi");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Dosyalastirildi");
	}

}
