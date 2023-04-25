package com.adanedhel.hafta07.CompositeSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CompositeSerialization1 {

	public static void main(String[] args) {
		Otomobil oto1 = new Otomobil("Oto1", "Oto1Model", 2022, "Kirmizi", new Motor(1000));
		Otomobil oto2 = new Otomobil("Oto2", "Oto2Model", 2021, "Beyaz", new Motor(5000));
		Otomobil oto3 = new Otomobil("Oto3", "Oto3Model", 2020, "Sari", new Motor(2650));
		Otomobil oto4 = new Otomobil("Oto4", "Oto4Model", 2023, "Siyah", new Motor(4250));
		
		ArrayList<Otomobil> otomobiller = new ArrayList<>();
		otomobiller.add(oto1);
		otomobiller.add(oto2);
		otomobiller.add(oto3);
		otomobiller.add(oto4);
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("motorluoto.bin"))){
			
			out.writeObject(otomobiller);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Dosya yazdirildi");
	}

}
