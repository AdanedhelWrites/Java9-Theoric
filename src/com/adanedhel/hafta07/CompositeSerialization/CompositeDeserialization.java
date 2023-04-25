package com.adanedhel.hafta07.CompositeSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;


public class CompositeDeserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("motorluoto.bin"))){
			@SuppressWarnings("unchecked")
			ArrayList<Otomobil> otomobiller = (ArrayList<Otomobil>) input.readObject();
			for (Otomobil otomobil : otomobiller) {
				System.out.println(otomobil);
			}
		} catch (FileNotFoundException e) {
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
