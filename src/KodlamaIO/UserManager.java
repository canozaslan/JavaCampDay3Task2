package KodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi : " + user.getId() );
	}
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi : " + user.getId());
	}
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi : " + user.getId());
	}
}
