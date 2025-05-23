package java017_collection.part04;

import java.util.Vector;

//홍길동 30
// 이영희 25
public class Java183_Vector {

	public static void main(String[] args) {
		String nameA = "홍길동";
		int ageA = 30;
		
		String nameB = "이영희";
		int ageB =25;
		
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("이영희", 25);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		//메모리의 크기가 변하지 않는다? 배열 사용
		//배열의 단점은 한번 메모리를 지정해서 생성하면 크기 변경이 안됨
		Person[] ps = new Person[2];
		ps[0] = new Person("홍길동", 30);
		ps[1] = new Person("이영희", 25);
		for (Person pn : ps)
			System.out.println(pn.toString());
		
		//메모리의 크기가 변한다? 컬렉션 사용
		//배열의 단점을 보완하기 위해 컬렉션 사용. 그 중 하나가 Vector
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동", 30));
		vt.add(new Person("이영희", 25));
			for(Person pn : vt)
				System.out.println(pn.toString());

	}//end main()

}//end class
