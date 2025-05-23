package java001_basic;

//연산자 (operator) : 어떠한 기능을 수행하는 기호(+, -, *, /, %, >, <, >=, <=, ==, != ...)
//피연산자(operand) : 연산자의 작업 대상 ( 변수, 상수, 리터널, 수식...)
//
//연산자의 종류
//1. 산술연산자(이항연산자) : +, -, *, /,%
//2. 비교연산자(이항연산자) : >, <, >=, <=, ==, !=
//3. 논리연산자(이항연산자) : &&(and), ||(or), !(not)
//4. 조건연산자(삼항연산자) : 조건식 ? 참 : 거짓
//5. 대입연산자(이항연산자) : =, +=, -=, *=, /=,...
//6. 증감연산자(단항연산자) : ++(1씩 증가), --(1씩 감소) 


public class Java008_operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println(a + b); // 산술연산자(더하기)
		System.out.println(a + "는(은) 삼입니다"); // 문자열 연결
		System.out.println("결과=" + a+b); 
		                 //"결과=" + a => 결과=3
		                 //"결과=3" + b => 결과=34
		System.out.println("결과=" + (a+b)); // 결과 = 7
	}

}
