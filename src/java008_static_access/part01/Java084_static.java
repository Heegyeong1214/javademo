package java008_static_access.part01;

//static
//1. class loader일때 method area에 저장이 된다.(메모리 구조에서 method를 의미함; stack, heap 처럼)
//2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
//3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.(this: 메모리에 생성된 객체 자신, super: 부모 객체 호출할 때)
//
//https://velog.io/@jupiter-j/Java-2.-Inheritance-AbstractMethod


public class Java084_static {

	public static void main(String[] args) {
		System.out.printf("StaticEx.y=%d\n", StaticEx.y); //new 적용하기 전에 이미 static int로 값이 설정되어 있음= 이미 메모리에 저장이 되어 있어서 호출이 가능함
		// System.out.printf("StaticEx.x=%d\n", StaticEx.x); // new로 지정한 다음에 호출이 가능함; 아래 부터 new로 호출이 되기 때문에 오류 뜸.
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y =30;      //Static으로 정의된 객체는 항상 일정하니까 class로도 정의가 가능함...? 그래서 노란색
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);
		
	}//end main

}//end class


//Stack은 개발자가 직접 접근할 수 있음: 매개변수(지역변수, 매개변수)에 접근 가능함
//Method은 static으로 데이터 저장
//Heap 직접 개발자가 접근 못해서 Stack을 통해서 접근가능하고, new를 저장함