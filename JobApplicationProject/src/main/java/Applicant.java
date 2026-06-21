
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
public class Applicant extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String id = request.getParameter("appId");
        int appId = Integer.parseInt(id);

        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");

        String mobile = request.getParameter("mobile");
        long phoneNo = Long.parseLong(mobile);

        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String qualification = request.getParameter("qualification");
        String college = request.getParameter("college");

        String passingYear = request.getParameter("passingYear");
        int year = Integer.parseInt(passingYear);

        String cgpa = request.getParameter("cgpa");
        String skills = request.getParameter("skills");

        String experience = request.getParameter("experience");
        float exp = Float.parseFloat(experience);

        String salary = request.getParameter("salary");
        String github = request.getParameter("github");
        String linkedin = request.getParameter("linkedin");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");

        String pincode = request.getParameter("pincode");
        int pin = Integer.parseInt(pincode);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jobportal",
                    "root",
                    "root");

            PreparedStatement ps = con.prepareStatement(
                    "insert into job_application values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setInt(1, appId);
            ps.setString(2, fullName);
            ps.setString(3, email);
            ps.setLong(4, phoneNo);
            ps.setString(5, dob);
            ps.setString(6, gender);
            ps.setString(7, qualification);
            ps.setString(8, college);
            ps.setInt(9, year);
            ps.setString(10, cgpa);
            ps.setString(11, skills);
            ps.setFloat(12, exp);
            ps.setString(13, salary);
            ps.setString(14, github);
            ps.setString(15, linkedin);
            ps.setString(16, address);
            ps.setString(17, city);
            ps.setString(18, state);
            ps.setInt(19, pin);

            int check = ps.executeUpdate();

            if (check > 0) {
                System.out.println("<h1 style='color:green'>Inserted Successfully...!</h1>");
            } else {
               System. out.print("<h1 style='color:red'>Data Not Inserted...!</h1>");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}