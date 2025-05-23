package java009_inheritance.part02;

public class MyGrand /* extends Object*/ {			//상속을 설정안해놓으면 java에서 알아서 Object로 인식해서 상속하게 한다.
	//자식 클래스에 있는 생성자에서 부모 클래스에 있는 생성자를 호출해야 한다

	public MyGrand(){//6
		super();	//7    //부모 클래스의 생성자 호출 => 매개변수가 이미 설정되어 있어야 오류가 안남;object는 이미 설정 되어 있음
		System.out.println("MyGrand");  //8
	}//9
	
}//end class
