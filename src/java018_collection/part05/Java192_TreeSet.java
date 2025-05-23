package java018_collection.part05;

import java.util.Iterator;
import java.util.TreeSet;

public class Java192_TreeSet {

	public static void main(String[] args) {
		//Collection이름에 Tree는 오름차순 정렬
		//set(중복안됨)
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(300);
		tree.add(100);
		tree.add(200);
		
		System.out.println(tree.size()); //0
		//set이 있어서 get이라는 method 사용할 수 없음 순서때문에? 
		//현재 저장되어 있는 순서 그대로 가지고 오려면 Iterator
		
		System.out.println("=====Iterator=====");
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		
		System.out.println("=====내림차순=========");
		Iterator<Integer> descIta = tree.descendingIterator();
		while(descIta.hasNext())
			System.out.println(descIta.next()); //메모리에서 제거 안됨
		
		
		System.out.println("================");
		for(int it :tree)
			System.out.println(it); 
		System.out.println(tree.size()); //3; treeset이라 오름차순으로 정렬. get에서 가져온 것처럼 메모리에 값이 남아 있음
	
		
		//
		System.out.println(tree.first()); //100
		System.out.println(tree.size());  //3
		
		System.out.println(tree.pollFirst()); //Remove하면서 데이터를 가져옴
		System.out.println(tree.size()); //2
		
		System.out.println(tree.last());//300
		System.out.println(tree.size()); //2

		System.out.println(tree.pollLast()); //300
		System.out.println(tree.size()); //1
		

	}

}
