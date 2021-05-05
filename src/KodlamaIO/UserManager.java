package KodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý Eklendi : " + user.getId() );
	}
	public void update(User user) {
		System.out.println("Kullanýcý Güncellendi : " + user.getId());
	}
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi : " + user.getId());
	}
}
