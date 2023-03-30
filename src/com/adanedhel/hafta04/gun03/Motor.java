package com.adanedhel.hafta04.gun03;

public class Motor {
	public int motorHacmi;
	public int beygir;
	public int tork;
	private String sasiNo;

	public void getInfo() {
		System.out.println(
				"Motor Hacmi: " + motorHacmi + " Sasi No:  " + sasiNo + " Tork:  " + tork + " Beygir: " + beygir);
	}

	public String getSasiNo() {
		return sasiNo;
	}

	public void setSasiNo(String sasiNo) {
		if (sasiNo.length() == 8) {
			this.sasiNo = sasiNo;
		} else {
			System.err.println("Bu bir sasi numarasi degildir..");

		}
	}
}
