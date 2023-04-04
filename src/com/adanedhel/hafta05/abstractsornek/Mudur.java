package com.adanedhel.hafta05.abstractsornek;

public class Mudur extends Personel{
	
	public String yonetimDepartmani;
	public String mudurDerecesi;
	public Mudur() {
		super("aa","bb","cc");
		System.out.println("Mudur Sinifi bos constructor calisti..");
	}
	public Mudur(String ad,String adres,String telNo,String yonetimDepartmani) {
		super(ad,adres,telNo);
		this.yonetimDepartmani=yonetimDepartmani;
		// TODO Auto-generated constructor stub
		System.out.println("Mudur Sinifi 4 parametreli constructor calisti..");
	}
	
	@Override
	public int getMaasKatSayisi() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public String toString() {
		return "Mudur [yonetimDepartmani=" + yonetimDepartmani + ", mudurDerecesi=" + mudurDerecesi + ", ad=" + ad
				+ ", adres=" + adres + ", telNo=" + telNo + "]";
	}
	@Override
	public String bilgiGetir() {		
		return "Ad: " + ad + " Adres: " + adres + " Telefon: " + telNo;		
	}
	
	
	
	
	
	
	//erişim belirleyici : default: ayni package'daki classlar erişebilir
	
}
