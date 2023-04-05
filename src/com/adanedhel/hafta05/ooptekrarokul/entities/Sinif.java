package com.adanedhel.hafta05.ooptekrarokul.entities;
import java.util.ArrayList;
public class Sinif {
	private String sinifAd;
	private String lokasyon;
	private ArrayList<Ogrenci> ogrenciler;
	public Sinif(String sinifAd, String lokasyon, ArrayList<Ogrenci> ogrenciler) {
		super();
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		this.ogrenciler = ogrenciler;
	}
	public Sinif(String sinifAd, String lokasyon) {
		super();
		this.sinifAd = sinifAd;
		this.lokasyon = lokasyon;
		ogrenciler=new ArrayList<>();
	}
	public void ogrenciEkle(Ogrenci ogr) {
		ogrenciler.add(ogr);
		
	}
	public void ogrenciEkle(String ogrenciAd, String ogrenciSoyad, int okulNo, double ort) {
		ogrenciler.add(new Ogrenci(ogrenciAd,ogrenciSoyad,okulNo,ort));
		
	}
	
	public void ogrListele() {
		System.out.println("======"+ sinifAd + " sinifi ogrencileri"+"=======");
		for (Ogrenci ogrenci : ogrenciler) {			
			System.out.println(ogrenci);
		}
		System.out.println("********************************************************");
	}
	
	
	
	public String getSinifAd() {
		return sinifAd;
	}
	public void setSinifAd(String sinifAd) {
		this.sinifAd = sinifAd;
	}
	public String getLokasyon() {
		return lokasyon;
	}
	public void setLokasyon(String lokasyon) {
		this.lokasyon = lokasyon;
	}
	public ArrayList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}
	
	
	
}
