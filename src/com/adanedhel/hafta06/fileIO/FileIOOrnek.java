package com.adanedhel.hafta06.fileIO;

import java.io.*;
import java.util.Scanner;
public class FileIOOrnek {
/*
 * IO: Input Output. Byte byte gerceklestirilir. 8bit. 1byte 1 karakterdir.
 * Source -> Stream -> Destination
 * 
 */
	//OutputStream Yazma islemleri icin kullanilan abstract sinif
			//icindeki 3 metod:
			//write(): byte dizisini yazmak icin kullanilir.
			//flush(): tamponlanmıs veriyi hizli sekilde yazar
			//close(): outputStream'i kapatmaya yarar
			
			//InputStream: okuma islemleri icin kullanilir
			//InputStream: 2 metod cok önemli:
			//read(): veriyi okumak icin kullanilir. Dosyada okunacak karakter kalmadıysa -1 döner
			//close(): InputStream'i kapatmaya yarar
			
			//Dosya yazmak icin: FileOutputStream sinifini kullanacagiz.
			//Dosyadan okuma için: FileInputStream sinifini kullanacagiz.
			
			//Source > FileInputStream > Java programiniz
			//Java programiniz< > FileOutputStream > Dosya
	public static void main(String[] args) {
		//yazma:
		System.out.println("Java"); //Consola programdan veri aktarmak icin kullanilir
		//okuma:
		Scanner input = new Scanner(System.in); //Consoldan programa veri aktarmak icin kullanilir
		//bu islemerde de byte byte aktarim soz konusudur.
		
		//1.YOL
		FileOutputStream fos = null;
		//File file= new File("belge.txt");
		try {
			fos = new FileOutputStream("C:\\javaFiles\\belge.txt",true);
			fos.write('A');
			fos.write('D');
			fos.write('A');
			fos.write('N');
			fos.write('E');
			fos.write('D');
			fos.write('H');
			fos.write('E');
			fos.write('L');
			//write(byte[] b) kullanimi
			byte[] byteArray = {' ','A','D','A','N','E','D','H','E','L'};
			fos.write(byteArray);
			
			String sehir = " Istanbul";
			fos.write(sehir.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Fos'a file eklenirken sikinti meydana geldi");
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Yazma isleminde hata meydana geldi");
			e.printStackTrace();			
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.out.println("Fos kapatmada sikinti var");
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
