package com.dao;

import java.util.List;

import com.entity.Dosen;


public interface DosenDAO {
	public int insert(Dosen dosen) throws Exception;

	public int update(Dosen dosen) throws Exception;

	public int delete(int id) throws Exception;

	public Dosen findById(int id) throws Exception;

	public List<Dosen> findAll() throws Exception;
}
