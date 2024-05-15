package AAAProject;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
           public loginServlet() {
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
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		loginValidation bean=new loginValidation();
		bean.setName(name);
		bean.setPassword(password);
		request.setAttribute("bean",bean);
		boolean status=bean.validate();
		if(status){
		RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
		rd.forward(request,response);
		}
		else{
		RequestDispatcher rd=request.getRequestDispatcher("loginerror.jsp");
		rd.forward(request,response);
		}

	}

}
