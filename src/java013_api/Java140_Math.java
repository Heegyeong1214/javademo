package java013_api;
//클래스에서 static 키워드가 선언된 멤버변수, 메소드 호출할때
//import static을 선언하면 클래스명 없이 멤버변수, 메소드를 호출할 수 있다.

import static java.lang.Math.E; //메소드나 변수를 호출할 때는 static이 선언되어 있어야 함
import static java.lang.Math.min;
import static java.lang.Math.*; //Math라는 클래스에서는 모든 메소드와 변수를 호출한다는 의미

public class Java140_Math {

	public static void main(String[] args) {
//		Math m = new Math(); 이렇게 할 수 없음! Math 클래스는 static으로 선언되어 있어서 객체생성을 만들지 않아도 클래스 이름으로 직접 호출할 수 있다.
		System.out.println(Math.PI);
		System.out.println(Math.max(10,20));
		System.out.println(E);
		System.out.println(min(10,20)); //min을 import했으니까 굳이 Math.이렇게 하지 않아도 된다.
		System.out.println(sqrt(25)); //제곱근
		System.out.println(PI);
		System.out.println(pow(2,3));	//거듭제곰(2의 3승)
	}
}
