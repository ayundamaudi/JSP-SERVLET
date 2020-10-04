package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.DosenDAO;
import com.entity.Dosen;

public class DosenDAOImpl implements DosenDAO {
	
	private Connection conn;
	
	public DosenDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(Dosen dosen) throws Exception {
		String sql = "insert into tdosen(nip, nama) values(?,?)";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setString(1, dosen.getNip());
		pst.setString(2, dosen.getNama());
		return pst.executeUpdate();
	}

	@Override
	public int update(Dosen dosen) throws Exception {
		String sql = "update tdosen set nip=?, nama=? where id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, dosen.getNip());
        pst.setString(2, dosen.getNama());
        pst.setInt(3, dosen.getId());
		int affectedRow = pst.executeUpdate();
		return affectedRow;
	}

	@Override
	public int delete(int id) throws Exception {
		String sql = "delete from tdosen where id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, id);
		int affectedRow = pst.executeUpdate();
		return affectedRow;
	}

	@Override
	public Dosen findById(int id) throws Exception {
		Dosen dosen = null;
		String sql = "select id, nip, nama from tdosen where id=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			dosen = new Dosen();
			dosen.setId(rs.getInt("id"));
			dosen.setNip(rs.getString("nip"));
			dosen.setNama(rs.getString("nama"));
		}
		return dosen;
	}

	@Override
	public List<Dosen> findAll() throws Exception {
		List<Dosen> listOfDosen = new ArrayList<Dosen>();
		String sql = "select id, nip, nama from tdosen";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		while(rs.next()) {
			Dosen dosen = new Dosen();
			dosen.setId(rs.getInt("id"));
			dosen.setNip(rs.getString("nip"));
			dosen.setNama(rs.getString("nama"));
			listOfDosen.add(dosen);
		}
		return listOfDosen;
	}

}
