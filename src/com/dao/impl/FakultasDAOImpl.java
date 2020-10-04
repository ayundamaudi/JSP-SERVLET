package com.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.dao.FakultasDAO;
import com.entity.Fakultas;

public class FakultasDAOImpl implements FakultasDAO{
	
	private Connection conn;
	
	public FakultasDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(Fakultas fakultas) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Fakultas fakultas) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Fakultas findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fakultas> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
