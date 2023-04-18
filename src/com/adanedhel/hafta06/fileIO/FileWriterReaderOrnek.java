package com.adanedhel.hafta06.fileIO;

import java.io.*;
import java.util.Scanner;

public class FileWriterReaderOrnek {
//FIS & FOS : Butun dosya turleri üzerinde okuma yazma işlemleri yapıyorduk
	//Sadece metin dosyaları üzerinde çalışmak istersek: FileWriter ve FileReader kullanılabilir.
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw=new FileWriter("dosya.txt");
			fw.write("Orcs must die");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//try-with-resources: Kaynaklarla calışan try
		//bunun kullanılması için
		//içindeki sınıfın Closable interfaceini implements etmek lazım
		//Bu sayede try içinde acılan yapılar otomatik olarak kapatılır..
		//Artık finally blouguna acılan bu IO Stream öğelerini kapatmak için ihtiyaç duyulmaz.
		Scanner input;
		try(FileWriter fw2 = new FileWriter("dosya2.txt")){
			
			//Dosyaya yazılacak metni kullanıcı girsin: -1 girene kadar girsin
			input = new Scanner(System.in);
			String girdi = "";
			String metin = "";
			while(!(girdi=input.nextLine()).equals("-1")) {
				metin += girdi+"\n";
			}
			fw2.write(metin);
//			while (!girdi.equals("-1")) {
//				if (!girdi.equals("")) {
//					metin += girdi+"\n";
//				}
//				girdi = input.nextLine();					
//			}
//			fw2.write(metin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
