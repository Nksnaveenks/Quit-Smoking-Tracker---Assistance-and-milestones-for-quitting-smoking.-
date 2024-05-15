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

public class personDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public personDisplayServlet() {
        super();
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
	    PrintWriter out = response.getWriter(); 
	    
		try{ 
			int id = Integer.valueOf(request.getParameter("id"));
			person emp = new person();
			emp.setId(id);
			request.setAttribute("emp",emp);       
			int result = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");  
		PreparedStatement preparedStatement=connection.prepareStatement("select * from  person1 where id=?");  
		preparedStatement.setInt(1, emp.getId());
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
        out.print("<th>Status</th></tr>"); 
        while(rs.next()) 
        { 
        out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+ rs.getString(4)+"</td><td>" + rs.getString(5)+"</td><td>" +  rs.getInt(6)+"</td><td>"+ rs.getString(7)+"</td><td>" + rs.getString(8)+"</td><td>"+ rs.getString(9)+"</td><td>"+ rs.getString(10)+"</td><td>"+rs.getString(11)+"</td><td>"+rs.getString(12)); 
        if(rs.getInt(6)>=1 && rs.getInt(6)<=5) 
            out.print("<td>Your current smoking habit of 1 to 5 cigarettes per day is still harmful to your health.<font color='brown'> So Set a quit date,get support,identify triggers,replace smoking with healthy alternatives.</font></td>"+"</td></tr>");
            else 
         out.print("<td>Your heavy smoking habit of more than 5 cigarettes per day greatly increases your risk of serious health issues. <font color='brown'>So Educate yourself about the harmful effects,clean your environment,track your progress.</font> </font></td>"+"</td></tr>");
            	} 
            out.print("</table>"); 
        out.print("</table><br>"); 
        out.print("<body><form action='persondisplay.jsp'><input type='submit' value='Click me to go back'></form>");
        
	}catch (Exception e2) {e2.printStackTrace();} 
		finally{out.close();} 
}
}