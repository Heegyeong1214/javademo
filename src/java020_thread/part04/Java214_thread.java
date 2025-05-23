package java020_thread.part04;

/*
 * setPriority(int newPriority) 
 * getPriority()
 * 
 * Thread의 우선순위는 1 ~ 10 까지 지정할 수 있다.
 * Thread.MAX_PRIORITY = 10
 * Thread.NORM_PRIORITY = 5
 * Thread.MIN_PRIORITY = 1
 */
public class Java214_thread {

	public static void main(String[] args) {
		 PriorityTest t1 = new PriorityTest();
		 t1.start();
		 
		 PriorityTest t2 = new PriorityTest();
		 t2.setPriority(Thread.MAX_PRIORITY);  // t2.setPriority(10)
		 t2.setName("Work");
		 t2.start();
		 
		 PriorityTest t3= new PriorityTest();
		 t3.setPriority(3);
		 t3.setName("Play");
		 t3.start();
	}

}
