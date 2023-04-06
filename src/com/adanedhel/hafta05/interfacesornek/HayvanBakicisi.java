package com.adanedhel.hafta05.interfacesornek;

import java.util.ArrayList;

public class HayvanBakicisi {
	public void sevinme(IKuyruklu kuyruk,int adet) {
		System.out.println("-------------");
		for (int i = 0; i < adet; i++) {
			kuyruk.kuyrukSalla();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public void kisaSureliUc(IUcabilir kus) {
		System.out.println("-----------------------");
		kus.kanatCirp();
	}
	public void belirtilenSureUc(IUcabilir kus,int saniye) {
		System.out.println("-----------------------");
		for (int i = 0; i < saniye; i++) {
			kus.kanatCirp();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1sn = 1000ms
		}
	}
	public void hayvaniOynat(IKuyruklu kuyrukluHayvan) {
		System.out.println("------------");
		System.out.println("Bakici hayvan ile oynuyor");
		kuyrukluHayvan.kuyrukSalla();
	}
	public void hayvanlariOynat(ArrayList<IKuyruklu> kuyrukluHayvanListe) {		
		System.out.println("*************************Hayvan bakicisi hayvanlari oynatiyor**********************");
		for (IKuyruklu kuyrukluHayvan : kuyrukluHayvanListe) {
			kuyrukluHayvan.kuyrukSalla();
		}
		
	}
}
