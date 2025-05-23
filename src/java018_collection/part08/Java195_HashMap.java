package java018_collection.part08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


//  HashMap
//  1. Map인터페이스를 구현한 클래스이다.
//  2. Hashtable은 동기화 처리하고, HashMap은 비동기화 처리한다.
//  3. Hashtable와 HashMap의 다른 기능들은 거의 같다.


public class Java195_HashMap {
	public static void main(String[] args) {
		
		HashMap<Integer, Number> map = new HashMap<Integer, Number>();
		map.put(1, 10); // int -> Integer ->Number -> Object
		map.put(2, 4.5);//double ->Double ->Number -> Object
		map.put(3, 2.3f); //float -> Float -> Number -> Object
		
		System.out.println(map.get(2)); //4.5
		
		
		//HashMap에서는 자동적으로 iterator가 제공이 안되서 따로 set을 설정한 뒤 iterator()를 사용할 수 있음 
		Set<Integer> set = map.keySet();
		Iterator<Integer> iteKey = set.iterator();
		while(iteKey.hasNext()) {
			int key = iteKey.next();
			System.out.printf("%d : %s\n", key, map.get(key));
		}
			
		System.out.println("=================");
		for(int key : map.keySet())
			System.out.printf("%d : %s\n", key, map.get(key));		
	}//end main()
}//end class


