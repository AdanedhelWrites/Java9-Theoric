package com.adanedhel.hafta05.interfacekatman.repository;

import com.adanedhel.hafta05.interfacekatman.repository.entities.Musteri;

public interface IMusteriRepository extends IRepository{
	public Musteri getMusteri(String uuid);
	public Musteri ara(String uuid);
	
}
