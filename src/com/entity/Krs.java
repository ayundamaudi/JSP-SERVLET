package com.entity;

public class Krs {
	private int id;
	private Mahasiswa mahasiswa;
	private JadwalMatakuliah jadwal;
	
	public Krs() {}

	public Krs(int id, Mahasiswa mahasiswa, JadwalMatakuliah jadwal) {
		super();
		this.id = id;
		this.mahasiswa = mahasiswa;
		this.jadwal = jadwal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Mahasiswa getMahasiswa() {
		return mahasiswa;
	}

	public void setMahasiswa(Mahasiswa mahasiswa) {
		this.mahasiswa = mahasiswa;
	}

	public JadwalMatakuliah getJadwal() {
		return jadwal;
	}

	public void setJadwal(JadwalMatakuliah jadwal) {
		this.jadwal = jadwal;
	}
	
	
}
