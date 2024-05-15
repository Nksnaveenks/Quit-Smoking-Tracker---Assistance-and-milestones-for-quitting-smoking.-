package AAAProject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class personDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public personDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter(); 
		int id = Integer.valueOf(request.getParameter("id"));
		person emp = new person();
		emp.setId(id);
		request.setAttribute("emp",emp);       
		int result = 0;
		try{  		
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");  
		PreparedStatement preparedStatement=connection.prepareStatement("delete from  person1 where id=?");  
		preparedStatement.setInt(1, emp.getId());
		System.out.println(preparedStatement);
		result = preparedStatement.executeUpdate();
		out.print("<body bgcolor='yellow'><b><font color='brown' size=30px><h1>Successfully Deleted</h1></font></b></body>");
		out.print("<body><form action='persondelete.jsp'><input type='submit' value='Click me to go back'></form>");
		}catch (Exception e2) {e2.printStackTrace();}  
        
		finally{
			out.close();
		}  
		  
		}  
	}
