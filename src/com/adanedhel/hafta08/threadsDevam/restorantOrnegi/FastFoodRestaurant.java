package com.adanedhel.hafta08.threadsDevam.restorantOrnegi;

public class FastFoodRestaurant {
	
	private String musteriAd;
	private int satilanBurgerAdet; //Atomic yapilabilir.
	
	public void burgerAl(String musteriAd) {
			
		try {
			beklemeSuresi();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Synchronized block içinde sadece senkronize olması zorunlu olan işlemleri barındıralım.
		 */
		
		synchronized (this) {
		this.musteriAd= musteriAd;
		satilanBurgerAdet++;
		System.out.println(musteriAd + " burger aldi.!");
		}
	
	}
	public String getMusteriAd() {
		return musteriAd;
	}
	public int getSatilanBurgerAdet() {
		return satilanBurgerAdet;
	}
	public void beklemeSuresi() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		FastFoodRestaurant fastFoodRestaurant = new FastFoodRestaurant();
		FastFoodRestaurant fastFoodRestaurant2 = new FastFoodRestaurant();
		
		Thread t1 = new Thread(() -> {
			fastFoodRestaurant.burgerAl("Can");
		});
		Thread t2 = new Thread(() -> {
			fastFoodRestaurant.burgerAl("Cem");
		});
		Thread t3 = new Thread(() -> {
			fastFoodRestaurant.burgerAl("Cemal");
		});
		Thread t4 = new Thread(() -> {
			fastFoodRestaurant.burgerAl("Canan");
		});
		
		Thread t5 = new Thread(() -> {
			fastFoodRestaurant2.burgerAl("Ece");
		});
		Thread t6 = new Thread(() -> {
			fastFoodRestaurant2.burgerAl("Emre");
		});
		Thread t7 = new Thread(() -> {
			fastFoodRestaurant2.burgerAl("Ecem");
		});
		Thread t8 = new Thread(() -> {
			fastFoodRestaurant2.burgerAl("Eren");
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		
		System.out.println("Toplam satilan burger: "  + fastFoodRestaurant.satilanBurgerAdet);
		System.out.println("Son Musteri: "  + fastFoodRestaurant.getMusteriAd());
		
		System.out.println("Toplam satilan burger: "  + fastFoodRestaurant2.satilanBurgerAdet);
		System.out.println("Son Musteri: "  + fastFoodRestaurant2.getMusteriAd());
	}
	
}
