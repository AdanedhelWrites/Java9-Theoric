package com.adanedhel.hafta07.objectSerialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

public class DeSerializationOrnek1 {
	public static void main(String[] args) {
		try(ObjectInputStream input= new ObjectInputStream(new FileInputStream("otomobil.bin"))){
//			Otomobil oto1 =(Otomobil) input.readObject();
//			System.out.println(oto1);
//			Otomobil oto2 =(Otomobil) input.readObject();
//			System.out.println(oto2);
//			Otomobil oto3 =(Otomobil) input.readObject();
//			System.out.println(oto3);
			Otomobil oto;
			while((oto=(Otomobil)input.readObject()) != null) {
				System.out.println(oto);
			}
		}catch (EOFException e) {
			System.out.println();//SONDA OLUŞAN END OF FILE HATASINDAN KURTULMAK İÇİN AYRI BİR ÇABA
		}
		catch(InvalidClassException e) {
			System.out.println("Uygulama calismasi icin Otomobil.java dosyasinin son surumu lazim");
		}		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
