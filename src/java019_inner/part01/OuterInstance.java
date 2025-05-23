package java019_inner.part01;

public class OuterInstance {
	private int num;
	private int data;
	
   public void display() {
	   System.out.println("display");
   }
   
   public class InnerInstance {
	   int local = 4;
	   public void run() {
		   num = 10;
		   System.out.println(num);
	   }
   }
}
