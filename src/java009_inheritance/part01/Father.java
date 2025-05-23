package java009_inheritance.part01;

public class Father /* extends Object */{

	int a = 3;
	private int c = 10; // private는 상속은 되는데 다른 자식 Class에서 접근 못함

	//생성자 :Class에 1개 이상은 있어야 함
	public Father() {
		
	}
	
	public void display() {
		System.out.println("a=" + a);
		System.out.println("c=" + c);	//같은 class에 있는 거니까 private라도 접근이 가능해서 c 결과 도출 가능
	}
}// end class
