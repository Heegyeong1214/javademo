package java010_abstract_interface.part07;

public class FinalTest {
	//class에서 final이 선언된 변수는 대문자를 사용하고 초기값을 할당해야 한다.
	final int CODE= 1;
	
	public FinalTest() {
		//상수에는 새로운 값을 할당할 수 없다
		//CODE =2;
		
	}
	
	void display() {
		System.out.println("FinalTest display()");
	}
	
	final void process() {
		System.out.println("FinalTest process()");
	
	}
}//end class
