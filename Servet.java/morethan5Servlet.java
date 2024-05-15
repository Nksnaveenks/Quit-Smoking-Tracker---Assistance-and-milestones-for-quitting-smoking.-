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
import java.sql.ResultSet;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class morethan5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public morethan5Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html"); 
	    PrintWriter out = response.getWriter(); 
	    String query=request.getParameter("query");
		try{ 
			person emp = new person();
			emp.setQuery(query);
			request.setAttribute("emp",emp);       
			int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root"); 
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		//preparedStatement.setString(1,emp.getQuery());
        out.print("<table width=100% border=1>"); 
        out.print("<caption>Result:</caption>"); 
        ResultSet rs=preparedStatement.executeQuery(); 
        ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData(); 
        int total=rsmd.getColumnCount(); 
        out.print("<tr>"); 
        for(int i=1;i<=total;i++) 
        { 
            out.print("<th>"+rsmd.getColumnName(i)+"</th>"); 
        } 
       
        while(rs.next()) 
        { 
        out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+ rs.getString(4)+"</td><td>" + rs.getString(5)+"</td><td>" +  rs.getInt(6)+"</td><td>"+ rs.getString(7)+"</td><td>" + rs.getString(8)+"</td><td>"+ rs.getString(9)+"</td><td>"+ rs.getString(10)+"</td><td>"+rs.getString(11)+"</td><td>"+rs.getString(12)); 
       } 
            out.print("</table>"); 
        out.print("</table>"); 
        
	}catch (Exception e2) {e2.printStackTrace();} 
		finally{out.close();} 
	}

}
