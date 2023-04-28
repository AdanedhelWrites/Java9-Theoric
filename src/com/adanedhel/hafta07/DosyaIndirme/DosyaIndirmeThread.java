package com.adanedhel.hafta07.DosyaIndirme;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DosyaIndirmeThread {

	public static void main(String[] args) {
//		String dosyaYolu = "https://repo.zenk-security.com/Magazine%20E-book/Penetration%20Testing%20-%20A%20hands-on%20introduction%20to%20Hacking.pdf";
//		try (BufferedInputStream inputStream = new BufferedInputStream(new URL(dosyaYolu).openStream());
//				FileOutputStream fos = new FileOutputStream("hacksPDF.pdf")){
//			//dosyaBoyutu
//			
//			byte[] buffer = new byte[1024];
//			int okunanBytelar;
//			int inenDosyaBoyutu = 0;
//			while ((okunanBytelar = inputStream.read(buffer,0,1024)) != -1) {
//				fos.write(buffer, 0, okunanBytelar);
//				inenDosyaBoyutu+=okunanBytelar;
//				System.out.println("Inen dosya boyutu: " + inenDosyaBoyutu/1024);
//			}
//			
//			System.out.println();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		FileDownloadThread downloadThread = new FileDownloadThread("https://repo.zenk-security.com/Magazine%20E-book/Penetration%20Testing%20-%20A%20hands-on%20introduction%20to%20Hacking.pdf","hacks.pdf");
		downloadThread.start();
		long toplamBoyut = boyutBul("https://repo.zenk-security.com/Magazine%20E-book/Penetration%20Testing%20-%20A%20hands-on%20introduction%20to%20Hacking.pdf");
		System.out.println(boyutBul("https://repo.zenk-security.com/Magazine%20E-book/Penetration%20Testing%20-%20A%20hands-on%20introduction%20to%20Hacking.pdf"));
		while (downloadThread.isAlive()) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Inen dosya boyutu: %" + (downloadThread.inenDosyaBoyutu) *100 / toplamBoyut);
		}

	}
	public static long boyutBul(String dosyaYol) {
		try {
			URL url = new URL(dosyaYol);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("HEAD");
			long dosyaBoyutu = connection.getContentLengthLong();
			return dosyaBoyutu;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		
	}
}
class FileDownloadThread extends Thread{
	int inenDosyaBoyutu=0;
	String dosyaYolu;
	String kaydedilcekDosyaYolu;
	
	public FileDownloadThread(String dosyaYolu,String kaydedilcekDosyaYolu) {
		
		this.dosyaYolu = dosyaYolu;
		this.kaydedilcekDosyaYolu = kaydedilcekDosyaYolu;
	}


	@Override
	public void run() {
	 
		try (BufferedInputStream inputStream = new BufferedInputStream(new URL(dosyaYolu).openStream());
				FileOutputStream fos = new FileOutputStream(kaydedilcekDosyaYolu)){
			//dosyaBoyutu
			
			byte[] buffer = new byte[1024];
			int okunanBytelar;
			
			while ((okunanBytelar = inputStream.read(buffer,0,1024)) != -1) {
				fos.write(buffer, 0, okunanBytelar);
				inenDosyaBoyutu+=okunanBytelar;
				
			}
			
			System.out.println();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}


