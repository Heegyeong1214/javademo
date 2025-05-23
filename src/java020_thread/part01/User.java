package java020_thread.part01;

public class User extends Thread {
	public User() {

	}
	
	@Override
	public void run() {      //run은 Threa에 있는 메소드라 오버라이딩 된 
	   for(int i=0; i<=5; i++)
		   System.out.printf("%s i=%d\n", getName(), i);
	   
	}	
	

}
