package KodlamaIO;

public class StudentManager extends UserManager{

	 @Override
	public void add(User student) {
		System.out.println("Öðrenci Eklendi : " + student.getId());
	}
	 @Override
	public void update(User student) {
		System.out.println("Öðrenci Güncellendi : " + student.getId());
	}
	 @Override
	public void delete(User student) {
		System.out.println("Öðrenci Silindi : " + student.getId());
	}
	
}
