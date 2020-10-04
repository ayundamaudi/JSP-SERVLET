package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DosenDAO;
import com.dao.connection.MySqlConnection;
import com.dao.impl.DosenDAOImpl;
import com.entity.Dosen;

@WebServlet("/edit")
public class EditForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nip = request.getParameter("txtNip");
		String nama = request.getParameter("txtNama");

		try {
//			PrintWriter out = response.getWriter();
	
			DosenDAO dao = new DosenDAOImpl(MySqlConnection.getConnection());
			Dosen dosen = new Dosen();
			
			dosen = dao.findById((Integer.parseInt(request.getParameter("id"))));
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			request.setAttribute("dosen", dosen);
			rd.forward(request, response);
						
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
