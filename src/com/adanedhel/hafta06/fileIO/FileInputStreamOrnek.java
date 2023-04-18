package com.adanedhel.hafta06.fileIO;
import java.io.*;
public class FileInputStreamOrnek {

	public static void main(String[] args) {
		dosyaOku("C:\\javaFiles\\belge.txt",8,9);
		
	}
	public static String dosyaOku(String dosyaYolu,int baslangic,int okunacakKarakterSayisi) {
		FileInputStream fis = null;
		String metin = "";
		try {
			fis=new FileInputStream(dosyaYolu);
			int ilkKarakter =fis.read();

			int okunanKarakter;
			fis.skip(baslangic);
			int sayac = 0;
			while ((okunanKarakter=fis.read())!= -1) {
				metin += (char)okunanKarakter;
				sayac++;
				if (sayac == okunacakKarakterSayisi) {
					break;
				}
			}
			System.out.println(metin);
		} catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya bulunamadi.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatasi.");
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return metin;
	}

}
