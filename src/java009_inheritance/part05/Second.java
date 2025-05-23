package java009_inheritance.part05;

public class Second extends First {

	int b = 20;

	public Second() { // 매개 변수가 없는 생성자

	}

	// First method의 protected 보다 같거나 크면됨: public
	// 부모클래스의 메소드 접근제어자가 protected이므로
	// 자식클래스의 메소드 접근제어자는 이보다 같거나 큰 protected, public이 가능함
	
	@Override
	protected void display() { // protected를 생략하고 void display()라고 하면 오류
		System.out.println("b=" + b);
	}
	
	@Override
	public String toString() {
		return String.format("a=%d, b=%d\n", a, b);
	}
	public void superThisMethod() {
		super.display();	// 부모클래스인 first의 disply method를 호출해서 사용 가능
		this.display();   //second에서 overiding 된 method적용
	
		
	}

}// end class
