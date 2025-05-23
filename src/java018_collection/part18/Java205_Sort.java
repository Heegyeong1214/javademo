package java018_collection.part18;

import java.util.ArrayList;

public class Java205_Sort {

	public static void main(String[] args) {
		ArrayList<Person> ts = new ArrayList<Person>();
		ts.add(new Person("홍길동", 40));
		ts.add(new Person("가비", 20));
		ts.add(new Person("가비", 30));
		ts.add(new Person("나비", 15));
		
		

		//이름을 가지고 오름차순. 이름이 같으면 나이를 가지고 내림차순
		//이름, 나이를 정렬하는 클래스 정해야 함
		ts.sort(new NameAgeSort());
		for(Person ps:ts)
			System.out.println(ps.toString());


	}

}
