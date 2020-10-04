package com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.DosenDAO;
import com.dao.JadwalMatakuliahDAO;
import com.dao.MatakuliahDAO;
import com.entity.JadwalMatakuliah;

public class JadwalMatakuliahDAOImpl implements JadwalMatakuliahDAO{
	
	private Connection conn;
	
	public JadwalMatakuliahDAOImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public int create(JadwalMatakuliah jadwal) throws Exception {
		String sql = "insert into tjadwal_kelas(nama_kelas, hari, jam_mulai, jam_selesai, tmatakuliah_id, tdosen_id) values(?,?,?,?,?,?)";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setString(1, jadwal.getNamKelas());
		pst.setString(2, jadwal.getHari());
		pst.setInt(3, jadwal.getJamMulai());
		pst.setInt(4, jadwal.getJamSelesai());
		pst.setInt(5,  jadwal.getMatakuliah().getId());
		pst.setInt(6,  jadwal.getDosen().getId());
		return pst.executeUpdate();
	}

	@Override
	public int update(JadwalMatakuliah jadwal) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public JadwalMatakuliah findById(int id) throws Exception {
		JadwalMatakuliah jadwalMatakuliah = null;
		String sql = "select id, nama_kelas, hari, jam_mulai, jam_selesai, tmatakuliah_id, tdosen_id from tjadwal_kelas where id=?";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		
		if(rs.next()) {
			//reuse DosenDAO dan MatakuliahDAO
			DosenDAO dosenDAO = new DosenDAOImpl(this.conn);
			MatakuliahDAO mtkDAO = new MatakuliahDAOImpl(this.conn);
			jadwalMatakuliah = new JadwalMatakuliah();
			jadwalMatakuliah.setId(rs.getInt("id"));
			jadwalMatakuliah.setNamKelas(rs.getString("nama_kelas"));
			jadwalMatakuliah.setHari(rs.getString("hari"));
			jadwalMatakuliah.setJamMulai(rs.getInt("jam_mulai"));
			jadwalMatakuliah.setJamSelesai(rs.getInt("jam_selesai"));
			jadwalMatakuliah.setMatakuliah(mtkDAO.findById(rs.getInt("tmatakuliah_id")));
			jadwalMatakuliah.setDosen(dosenDAO.findById(rs.getInt("tdosen_id")));
		}
		return jadwalMatakuliah;
	}

	@Override
	public List<JadwalMatakuliah> findByMatakuliah(int idMatakuliah) throws Exception {
		List<JadwalMatakuliah> listOfJadwalMatakuliah = new ArrayList<JadwalMatakuliah>();
		String sql = "select id, nama_kelas, hari, jam_mulai, jam_selesai, tmatakuliah_id, tdosen_id from tjadwal_kelas where tmatakuliah_id=?";
		PreparedStatement pst = this.conn.prepareStatement(sql);
		pst.setInt(1, idMatakuliah);
		ResultSet rs = pst.executeQuery();
		
		//reuse DosenDAO dan MatakuliahDAO
		DosenDAO dosenDAO = new DosenDAOImpl(this.conn);
		MatakuliahDAO mtkDAO = new MatakuliahDAOImpl(this.conn);
		while(rs.next()) {
			JadwalMatakuliah jm = new JadwalMatakuliah();
			jm.setId(rs.getInt("id"));
			jm.setNamKelas(rs.getString("nama_kelas"));
			jm.setHari(rs.getString("hari"));
			jm.setJamMulai(rs.getInt("jam_mulai"));
			jm.setJamSelesai(rs.getInt("jam_selesai"));
			jm.setMatakuliah(mtkDAO.findById(rs.getInt("tmatakuliah_id")));
			jm.setDosen(dosenDAO.findById(rs.getInt("tdosen_id")));
			listOfJadwalMatakuliah.add(jm);
		}
		return listOfJadwalMatakuliah;
	}

	@Override
	public List<JadwalMatakuliah> findByDosen(int idDosen) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
