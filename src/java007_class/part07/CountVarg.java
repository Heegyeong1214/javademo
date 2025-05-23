
package java007_class.part07;

//spread operator(...)

//1. jdk5이전 버전에서는 특정 메소드를 정의할 때 아큐먼트와 매개변수의 갯수 및 타입의 수를 정해놓고
// 호출할때 일치하지 않으면 오류가 발생했다.
//2. 이를 유연하게 처리할 수 있도록 variable argument 기능을 제공하고 있다.
//3. 리턴타입 메소드명(데이터타입 ... 가변매개변수) {}

public class CountVarg {

	public CountVarg() {

	}

	void addValue(int... arr) {				//type이 같을 때만 사용할 수 있다, 배열로 여김
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {//그래서 arr.length처럼 배열의 형태로 확인 가능
			sum = sum + arr[i];
		
		}
		System.out.println(sum);
	}
	
	
	//홍길동 처럼 고정 값도 넘기고 싶을 때
	//(고정변수, 가변매개변수) 이런식으로 고정매개변수를 먼저 사용한다 
	//하나의 메소드에서 가변매개변수(int...arr)는 한번만 사용할 수 있음
	void addValue(String name, int...arr) {			
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			System.out.printf("%s %d\n", name, sum);
	}
	
	
		
	
}// end class
