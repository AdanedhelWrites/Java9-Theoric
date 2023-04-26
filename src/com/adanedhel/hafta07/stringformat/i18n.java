package com.adanedhel.hafta07.stringformat;

import java.util.Locale;
import java.util.ResourceBundle;

public class i18n {

	public static void main(String[] args) {
		/*
		 * i18n : Internationalization : Uluslararasılaştırma
		 * 	l10n		Localization : Yerellestirme
		 * 	g11n		Globalization : Kuresellestirme
		 * 
		 * !!!!!!!!! DİL DESTEĞİ SAĞLAMAK !!!!!!!!
		 * Alfabe Desteği Unicode
		 * Tarih için
		 * Ölçü Birimleri : Boy , Kilo , KM/MIL tarzi
		 * 
		 */
		//ResourceBundle : Kaynak Bundle : Paket
		Locale tr = Locale.of("tr","TR");
		Locale en = Locale.of("en","EN");
		ResourceBundle bundle = ResourceBundle.getBundle("text",en);
		System.out.println(bundle.getObject("menu1item1"));
	}

}
