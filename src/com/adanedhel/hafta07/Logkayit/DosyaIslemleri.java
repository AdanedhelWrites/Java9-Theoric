package com.adanedhel.hafta07.Logkayit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class DosyaIslemleri<T> {
	public void logKaydet(Log log) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Loglar\\log.txt"))){
			out.writeObject(log);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Optional ile Dosya bos mu dolu mu diye kontrol et
	public Log logOku() {
		Log logOkuyan=null;
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\\\Loglar\\\\log.txt"))){
			logOkuyan = (Log) input.readObject();
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
		return logOkuyan;		
	}
	public Optional<T> logOku(String fileName){
		T TOkunan = null;
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))){
			TOkunan=(T) input.readObject();
			return Optional.of(TOkunan);
		}catch(Exception e) {
			System.out.println("Dosya islem hatasi " + e.toString());
			return Optional.empty();
		}
	}
}
