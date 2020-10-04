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

@WebServlet("/hapus")
public class HapusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter out = response.getWriter();
	
			DosenDAO dao = new DosenDAOImpl(MySqlConnection.getConnection());
			Dosen dosen = new Dosen();
			
			dosen = dao.findById((Integer.parseInt(request.getParameter("id"))));
			int affectedRow = dao.delete(dosen.getId());

			if(affectedRow>0) {
				out.print("berhasil hapus id ="+dosen.getId());
//				response.sendRedirect("./");
			}else {
				out.print("gagal hapus!");
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}


}
