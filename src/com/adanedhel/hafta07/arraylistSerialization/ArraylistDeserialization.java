package com.adanedhel.hafta07.arraylistSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ArraylistDeserialization {

	public static void main(String[] args) {
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))){
			@SuppressWarnings("unchecked")
			ArrayList<Ogrenci> ogrList =  (ArrayList<Ogrenci>) input.readObject();//Type safety: Unchecked cast from Object to ArrayList<Ogrenci>
			for (Ogrenci ogrenci : ogrList) {
				System.out.println(ogrenci);
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
