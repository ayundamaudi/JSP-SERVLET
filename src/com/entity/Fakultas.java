package com.entity;

public class Fakultas {
	private int id;
	private String nama;
	
	public Fakultas() {}

	public Fakultas(int id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	
}
