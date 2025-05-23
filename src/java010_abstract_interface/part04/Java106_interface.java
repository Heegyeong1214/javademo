package java010_abstract_interface.part04;
//  인터페이스(interface)
//  1. 추상메소드와 상수를 가지고 있는 형태이다. => 인터페이스에 있는 모든 멤버 변수는 상수이다 예)int a = 5; 이러한 방식으로 설정해야 함
//  2. 클래스 작성에 도움을 주기 위한 목적으로 제공되는 표준명세서이다. => 
//  3. implements  : 클래스에 인터페이스를 구현(상속)할 때 사용되는 키워드이다. => 클래스 먼저 상속받고 그 다음이 인터페이스 상속
//  4. 인터페이스는 접근제어자로 public만 제공한다.
//  5. 인터페이스의 추상메소드에 abstract키워드를 명시하지 않아도 된다.
//     자바가상머신(JVM)에서 자동으로 처리하기 때문에...
//  6. 모든 인터페이스의 메소드는 묵시적으로 public abstract이다.
//  7. 멤버변수는 묵시적으로 public static final이다. => 변수에 final을 붙이면 상수라는 의미
//  8. 객체 생성은 하지 못하지만, 참조형 타입으로서는 사용 가능하다. => interface.method, interface.variables
//      public static final int num = 10;  
//      public abstract void prn();
//     
//              class           interface
//   멤버변수       O                상수
//   메소드     선언부+구현부         선언부(추상메소드)
//   생성자        O                 X
//   초기화블록     O                 X			static{ }
//   내부클래스     O                 O			
//  
//   extends: 클래스에 클래스 상속(단일상속), 인터페이스에 인터페이스 상속(다중상속)
//   implements: 클래스에 인터페스이스 상속(다중 구현)
// 
//  9. default메서드와 static 메서드 (jdk8 추가)
//  10. 인터페이스 장점
//     1) 개발시간을 단축시켜준다.
//     2) 표준화가 가능하다.
//     3) 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
//     4) 독립적인 프로그래밍이 가능하다.	 


public class Java106_interface {

	public static void main(String[] args) {
		
		//interface는 객체 생성 못해서 아래처럼 실행문 설정
		//interface.variable
		System.out.println(CarRun.carCount);
		
		//참조형 타입으로 사용가능
		//interface.method()
		CarRun.display();
		
	
		//calss라서 객체 생성됨
		Truck truck = new Truck();
		
		//객체참조변수.variable (가능)
		System.out.println(truck.carCount);
		
		//interface에서 static 선언된 메소드는 객체참조변수.method()를 호출할 수 없다.
		//truck.display();
		
		truck.prn();
		truck.call();		//오버라이딩을 안하면 CarRun에 있는 call();을 호출
		
		

	}//end main()

}//end class
