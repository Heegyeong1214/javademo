package java020_thread.part04;

public class PriorityTest extends Thread {
	public PriorityTest() {

	}

	@Override
	public void run() {
	  for(int i=0; i<=5; i++)
		  System.out.printf("%s priority=%d  i=%d\n", getName(), getPriority(), i);
	}
}
