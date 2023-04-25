package com.adanedhel.hafta07.fileiobuffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterOrnek2 {

	public static void main(String[] args) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))){//TRUE DEMEK eklemeyi izin veriyorsun yeni birşey yazıyor false olursa önceden ekledigini siler.
			writer.write("Selim Furkan,101\n");
			writer.write("Cem Adsever,102\n");
			writer.write("Kenan Neler,103\n");
			writer.write("Suleyman Adsiz,104\n");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Yazma islemi tamamlandi");
	}
	}


