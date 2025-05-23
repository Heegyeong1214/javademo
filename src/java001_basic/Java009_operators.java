package java001_basic;


//증감연산자 : 증가연산자(++), 감소연산자(--)
//전위연산자 : 증감연산자가 변수 앞에 있을 때
//후위연산자 : 증감연산자가 변수 뒤에 있을 때
//증감연산자는 리터널, 상수에서 사용할 수 없다.

public class Java009_operators {

	public static void main(String[] args) {
		int x =3;
		
		//전위연산자
		++x; //x= x + 1 -> 반드시 변수여야 함. ++4 (X)
		System.out.println("x=" + x); //4
		
		--x; // x= x -1
		System.out.println("x=" + x ); //3
		
		// 후위연산자
		int y =5;
		y++; //y = y+1
		System.out.println("y=" + y); //6
		
		y--; // y=y-1
		System.out.println("y=" + y); //5
		
		//리터널은 증감연산자를 사용할 수 없다
		//10++; (X)
		
		//상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4;  //
		// 상수는 새로운 값을 할당할 수 없다
		// NUM=10; (X)
		// 상수는 증감연산자를 사용할 수 없다
		// NUM++; (X)
		
		System.out.println("NUM=" + NUM);
	}

}
