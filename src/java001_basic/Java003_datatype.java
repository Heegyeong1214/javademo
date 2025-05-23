package java001_basic;


//  리터널(literal) : 그 자체의 값(1, 2, 3, ..., 'a','b','c'..., true, false)
//  변수 (variable) : 하나의 값을 저장하기 위한 메모리 공간
//   예약어(keyword) = 키워드
//    -> https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
//   식별자(identifier) : 프로그램에서 사용자가 정의한 이름을 '식별자(identifier)'라고 한다.
//   변수의 명명규칙
//     1) 대소문자가 구분되며 길이에 제한이 없다.
//	 2) 예약어를 사용할 수 없다.
//	 3) 숫자로 시작할 수 없다.
//	 4) 특수문자는 '_', '$'만을 허용한다.
//	 5) 클래스는 파스칼(pascal) 표기법, 변수와 메소드는 카멜(camel) 표기법을 사용한다.
//	     ex) 파스칼(pascal) 표기법 : HelloWorld,   카멜(camel) 표기법 : helloWorld
//  자바에서 제공하는 데이터 타입
//  1. Primitive DataType (기본 데이터 타입)
//     문자 - char(2byte)
//     숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
//         - 실수 - float(4byte), double(8byte)
//           [float] 부호(1bit)+지수(8bit) +가수(23bit) = 32bit = 4byte
//		   [double]부호(1bit)+지수(11bit)+가수(52bit) = 64bit = 8byte
//     논리 - boolean(1byte) : true of faulse
//     
//  2. Reference DataType (참조 데이터 타입)
//     Array, Class , Interface
//     
// 시스템에서 데이터 타입 크기
//  byte < char, short < int < long < float < double
 

public class Java003_datatype {

	public static void main(String[] args) {
		// ⓐ 변수 선언
		int data; // 데이터타입 한칸 띄우기 변수; -> int는 데이터를 저장할 수 있는 크기

		// ⓑ 초기값 할당
		data = 3; // 변수명(소문자) = 값;

		System.out.println(data); // 호출 -> 변수에 데이터를 저장해놓은 거라 시스템에 따라 여러번 사용가능
		System.out.println(3); // 임의의 위치에 3이 저장되어서 한번만 사용함

		// data 변수에 새로운 값 할당
		data = 20;
		System.out.println(data);

		// 변수 선언 및 초기값 할당
		int val = 10;
		System.out.println(val); // 초기값을 설정 안했기 때문에 오류: val 밑에 빨간 줄 그임(오류)

		// Type mismatch: cannot convert from double to int
		// int age= 4.0; //할당 값와 변수와 같아야 함, int는 정수이지만 4.0은 실수

		// Type mismatch: cannot convert from double to float
		// float ko=4.0; //float은 4바이트, 4.0은 8바이트

		int x = 0101; // 8진수(0)
		// 1*8^2 + 0*8^1 + 1*8^0 +
		// 64 + 0 + 1 = 65 -> 10진수
		System.out.println("x=" + x);

		int z = 0B101; // 2진수(0B)
		// 1*2^2 + 0*2^1 + 1*2^0
		// 4+1=5 -> 10진수
		System.out.println("z=" + z);

		int k = 0X101; // 16진수(0X)
		// 1*16^2 + 0*16^1 + 1*16^0
		// 256+0+1=257 -> 10진수
		System.out.println("k=" + k);
		
		double avg = 4.5;
		System.out.println("avg=" + avg);

		boolean chk = false; // Ctrl + shift + F 자동정렬
		System.out.println("chk=" + chk);
		
		char grade = 'A'; //'AB' (X) 문자 하나만 들어가야 함
		System.out.println("grade=" + grade);
		
		String name = "홍길동"; // 쌍따옴표로 묶어주면 "홍" 으로 한 문자라고 해도 char이 아니라 String 
		System.out.println("name=" + name);
 		System.out.println("name      =      " +   name); // ""안에 있는 공백도 문자로 인식하지만 + 이후의 공백은 상관없음

	}

}
