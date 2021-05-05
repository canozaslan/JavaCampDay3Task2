package KodlamaIO;

public class InstructorManager extends UserManager {
	@Override
	public void add(User instructor) {
		System.out.println("E�itmen Eklendi : " + instructor.getId());
	}
	@Override
	public void update(User instructor) {
		System.out.println("E�itmen G�ncellendi : " + instructor.getId());
	}
	@Override
	public void delete(User instructor) {
		System.out.println("E�itmen Silindi : " + instructor.getId());
	}
	
}
