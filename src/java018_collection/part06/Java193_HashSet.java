package java018_collection.part06;

import java.util.HashSet;

public class Java193_HashSet {

	public static void main(String[] args) {
		//HasSet은 중복허용 안되고, 순서 유지 안됨
		HashSet<Integer> set = new HashSet<>(); //좌변이랑 <>값이 우변이랑 같으면 우변은 안적어도 됨
		set.add(10);
		set.add(20);
		set.add(30);
		
		for(int it :set)
			System.out.println(it);
	}

}
