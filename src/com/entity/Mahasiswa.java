package com.entity;

public class Mahasiswa {
	private int id;
	private String nim;
	private String nama;
	private Fakultas fakultas;
	
	public Mahasiswa() {}

	public Mahasiswa(int id, String nim, String nama, Fakultas fakultas) {
		super();
		this.id = id;
		this.nim = nim;
		this.nama = nama;
		this.fakultas = fakultas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Fakultas getFakultas() {
		return fakultas;
	}

	public void setFakultas(Fakultas fakultas) {
		this.fakultas = fakultas;
	}
	
	
}
