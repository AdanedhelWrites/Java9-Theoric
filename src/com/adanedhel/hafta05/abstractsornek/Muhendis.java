package com.adanedhel.hafta05.abstractsornek;

public class Muhendis extends Personel {
	
	public String uzmanlikAlani;
	public String calismaSekli;
	
	
	
	public Muhendis() {
		super();
	}

	public Muhendis(String ad,String adres,String telNo,String uzmanlikAlani) {
		super(ad,adres,telNo);
		this.uzmanlikAlani=uzmanlikAlani;
		// TODO Auto-generated constructor stub
		System.out.println("muhendis Sinifi 4 parametreli constructor calisti..");
	}
	
	
	@Override
	public int getMaasKatSayisi() {
		// TODO Auto-generated method stub
		return 3;
	}
	//this() >>> aynı sınıftaki constructor cagrımında kullanılır
	//this. >>> aynı sınıftaki class üye değişkenlerine erişim için kullanılır
	
	// super() >> üst sınıftaki constructor cagrımında kullanılır
	// super. >> üst sınıftaki üye değişkenlere ve metodlara erişim
	
	public void hesapla() {
		System.out.println("Muhendis hesapliyorrr");
	}

	@Override
	public String toString() {
		return "Muhendis [uzmanlikAlani=" + uzmanlikAlani + "]"+super.toString();
	}

	@Override
	public String bilgiGetir() {		
		return "Ad: " + ad + " Adres: " + adres + " Telefon: " + telNo;		
	}
	
}
