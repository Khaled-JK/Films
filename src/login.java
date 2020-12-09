

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String user = request.getParameter("user");
	
	
	Log log = new Log();
	log.setUsername(username);
	log.setPassword(password);
	log.setUser(user);
	

	
	
	DBController control = new DBController();
	
	if( control.insertUser(log) ) System.out.println("user added");
	else System.out.println("user not added");
	}

}
