<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, java.util.ArrayList, com.entity.Dosen" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
<h1>Home Page</h1>
	<a href="input.jsp">Insert New Dosen</a>
	<%
		List<Dosen> listOfDosen = (List<Dosen>)request.getAttribute("listOfDosen");
	%>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nip</th>
				<th>Nama</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<%
				for(int x=0;x<listOfDosen.size();x++){
					Dosen dosen = listOfDosen.get(x);
			%>
				<tr>
					<td><%= dosen.getId() %></td>
					<td><%= dosen.getNip() %></td>
					<td><%= dosen.getNama() %></td>
					<td><a href="hapus?id=<%= dosen.getId() %>">Hapus</td>
					<td><a href="edit?id=<%= dosen.getId() %>">Edit </td>
				</tr>
			
			<%
				}
			%>
</body>
</html>