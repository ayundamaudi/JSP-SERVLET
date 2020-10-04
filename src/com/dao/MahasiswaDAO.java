package com.dao;

import java.util.List;

import com.entity.Mahasiswa;

public interface MahasiswaDAO {
	public int insert(Mahasiswa mahasiswa) throws Exception;

	public int update(Mahasiswa mahasiswa) throws Exception;

	public int delete(int id) throws Exception;

	public Mahasiswa findById(int id) throws Exception;

	public List<Mahasiswa> findAll() throws Exception;
	
	public List<Mahasiswa> findByFakultas(int idFakultas) throws Exception;
}
