package com.adanedhel.hafta05.interfacekatman.repository;

import com.adanedhel.hafta05.interfacekatman.repository.entities.Urun;

public interface IUrunRepository extends IRepository{	
	public Urun getUrun(int id);
	public Urun ara(int uuid);
}
