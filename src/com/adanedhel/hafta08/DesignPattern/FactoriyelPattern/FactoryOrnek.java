package com.adanedhel.hafta08.DesignPattern.FactoriyelPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Factory : fabrika
 * Bazı nesneleri türetirken bağımlılıktan kaçınmak ve genişletilebilirliği sağlamak için üretimi bir factory'e bırakma çalışması
 * 
 * Detaylar nesnenin nasıl oluşturulacağı soyutlanır.
 * 
 * Factory pattern kullanırken yazma sıramız:
 * Enum'ı yazın.
 * Abstract class'ı yazın
 * Extend edilecek alt class'larınızı yazın
 * Factory class'ınızı yazın. Switch caseleri kurun.
 * Runner'dan çağırın
 */
public class FactoryOrnek {
	public static void main(String[] args) {
		Tasima tasima;
		tasima = TasimaFactory.builder(ETasimaTip.DENIZ);
		tasima = TasimaFactory.builder(ETasimaTip.KARA);
		
	}

}
