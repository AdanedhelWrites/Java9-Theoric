package com.adanedhel.hafta08.solid;

public class SolidKonu {
	/*
	 * Uncle Bob Robert Martin yazari solid prensiplerini tanımlıyor
	 * Kötü Tasarım : 
	 * Katılık --> Eğer sisteminize değişiklik yapmakta zorluk yaşıyorsanız bunun sebebi yazılımınızın katı olmasıdır.
	 * Kırılganlık--> Sisteminizde meydana gelen bir hatayı ortadan kaldırırken başka yerlerden hatalar ortaya çıkması.
	 * Taşınamazlık-->Tasarımınızda tekrar kodu kullanmakta zorluk yaşıyorsanız tasarım hatalıdır.
	 * 
	 * SOLID: Kötü tasarımlardan kaçınmak için öne sürülen yöntemler.
	 * Hedef: Tasarımlarınızın esnek anlaşılır ve yönetilebilir olmasını sağlamak.
	 * 
	 * Single Responsibility Principle - SRP
	 * 
	 * Oluşturulan yapılar(metod-sınıf-interface) tek bir görevi yerine getirmelidir. Belli bir işi yapmalıdır.
	 * Bu yapılarda değiştirmek için tek bir sebebiniz olmalıdır.
	 * 
	 * Cümle birden fazla iş yapıyorsa metoda çevirmeyi düşünün.
	 * Eğer metod birden fazla iş yapıyorsa cut-paste ile farklı metodlar oluşturun
	 * Sınıfım birden fazla iş yapıyorsa ve alakasız işler barındırıyorsa yeni sınıflar açıp o işlevleri oraya taşı
	 * 
	 * 	 
	 * Open Closed Principle - OCP
	 * 
	 * Projeye ait tüm yapıların gelişime açık ama değişime kapalı olması.
	 * Yazılan kodların kendisinde değişim ihtiyacı bulunmadan yeni eklemeler yapılabilmesi
	 * Kodunuzu eğer değişim gerektirmeyecek şekilde yapılandırabilirseniz çok doğru yoldasınız.
	 * 
	 * 
	 * Liskov Substition Principle - LSP
	 * Barbara Liskov
	 * 
	 * Alt sınıflardan oluşan nesnelerin, üst sınıfın nesneleri ile yer değiştirdiğinde aynı davranışı sergilemesi gerekir.
	 * Türetilen sınıf, türeyen sınıfların tüm özelliklerini kullanabilmelidir.
	 * Kullanılmaması gereken durumlar var ise bunları ayrıştırmak gerekir.
	 * 
	 * Interface Segregation Principle - ISP
	 * 
	 * Nesnelerin ihtiyaç duymadıkları metodları interfacelerden çıkarın.
	 * Bir interface gereğinden fazla metod barındırmamalı
	 * Böyle bir durumda interfaceleri bölerek kullanmalısın.
	 * 
	 * Dependency Inversion Principle - DIP
	 */
}
interface IEleman{
	
	void calis();
	void maasAl();
}
interface IOfisteYiyebilen{
	void yemekYe();
}
class Calisan implements IEleman,IOfisteYiyebilen{

	@Override
	public void yemekYe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maasAl() {
		// TODO Auto-generated method stub
		
	}
	
}
class RemoteCalisan implements IEleman{

	@Override
	public void calis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maasAl() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Logger{	
	public abstract void log();
}
abstract class BaglantiLogger extends Logger{
	public abstract void baglantiAc();
	public abstract void baglantiKapat();
}

//Database kaydetmekte sıkıntı yok. Dosya kaydet
class DatabaseLogger extends BaglantiLogger{

	@Override
	public void baglantiAc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baglantiKapat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log() {
		// TODO Auto-generated method stub
		baglantiAc();
		//LOGLAMA ISLEMLERI YAPILCAK
		baglantiKapat();
	}
	
}
class FileLogger extends Logger{

	@Override
	public void log() {
		// TODO Auto-generated method stub
		
	}	
	
}

class Person{
	public String ad;
	public String soyad;
	
//	public void sifreResetlemeLink() {
//		//..
//	}
}

class EmailService{
	public void sifreResetlemeLink(Person p) {
		//Böyle farklı klasta olcak
	}
}

class DosyaIslemleri{
	public void dosyadanOku(String dosyaAd) {
		
	}
	public void dosyayaYaz(String dosyaAd,String metin) {
		
	}
	public void dosyayiSil(String dosyaAd) {
		
	}
}
class DosyaDogrulama{
	public void dosyaAdiniDogrula(String dosyaAd) {
		
	}
	
}

class DosyaEncryption{
	public void dosyayiSifrele(String dosyaAd) {
		
	}	
}
