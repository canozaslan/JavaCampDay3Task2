package KodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi : " + user.getId() );
	}
	public void update(User user) {
		System.out.println("Kullanıcı Güncellendi : " + user.getId());
	}
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi : " + user.getId());
	}
}
