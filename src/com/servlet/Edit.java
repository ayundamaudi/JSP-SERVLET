package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DosenDAO;
import com.dao.connection.MySqlConnection;
import com.dao.impl.DosenDAOImpl;
import com.entity.Dosen;

@WebServlet("/update")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			DosenDAO dao = new DosenDAOImpl(MySqlConnection.getConnection());
			Dosen dosen = new Dosen();
			
			try {
				int i = Integer.parseInt(request.getParameter("id"));
				dao.findById(i);
		   }catch (NumberFormatException e){
		       System.out.println("not a number"); 
		   } 
			
			String id = request.getParameter("id");
			String nip = request.getParameter("txtNip");
			String nama = request.getParameter("txtNama");
			
			dosen.setNip(id);
			dosen.setNip(nip);
			dosen.setNama(nama);
	 
	        dao.update(dosen);
	        response.sendRedirect("./");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
