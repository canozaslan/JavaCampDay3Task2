package KodlamaIO;

public class StudentManager extends UserManager{

	 @Override
	public void add(User student) {
		System.out.println("��renci Eklendi : " + student.getId());
	}
	 @Override
	public void update(User student) {
		System.out.println("��renci G�ncellendi : " + student.getId());
	}
	 @Override
	public void delete(User student) {
		System.out.println("��renci Silindi : " + student.getId());
	}
	
}
