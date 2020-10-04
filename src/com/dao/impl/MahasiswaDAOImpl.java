package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.FakultasDAO;
import com.dao.MahasiswaDAO;
import com.entity.Mahasiswa;


public class MahasiswaDAOImpl implements MahasiswaDAO{
	
	private Connection conn;
	
	public MahasiswaDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(Mahasiswa mahasiswa) throws Exception {
		String sql = "insert into tmahasiswa(nim, nama, tfakultas_id) values(?,?,?)";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setString(1, mahasiswa.getNim());
		pst.setString(2, mahasiswa.getNama());
		pst.setInt(3, mahasiswa.getFakultas().getId());
		return pst.executeUpdate();
	}

	@Override
	public int update(Mahasiswa mahasiswa) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mahasiswa findById(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mahasiswa> findAll() throws Exception {
		List<Mahasiswa> listOfMahasiswa = new ArrayList<Mahasiswa>();
		String sql = "select id, nim, nama, tfakultas_id from tmahasiswa";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		//reuse FakultasDAO here
		FakultasDAO fakDAO = new FakultasDAOImpl(this.conn);
		while(rs.next()) {
			Mahasiswa mhs = new Mahasiswa();
			mhs.setId(rs.getInt("id"));
			mhs.setNim(rs.getString("nim"));
			mhs.setNama(rs.getString("nama"));
			mhs.setFakultas(fakDAO.findById(rs.getInt("tfakultas_id")));
			listOfMahasiswa.add(mhs);
		}
		return listOfMahasiswa;
	}

	@Override
	public List<Mahasiswa> findByFakultas(int idFakultas) throws Exception {
		return null;
	}

}
