package com.adanedhel.hafta07.Logkayit;

public class LogRunner {
	static DosyaIslemleri dosya = new DosyaIslemleri();
	public static void main(String[] args) {
		try {
			System.out.println(dosya.logOku());
			String metin = null;
			String metinParcasi = metin.substring(5);
			
		}catch(NullPointerException e) {
			System.out.println("Bos metin gonderemezsiniz.");
			Log log = new Log(e.toString(), "RunnerLog", "main", "Gelen metin boş geliyor dikkatli ol", System.currentTimeMillis());
			dosya.logKaydet(log);
		}
		catch (Exception e) {
			// TODO: handle exception
		}

	}

}
