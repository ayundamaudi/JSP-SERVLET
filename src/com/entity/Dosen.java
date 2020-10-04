package com.entity;

public class Dosen {
	private int id;
	private String nip;
	private String nama;
	
	public Dosen() {}
	
	public Dosen(int id, String nip, String nama) {
		super();
		this.id = id;
		this.nip = nip;
		this.nama = nama;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	
}
