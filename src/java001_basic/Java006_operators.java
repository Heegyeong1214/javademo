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

public class Java006_operators {

	public static void main(String[] args) {
		int numX = 10;
		int numY =5;
		//int = int + int
		int res = numX + numY;
		System.out.println("res=" + res);
		
		double avg = 4.5;
		double data = 3.9;
		//double = double + double
		double val = avg + data;
		System.out.println("val=" + val);
		
		//double = int + double (작은것+큰것 -> 큰 데이터 값으로 계산됨)
		double hap = numX +avg;
		System.out.println("hap=" + hap);
		
		short a = 3;
		short b = 4;
		// 
		// int 이하(byte short character)의 자료형 연산을 하면 int로 리턴한다
		// Type mismatch: cannot convert from int to short
		// short c = a + b;
		int c = a + b;
		System.out.println("c=" + c);
		
		// int = short +/*/-/ short
		// int = byte + byte
		// int = char + char -> 숫자로 나와서 강제 형변
		// int = int + byte
		
		char eng = 'A';  //65
		char num = '0'; //48
		int sum = eng + num;
		System.out.println("sum=" + sum); //sum=113
		System.out.println("sum=" + (char)sum); //sum=q
		
	}

}
