package java005_method;

//  자바에서 제공하는 데이터 타입(data type)

//  1. primitive data type : byte, short, int, long, float, double, boolean, char
//  2. reference data type : arr, class, interface, enum
// 
//  [argument 전달방식]
//  1. call by value : 값에 의한 복사
//     argument을 전달할 때 primitive data type을 넘겨주는 형식
//     장점 : 복사하여 처리하기 때문에 원래값이 보존이 되여 안전하다.
//     단점 : 복사를 하기 때문에 메모리 사용량이 늘어난다.
// 2. call by reference : 주소에 의한 복사
//    argument을 전달할 때 reference data type을 넘겨주는 형식
//    장점: 참조를 하기 때문에 메모리를 절약한다.
//    단점: 참조를 하기 때문에 원래 값에 영향을 받는다.

public class Java058_method {

	public static void main(String[] args) {
		int a = 10, b = 20; // [argument 전달방식1] int (a,b) 값을 callByValue의 int(x,y)로 data type을 넘겨줄 때는 영향 없음

		callByValue(a, b);
		System.out.printf("a=%d, b=%d\n", a, b);
		
		int[] num = {10, 20};
		callByReference(num);
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);

	}// end main

	public static void callByValue(int x, int y) {
		// int x, int y의 값을 서로 변경하기 위함
		int temp; // byte를 넣을 수 있는 방?을 만든거임 -> x,y의 값을 temp, x, y 순으로 차례대로 옮겨줌
		temp = x;
		x = y;
		y = temp;

	}// end callByValue()

	public static void callByReference(int[] arr) {
		int temp;
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
	}// end callByReference()
	
}// end class
