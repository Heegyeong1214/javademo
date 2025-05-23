package java009_inheritance.part05;
//오버라이딩(overriding)
// 1. 부모클래스의 메소드를 자식클래스에서 재정의(메소드 구현부)하는 기능이다.
// 2. 오버라이딩 조건
//   1) 부모클래스의 메소드와 자식클래스의 메소드 이름이 동일해야 한다.
//   2) 매개변수의 타입,갯수, 순서가 일치해야 한다.
//   3) 리턴타입이 동일해야 한다.
//   4) 접근제어자(제한자)는 부모클래스의 메소드와 같거나 더 넓은 범위어야 한다.
//      private < default < protected < public
//   5) 부모클래스 메소드에서 throws가 선언되어 있으면 자식클래스의 메소드에서는 같거나 더 구체적이면 된다.
//      Exception < RuntimeException < NullPointerException
//  3.오버라이딩 된 메소드는 자식 클래스에 있는 다른 메소드보다 우선적으로 사용된다.   
//     
// super
// 1. 자식클래스에서 부모클래스를 호출할 사용한다.
// 2.  super.멤버변수
//     super.메소드( )
//     super( ) => 생성자
//    
//          
// 단일클래스      VS      상속관계의 자식클래스
// overloading  VS       overriding
// this         VS       super


public class Java097_inheritance {

	public static void main(String[] args) {
		
		Second second = new Second();
		second.display();
		System.out.println(second.toString());
		second.superThisMethod();
		
	}//end main()

}//end class
