package KodlamaIO;

public class Instructor extends User {

	public String firstname;
	public String lastname;
	
	public Instructor(int id, String email, String password, String firstname, String lastname) {
		super(id, email, password);
		this.firstname = firstname;
		this.lastname = lastname;
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

}
