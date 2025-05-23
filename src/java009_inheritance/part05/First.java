package java009_inheritance.part05;

//원래 다른 패키지를 사용할 때는 import 해줘야 함.
//java.lang 패키지는 자동적으로 해주기 때문에 그동안 굳이 import를 작성하지 않아도 괜찮았던 것

//import java.lang.String;
//import java.lang.System;
//import java.lang.Override;  

public class First /* extends Object */ {

	int a = 10; // 일반적으로 class에서는 int a;로만 하지 상수 값을 이렇게 설정해두지는 않음

	public First() {      //생성자
		
	}

	protected void display() {
		System.out.println("a=" + a);
	}
	
	@Override
	public String toString() {     // Object에서 설정한 method  -> 부모 클래스와 동일하게, 접근제어자는 같거나 확장하면 됨
//		return super.toString();	// Object에서 저장된 toString()을 return해라
		return String.format("a=%d",a);
	}

}// end class
