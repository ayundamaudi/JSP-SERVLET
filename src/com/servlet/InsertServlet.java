package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DosenDAO;
import com.dao.connection.MySqlConnection;
import com.dao.impl.DosenDAOImpl;
import com.entity.Dosen;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nip = request.getParameter("txtNip");
		String nama = request.getParameter("txtNama");
		
		PrintWriter out = response.getWriter();
		//logic validasi
		
		//save to db
		try {
			
			DosenDAO dao = new DosenDAOImpl(MySqlConnection.getConnection());
			Dosen dosen = new Dosen();
			dosen.setNip(nip);
			dosen.setNama(nama);
			int affectedRow = dao.insert(dosen);
			if(affectedRow>0) {
				response.sendRedirect("./");
			}else {
				out.print("gagal insert");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
