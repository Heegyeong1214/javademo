package java020_thread.part02;

/*
 * Runnable interface에서는 run()메소드만 제공한다. 
 */
public class UserImp implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++)
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(), i);
	}

}
