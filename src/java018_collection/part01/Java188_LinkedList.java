package java018_collection.part01;

import java.util.LinkedList;

//   1. 배열 구조로 데이터 관리 : Vector, ArrayList
//                          => 추가 - 순차적으로 처리할 때 사용
//   2. 연결리스트로 데이터 관리 : LinkedList
//                          => 삽입, 삭제 -비순차적으로 처리할 때 사용
//   3. List을 구현해놓은 컬렉션
//      Vector, ArrayList, LinkedList은 add() 해준 순서대로 데이터 관리를 해준다.

//ArrayList는 순차적으로 배열하기 때문에 영역이 있는지 미리 검색하기때문에 검색시간이 걸리는 편이다.
//수시로 삽입이나 삭제를 할 때에는 LinkedList
public class Java188_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> aList = new LinkedList<String>();

		// append
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		for(String sn: aList)
			System.out.println(sn);
	
			System.out.println("======insert=======");
		//insert
		aList.add(1, new String("Mysql"));
	
		for(String sn: aList)
		System.out.println(sn);

	}

}
