package com.adanedhel.hafta04.gun05;

public class Uye {	
	
	private int uyeNo;
	private String uyeIsim;
	private String uyeSoyisim;
	private String tcNo;
	private String telefonNo;
	private String adres;
	private String kayitTarihi;
	private int puan;
	private int oduncAldigiKitapSayisi;
	
	public Uye(String uyeIsim, String uyeSoyisim, String tcNo, String telefonNo, String adres, String kayitTarihi,
			int puan, int oduncAldigiKitapSayisi) {
		super();
		
		this.uyeIsim = uyeIsim;
		this.uyeSoyisim = uyeSoyisim;
		this.tcNo = tcNo;
		this.telefonNo = telefonNo;
		this.adres = adres;
		this.kayitTarihi = kayitTarihi;
		this.puan = puan;
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	
	public void setUyeNo(int uyeNo) {
		this.uyeNo = uyeNo;
	}


	public int getUyeNo() {
		this.uyeNo=uyeNo++;
		return uyeNo;
	}


	public String getUyeIsim() {
		return uyeIsim;
	}
	public void setUyeIsim(String uyeIsim) {
		this.uyeIsim = uyeIsim;
	}
	public String getUyeSoyisim() {
		return uyeSoyisim;
	}
	public void setUyeSoyisim(String uyeSoyisim) {
		this.uyeSoyisim = uyeSoyisim;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getKayitTarihi() {
		return kayitTarihi;
	}
	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	public int getOduncAldigiKitapSayisi() {
		return oduncAldigiKitapSayisi;
	}
	public void setOduncAldigiKitapSayisi(int oduncAldigiKitapSayisi) {
		this.oduncAldigiKitapSayisi = oduncAldigiKitapSayisi;
	}
	
	
}
 