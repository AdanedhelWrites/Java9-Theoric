package com.adanedhel.hafta07.fileiobuffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek {
/*
 * Fenerbahce
Galatasaray
Karagumruk
Besiktas
UskudarSpor
Basaksehir
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("liste.txt",true))){//TRUE DEMEK eklemeyi izin veriyorsun yeni birşey yazıyor false olursa önceden ekledigini siler.
			writer.write("AltaySpor\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Yazma islemi tamamlandi");
	}

}
