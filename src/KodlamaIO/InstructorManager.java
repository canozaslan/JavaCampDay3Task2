package KodlamaIO;

public class InstructorManager extends UserManager {
	@Override
	public void add(User instructor) {
		System.out.println("Eðitmen Eklendi : " + instructor.getId());
	}
	@Override
	public void update(User instructor) {
		System.out.println("Eðitmen Güncellendi : " + instructor.getId());
	}
	@Override
	public void delete(User instructor) {
		System.out.println("Eðitmen Silindi : " + instructor.getId());
	}
	
}
