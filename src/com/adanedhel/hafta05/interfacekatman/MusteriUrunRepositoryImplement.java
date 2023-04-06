package com.adanedhel.hafta05.interfacekatman;
import com.adanedhel.hafta05.interfacekatman.repository.IMusteriRepository;
import com.adanedhel.hafta05.interfacekatman.repository.entities.Musteri;
import java.util.ArrayList;

public class MusteriUrunRepositoryImplement implements IMusteriRepository{

	ArrayList<Musteri> musteriListesi = new ArrayList<>();

	@Override
	public Musteri getMusteri(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void kaydet(Object o) {
		musteriListesi.add((Musteri)o);
		System.out.println("Musteri eklendi.");
	}

	@Override
	public boolean duzenle(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sil(Object o) {
		// TODO Auto-generated method stub
		musteriListesi.remove(o);
	}

	@Override
	public void listele() {
		musteriListesi.forEach(l->System.out.println(l.getAd()+" "+l.getKullaniciAdi()+" "+l.getUuid()));
//		for (Musteri musteri : musteriListesi) {
//			System.out.println(musteri.getAd()+ " "+ musteri.getKullaniciAdi());
//		}
		
	}

	@Override
	public Musteri ara(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
