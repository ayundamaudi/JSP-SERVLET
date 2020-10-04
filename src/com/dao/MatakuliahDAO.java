package com.dao;

import java.util.List;

import com.entity.Matakuliah;

public interface MatakuliahDAO {
	public int insert(Matakuliah matakuliah) throws Exception;

	public int update(Matakuliah matakuliah) throws Exception;

	public int delete(int id) throws Exception;

	public Matakuliah findById(int id) throws Exception;

	public List<Matakuliah> findAll() throws Exception;
}
