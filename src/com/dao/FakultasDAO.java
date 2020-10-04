package com.dao;

import java.util.List;

import com.entity.Fakultas;

public interface FakultasDAO {
	public int insert(Fakultas fakultas) throws Exception;

	public int update(Fakultas fakultas) throws Exception;

	public int delete(int id) throws Exception;

	public Fakultas findById(int id) throws Exception;

	public List<Fakultas> findAll() throws Exception;
}
