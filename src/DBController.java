import java.sql.Connection;
import java.sql.Statement;

public class DBController {

	public boolean insertFilm(Film film) {
		boolean success = false;
		
		try {
			
			Connection conn = DatabaseConnection.initializeDatabase();
			Statement stmt = conn.createStatement();
			String sql = String.format("INSERT INTO Films VALUES(%s,'%s','%s','%s','%s','%s','%s','%s')",film.getFID(),film.getTitle(),film.getDirector(),film.getYear(),film.getChar1(),film.getChar2(),film.getChar3(),film.getGenre());
			int result = stmt.executeUpdate(sql);
			if(result == 1) success = true;
			
			conn.close();
		}catch( Exception e) { e.printStackTrace();}
	
		return success;
	}
	
	

		public boolean insertMember(Member member) {
			boolean success = false;
			
		
			try {
				
				Connection conn = DatabaseConnection.initializeDatabase();
				Statement stmt = conn.createStatement();
				String sql = String.format("INSERT INTO member VALUES('%s','%s','%s','%s','%s','%s','%s')",member.getFirstname(),member.getLastname(),member.getUsername(),member.getEmail(),member.getPassword(),member.getRole(),member.getIBAN());
				int result = stmt.executeUpdate(sql);
				if(result == 1) success = true;
				
				conn.close();
			}catch( Exception e) { e.printStackTrace();}
		
			return success;
		}
	
		

		public boolean insertUser(Log log) {
			boolean success = false;
			
		
			try {
				
				Connection conn = DatabaseConnection.initializeDatabase();
				Statement stmt = conn.createStatement();
				String sql = String.format("INSERT INTO logs VALUES('%s','%s','%s')",log.getUsername(),log.getPassword(),log.getUser());
				int result = stmt.executeUpdate(sql);
				if(result == 1) success = true;
				
				conn.close();
			}catch( Exception e) { e.printStackTrace();}
		
			return success;
		}
		
}
