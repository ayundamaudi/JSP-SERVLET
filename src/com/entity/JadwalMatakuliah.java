package com.entity;

public class JadwalMatakuliah {
	private int id;
	private String namKelas;
	private String hari;
	private int jamMulai;
	private int jamSelesai;
	private Matakuliah matakuliah;
	private Dosen dosen;
	
	public JadwalMatakuliah() {}

	public JadwalMatakuliah(int id, String namKelas, String hari, int jamMulai, int jamSelesai, Matakuliah matakuliah,
			Dosen dosen) {
		super();
		this.id = id;
		this.namKelas = namKelas;
		this.hari = hari;
		this.jamMulai = jamMulai;
		this.jamSelesai = jamSelesai;
		this.matakuliah = matakuliah;
		this.dosen = dosen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamKelas() {
		return namKelas;
	}

	public void setNamKelas(String namKelas) {
		this.namKelas = namKelas;
	}

	public String getHari() {
		return hari;
	}

	public void setHari(String hari) {
		this.hari = hari;
	}

	public int getJamMulai() {
		return jamMulai;
	}

	public void setJamMulai(int jamMulai) {
		this.jamMulai = jamMulai;
	}

	public int getJamSelesai() {
		return jamSelesai;
	}

	public void setJamSelesai(int jamSelesai) {
		this.jamSelesai = jamSelesai;
	}

	public Matakuliah getMatakuliah() {
		return matakuliah;
	}

	public void setMatakuliah(Matakuliah matakuliah) {
		this.matakuliah = matakuliah;
	}

	public Dosen getDosen() {
		return dosen;
	}

	public void setDosen(Dosen dosen) {
		this.dosen = dosen;
	}
	
	
	
}
