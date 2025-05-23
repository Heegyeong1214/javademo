package java020_thread.part02;

public class Java212_thread {

	public static void main(String[] args) {
		UserImp user = new UserImp();
		Thread th = new Thread(user);
		th.start();
	}
}
