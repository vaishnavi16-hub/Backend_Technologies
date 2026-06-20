package servletDemo2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Employee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String id = request.getParameter("empid");
		int empId = Integer.parseInt(id);

		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String city = request.getParameter("city");

		String expx = request.getParameter("exp");
		float exp = Float.parseFloat(expx);

		String mobNo = request.getParameter("mobNo");
		long phoneNo = Long.parseLong(mobNo);

		String email = request.getParameter("email");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch432", "root", "root");
			PreparedStatement ps = con.prepareStatement(
					"insert into employee(empId, name,salary,city,exp,mobNo,email)values(?,?,?,?,?,?,?)");
			ps.setInt(1, empId);
			ps.setString(2, name);
			ps.setString(3, salary);
			ps.setString(4, city);
			ps.setFloat(5, exp);
			ps.setLong(6, phoneNo);
			ps.setString(7, email);
			int check = ps.executeUpdate();
			if (check > 0) {
				out.print("<h1 style = 'color:green'>" + "inserted ...! " + "</h1>");
			} else {
				out.print("<h1 style = 'color:red'>" + "NOT inserted ...! " + "</h1>");
			}
		} catch (Exception e) {
             e.printStackTrace();
		}

//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(salary);
//		System.out.println(city);
//		System.out.println(exp);
//		System.out.println(mobNo);
//		System.out.println(email);
//
//		//		out.println(id);
//		out.println(name);
//		out.println(salary);
//		out.println(city);
//		out.println(exp);
//		out.println(mobNo);
//		out.println(email);
	}

}