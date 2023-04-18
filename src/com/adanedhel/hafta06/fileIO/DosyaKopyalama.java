package com.adanedhel.hafta06.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DosyaKopyalama {
	// Kopya olusturmak:
	// 1. dosya okumam gerekir. okudugum belgenin degerlerini
	// 2. arraylisteteki verilerle yeni dosya yazmamız gerekir

	public static ArrayList<Integer> dosyaIcerik = new ArrayList<>();

	public static void main(String[] args) {
		dosyaOku("C:\\javaFiles\\belge.txt");
		kopyaOlustur("C:\\javaFiles\\belgeKopya.txt");
		
		dosyaOku("C:\\javaFiles\\turin.jpg");
		kopyaOlustur("C:\\javaFiles\\turin2.jpg");
	}

	public static void dosyaOku(String dosyaYolu) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(dosyaYolu);

			int okunanKarakter;
			while ((okunanKarakter = fis.read()) != -1) {
				dosyaIcerik.add(okunanKarakter);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya bulunamadi.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Dosya okuma hatasi.");
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void kopyaOlustur(String dosyaYol) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(dosyaYol);
			for (Integer data : dosyaIcerik) {
				fos.write(data);
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
