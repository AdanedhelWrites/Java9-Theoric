package com.adanedhel.hafta07.objectSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class SerializationOrnek1 {

	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("otomobil.bin"))){
			Otomobil oto1 = new Otomobil("Opel", "Insignia", 2019);
			Otomobil oto2 = new Otomobil("Mercedes", "A250", 2020);
			Otomobil oto3 = new Otomobil("BMW", "C5", 2021);
			
			out.writeObject(oto1);
			out.writeObject(oto2);
			out.writeObject(oto3);
			//out.writeObject(null);
		}catch(NotSerializableException e) {
			System.out.println("Serializable implemente etmen lazım");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Otomobil nesneleri dosyaya yazildi");

	}

}
