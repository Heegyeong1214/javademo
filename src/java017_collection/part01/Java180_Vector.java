package java017_collection.part01;

import java.util.Vector;

//1. 자료구조
//어플리케이션에서 사용할 데이터를 어떠한 형태로 저장하고 관리할 것인지에 대한 방법이다.
//자료(data) => 저장공간(memory) + (읽기,쓰기,삽입,삭제,검색) : 구조
//2. 알고리즘
// 유한한 횟수의 연산들을 이용해서 정답을 출력하는 기능이다.
//
//3. 컬렉션 프레임워크
//1)자바는 널리 알려져 있는 자료구조(data structure)를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 관련된
//    인터페이스와 클래스들을 java.util 패키지에 포함시켜 놓았는데 이를 컬렉션 프레임워크라 한다.
//JAVA API문서에서는 컬렉션 프레임워크란 '데이터 군(그룹)을 다루고 표현하기 위한 단일화된 구조(architecture)' 라고 정의하고 있다.
//2)컬렉션 프레임워크는 몇 가지 인터페이스를 통해서 다양한 컬렉션 클래스를 이용할 수 있도록 설계되어 있다.
//3)주요인터페이스로는 List, Set, Map이 있는데, 이 인터페이스로 사용 가능한 클래스들은 다음과 같다.
//① List인터페이스 구현한 클래스는 Vector, ArrayList, LinkedList 등이 있다.
//② Set  인터페이스을 구현한 클래스는 HashSet, TreeSet 등이 있다.
//③ Map 인터페이스를 구현한 클래스는 HashMap, Hashtable, TreeMap, Properties등이 있다.


public class Java180_Vector {

	public static void main(String[] args) {
		// 이전/ 이후 : 포함됨, 전/후: 포함 안됨
		//jdk5이
		Vector v = new Vector();  //
		
		//int -> Integer -> Object : auto boxing -> up-casting
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(new String("java"));	//String -> Up-casting
		
		Integer t1 = (Integer) v.get(0);  //v.get()은 Object라서 Integer로 down-casting
		System.out.println(t1.intValue()); //Integer를 int로 down-casting
		
		Integer t2 = (Integer) v.get(1);
		System.out.println(t2.intValue());//Integer를 int로 down-casting
		
		Integer t3 = (Integer) v.get(2);
		System.out.println(t3.intValue());//Integer를 int로 down-casting
		
		String t4 = (String)v.get(3);   //Integer를 String로 down-casting
		System.out.println(t4);
		
	}//end main()

}
