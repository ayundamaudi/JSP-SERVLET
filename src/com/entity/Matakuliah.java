package com.entity;

public class Matakuliah {
	private int id;
	private String kode;
	private String nama;
	private int sks;
	
	public Matakuliah() {}

	public Matakuliah(int id, String kode, String nama, int sks) {
		super();
		this.id = id;
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}
	
	
}
