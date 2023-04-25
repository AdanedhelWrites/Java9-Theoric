package com.adanedhel.hafta07.CompositeSerialization;

import java.io.Serializable;

public class Otomobil implements Serializable{
		
	
	private String marka;
	private String model;
	private int yil;
	String renk;
	Motor motor;	
		
	public Otomobil(String marka, String model, int yil, String renk, Motor motor) {
		super();
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.renk = renk;
		this.motor = motor;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Otomobil [marka=" + marka + ", model=" + model + ", yil=" + yil + ", renk=" + renk + ", motor=" + motor
				+ "]";
	}
	
	
	
	
}
