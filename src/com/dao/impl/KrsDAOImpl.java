package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.dao.JadwalMatakuliahDAO;
import com.dao.KrsDAO;
import com.dao.MahasiswaDAO;
import com.entity.Krs;

public class KrsDAOImpl implements KrsDAO{
	
	private Connection conn;
	
	public KrsDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int insert(Krs krs) throws Exception {
		String sql = "insert into tkrs(tmahasiswa_id, tjadwal_kelas_id) values(?,?)";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setInt(1, krs.getMahasiswa().getId());
		pst.setInt(2, krs.getJadwal().getId());
		return pst.executeUpdate();
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Krs findById(int id) throws Exception {
		Krs krs = null;
		String sql = "select id, tmahasiswa_id, tjadwal_kelas_id from tkrs where id=?";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			MahasiswaDAO mhsDAO = new MahasiswaDAOImpl(this.conn);
			JadwalMatakuliahDAO jadwalDAO = new JadwalMatakuliahDAOImpl(this.conn);
			krs = new Krs();
			krs.setId(rs.getInt("id"));
			krs.setMahasiswa(mhsDAO.findById(rs.getInt("tmahasiswa_id")));
			krs.setJadwal(jadwalDAO.findById(rs.getInt("tjadwal_kelas_id")));
		}
		return krs;
	}

	@Override
	public List<Krs> findByMahasiswa(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
