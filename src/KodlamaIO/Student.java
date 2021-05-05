package KodlamaIO;

public class Student extends User {

	public String firstname;
	public String lastname;
	private String[] courses;
	private String[] creditCards;
	
	public Student(int id, String email, String password, String firstname, String lastname, String[] courses,
			String[] creditCards) {
		super(id, email, password);
		this.firstname = firstname;
		this.lastname = lastname;
		this.courses = courses;
		this.creditCards = creditCards;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String[] getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(String[] creditCards) {
		this.creditCards = creditCards;
	}

}
