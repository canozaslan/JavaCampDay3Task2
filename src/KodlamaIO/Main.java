package KodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"user1@hotmail.com","12345");
		
		Instructor instructor = new Instructor(2, "instructor1@hotmail.com", "54321", "Engin", "Demiroğ");
		
		String[] courses = {"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)"};
		String[] creditCards = {"Bonuskart","Halkkart","Ziraatkart"};
		Student student = new Student(3, "student1@hotmail.com", "12312", "Ahmet Can", "Özaslan", courses, creditCards);
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.delete(user);

		instructorManager.update(instructor);
		
		studentManager.add(student);
		
	}

}
