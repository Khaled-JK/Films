

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddFilm
 */
@WebServlet("/AddFilm")
public class AddFilm extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get all parameters
		String title = request.getParameter("Title");
		String Director = request.getParameter("Director");
		String year = request.getParameter("YearofProduction");
		String Character1 = request.getParameter("Character1");
		String Character2 = request.getParameter("Character2");
		String Character3 = request.getParameter("Character3");
		String Genre = request.getParameter("Genre");
		
		
	
		
		
		
		//Populate Film object
		Film film = new Film();
		film.setTitle(title);
		film.setFID(1);
		film.setDirector(Director);
		film.setYear(year);
		film.setChar1(Character1);
		film.setChar2(Character2);
		film.setChar3(Character3);
		film.setGenre(Genre);
		

	
		

		DBController control = new DBController();
		
		if( control.insertFilm(film) ) System.out.println("film added");
		else System.out.println("Film not added");
		
		
	}
}
