

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String role = request.getParameter("role");
		String IBAN = request.getParameter("IBAN");
		
		
		Member member = new Member();
		member.setFirstname(firstname);
		member.setLastname(lastname);
		member.setUsername(username);
		member.setEmail(email);
		member.setPassword(password);
		member.setRole(role);
		member.setIBAN(IBAN);
		
		//member.print();
		
		DBController control = new DBController();
		
		if( control.insertMember(member) ) System.out.println("member added");
		else System.out.println("member not added");
		
		//Member member = new Member(uname, password, email, phone);
		
		//RegisterDao rDao = new RegisterDao();
		
		//String result = rDao.insert(member);
		
		//response.getWriter().print(result);
	}

}
