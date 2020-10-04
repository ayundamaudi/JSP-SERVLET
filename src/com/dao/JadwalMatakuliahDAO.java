package com.dao;

import java.util.List;

import com.entity.JadwalMatakuliah;

public interface JadwalMatakuliahDAO {
	public int create(JadwalMatakuliah jadwal) throws Exception;
	public int update(JadwalMatakuliah jadwal) throws Exception;
	public int delete(int id) throws Exception;
	public JadwalMatakuliah findById(int id) throws Exception;
	public List<JadwalMatakuliah> findByMatakuliah(int idMatakuliah) throws Exception;
	public List<JadwalMatakuliah> findByDosen(int idDosen) throws Exception;
}
