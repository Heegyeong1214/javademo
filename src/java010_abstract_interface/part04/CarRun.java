package java010_abstract_interface.part04;

public interface CarRun {
	// 변수에 final(상수)를 선언하면 사용한다
		int carCount = 5;	// public static final
		
	//	생성자와 static 블록을 가질 수 없다
//		public CarRun() {}
//		static {}
		
		void prn();			//추상 method; public abstract를 내부에서 붙여줌
		
		class Sun{			//CarRun이라는 interface 안에 class 정의
			public Sun() {
				System.out.println("Sun constructor");
			}
		}
		
		//Java8부터 default 가능함
		default void call() {
			System.err.println("CarRun Call");
		}
		
		//Java8부터 static 가능함
		
		static void display() {
			System.out.println("display");
		}
}
