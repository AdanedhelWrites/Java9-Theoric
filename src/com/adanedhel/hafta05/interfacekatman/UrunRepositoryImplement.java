package com.adanedhel.hafta05.interfacekatman;
//extends: classlar arasında miras almaya yarar
// aynı zamanda interfaceler arasındada miras almaya yarar

import com.adanedhel.hafta05.interfacekatman.repository.IUrunRepository;
import com.adanedhel.hafta05.interfacekatman.repository.entities.Urun;

//implements: bir class'ın bir interfaceden miras almasını saglar

//implements edilen metodlarda herhangi bir değişiklik yapılamaz (interfacede degisiklik yapılamaz)
public class UrunRepositoryImplement implements IUrunRepository{

	

	@Override
	public Urun getUrun(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void kaydet(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean duzenle(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sil(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listele() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public Urun ara(int uuid) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
