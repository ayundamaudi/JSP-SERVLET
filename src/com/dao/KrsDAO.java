package com.dao;

import java.util.List;

import com.entity.Krs;

public interface KrsDAO {
	public int insert(Krs krs) throws Exception;
	public int delete(int id) throws Exception;
	public Krs findById(int id) throws Exception;
	public List<Krs> findByMahasiswa(int id) throws Exception;
}
