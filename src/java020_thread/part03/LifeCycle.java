package java020_thread.part03;

public class LifeCycle extends Thread{
	public LifeCycle() {
		
	}
	
	@Override
	public void run() {
		System.out.printf("%s %s %b\n", getName(),  getState(), isAlive());
	}

}
