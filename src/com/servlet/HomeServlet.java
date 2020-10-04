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

@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		try {
			
			DosenDAO dao = new DosenDAOImpl(MySqlConnection.getConnection());
			List<Dosen> listOfDosen = dao.findAll();
			
//			for (Dosen dosen : listOfDosen) {
//				out.println("<h1>"+dosen.getNama()+"<h1>");
//			}
			
			request.setAttribute("listOfDosen", listOfDosen);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
