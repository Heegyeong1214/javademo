package java010_abstract_interface.part07;

//  final
//  class : 상속을 할 수 없는 클래스
//  method : 오버라이딩을 할 수 없는 메소드
//  variable : 상수 -> 변수에 한번만 대입할 수 없는 값 예)int a =5;

public class Java109_final {
	// int data ; //변수 선언
	//final int data = 10;
	
	// final int DATA = 10; //class에서 final이 붙으면 변수 이름은 대문자로 쓰기, interface는 기본적으로 상수를 적용하기 때문에 굳이 변수 이름을 대문자로 설정하지는 않음
	
	public static void main(String[] args) {
		final int DATA = 10; //지역변수이며 final이 붙었기 때문에 상수로 간주
		//상수에는 새로운 값을 할당할 수 없다
		//DATA = 20; //새로운 값을 할당 못함! final로 선언되어 있기 때문에
		
	}

}
