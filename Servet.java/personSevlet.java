package AAAProject;

import jakarta.servlet.RequestDispatcher;
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

/**
 * Servlet implementation class personSevlet
 */
public class personSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public personSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id = Integer.valueOf(request.getParameter("id"));
		String fn=request.getParameter("first_name");
		String ln=request.getParameter("last_name");
		String age =request.getParameter("age");
		String gender=request.getParameter("gender");
		int cigarettes_per_day = Integer.valueOf(request.getParameter("cigarettes_per_day"));
		String cigarettes_brand = request.getParameter("cigarettes_brand");
		String quit_attempt=request.getParameter("quit_attempt");		
		String user_opinion=request.getParameter("user_opinion ");
		String addr=request.getParameter("address");
		String cont=request.getParameter("contact_number");
		String amont=request.getParameter("amount_spending");
		person emp = new person();
		emp.setId(id);
		emp.setFirstName(fn);
		emp.setLastName(ln);
		emp.setAge(age);
		emp.setGender(gender);
		emp.setCigarettesperday(cigarettes_per_day);
		emp.setCigarettesbrand(cigarettes_brand);
		emp.setQuitattempt(quit_attempt);
		emp.setUseropinion(user_opinion);
		emp.setAddress(addr);
		emp.setContact(cont);
		emp.setAmount(amont);
		request.setAttribute("emp",emp);       
		int result = 0;
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","root");
	String query = "INSERT INTO person1(id, firstName, lastName, age,gender,  cigarettes_per_day , cigarettes_brand,quit_attempt , user_opinion,address, contact,amount) VALUES (?, ?,?,?, ?, ?, ?,?,?,?,?,?);";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
preparedStatement.setInt(1, emp.getId());
preparedStatement.setString(2, emp.getFirstName());
preparedStatement.setString(3, emp.getLastName());
preparedStatement.setString(4, emp.getAge());
preparedStatement.setString(5, emp.getGender());
preparedStatement.setInt(6, emp.getCigarettesperday());
preparedStatement.setString(7, emp.getCigarettesbrand());
preparedStatement.setString(8, emp.getQuitattempt());
preparedStatement.setString(9, emp.getUseropinion ());
preparedStatement.setString(10, emp.getAddress());
preparedStatement.setString(11, emp.getContact());
preparedStatement.setString(12, emp.getAmount());
System.out.println(preparedStatement);
result = preparedStatement.executeUpdate();
out.print("<body bgcolor='yellow'><b><font color='brown' size=40px><h1>Successfully Inserted</h1></font></b></body>");
out.print("<body><form action='personregister.jsp'><input type='submit' value='Click me to go back'></form>");
//RequestDispatcher rd=request.getRequestDispatcher("persondetail.jsp");
//rd.forward(request,response);


        } catch (Exception e) {
            System.err.println(e);
        }        
	}



	}

