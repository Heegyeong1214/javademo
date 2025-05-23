package java017_collection.part03;

import java.util.Vector;

// 	배열: length 키워드
// 
//  문자열 : length( )메소드
//  컬렉션 : size() 메소드
// 
//  컬렉션 클래스를 선언하고 생성할 때 제너릭 타입을 선언한다.
//  제너릭 타입을 선언하면 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.



public class Java182_Vector {

	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();  //기본적으로 Object를 받는데, <>제네릭을 String으로 지정하면String 객체만 넣을게요
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		System.out.println("요소의 크기:" + v.size());
		
		for(int i=0; i < v.size(); i++) {
			//Vector를 생성할 때 String을 <>에 선언했기 때문에 Vector에서 String 요소를 꺼내올 때
			//다운캐스팅을 명시하지 않아도 된다.
			String data = v.get(i);
			System.out.println(data);
		}
		
		//개선된 반복문
		//for(데이터타입 변수 : 배열 or 컬렉션){}
		for(String data : v )
			System.out.println(data);
		
	} //end main()

}//end class
