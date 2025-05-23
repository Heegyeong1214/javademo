package java019_inner.part03;

public class OuterLocal {
	private int x;
	static private int y;
	final private int z = 10;

	public void call( int a) {
		final int b = 20;
		int c = 30;
		//a = a+10;
		//c =c +20;
		System.out.println("a=" + a);

		class InnerLocal {
			void prn() {
				//내부클래스에서 외부클래스의 메소드의 매개변수 또는 지역변수를 사용할때는 final이 선언되여 있어야 한다.
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("z=" + z);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
			}// end prn()
		}// end InnerLocal
		
		InnerLocal  inner = new InnerLocal();
		inner.prn();
	}// end call()

}// end OuterLocal
