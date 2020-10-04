package com.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.dao.MatakuliahDAO;
import com.entity.Matakuliah;

public class MatakuliahDAOImpl implements MatakuliahDAO {
	
	private Connection conn;
	
	public MatakuliahDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(Matakuliah matakuliah) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Matakuliah matakuliah) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Matakuliah findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matakuliah> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
