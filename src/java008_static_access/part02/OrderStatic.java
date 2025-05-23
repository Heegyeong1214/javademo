package java008_static_access.part02;
//class 클래스 명{
//멤버변수;
//static {}
//생성자(){}
//메소드(){}
//}

//static이 있는 것은 무조건 먼저 메모리 생성이 된다!


public class OrderStatic {

	int x; // 객체 멤버변수 -> 아직 메모리가 생성이 안됐음 => new 한 다음에 호출이 됨
	static int y; // 클래스 멤버변수  -> 메모리가 생성되어 있음
	static int z;
	
	static {
		y = 5; //메모리가 생성되어 있어서 초기값을 할당할 수 있음
		System.out.println("static");
		System.out.println("y=" + y);
	}
	
	public OrderStatic() {
		x=10;
		System.out.println("constructor");
		System.out.println("x="+ x);
	}
	
	public void display(){
		System.out.println("display");
		process();     //static이니까 이미 메모리가 생성되어 있어서 호출 가능
	}
	
	public static void process() {						// 
		System.out.println("static method");
		System.out.println("display method");
		// display() 메소드는 생성(new)한 다음에 method area에 바이트코드가 저장된다.
		// process() 메소드는 OrderStatic 클래스는 loader하는 시점에 method area메 바이크코드가 저장된다.
		// process() 메소드가 method area에 저장되는 시점이 display()보다 빠르다. 그래서 process()에 display();로 하면 오류로 뜨는 것
		// display();    오류가 뜸; display는 new 다음에 메모리를 생성할 수 있으니 아직 메모리 없음
	}
}//end class
