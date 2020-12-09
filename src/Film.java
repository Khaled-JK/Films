
public class Film {

	private int FID;
	private String Title;
	private String Genre;
	private String Year;
	private String Director;
	private String char1;
	private String char2;
	private String char3;
	
	
	
	public Film() {
		super();
		generateID();
		//char1 = null;
		//char2 = null;
		//char3 = null;
	}
	
	private void generateID() {
		//get a random number between 0 and 999
		int num = 000;
		
		this.FID = num;
	}
	
	public int getFID() {
		return FID;
	}
	public void setFID(int fID) {
		FID = fID;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getChar1() {
		return char1;
	}
	public void setChar1(String char1) {
		this.char1 = char1;
	}
	public String getChar2() {
		return char2;
	}
	public void setChar2(String char2) {
		this.char2 = char2;
	}
	public String getChar3() {
		return char3;
	}
	public void setChar3(String char3) {
		this.char3 = char3;
	}
	
}
