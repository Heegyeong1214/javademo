package java018_collection.part03;

import java.util.LinkedList;

//  stack(스택)
//  1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
//  2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로

public class Java190_LinkedList {

	public static void main(String[] args) {
		//push해서 넣어주고 pop해서 가지고 옴
		LinkedList<String> nStack = new LinkedList<String>();
		
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));	//가장 마지막에 들어감 (컵에 java, jsp, spring 순으로 들어간다고 생각하면됨)
		
		System.out.println(nStack.get(0)); // spring => stack이라서 마지막에 저장된 spring이 나옴
		System.out.println(nStack.get(2)); // java
		System.out.println(nStack.size()); // 3
		
//		System.out.println(nStack.pop()); //spring: 메모리도 남아있지 않은 상태로 데이터를 꺼내옴
//		System.out.println(nStack.pop()); 	//jsp
//		System.out.println(nStack.pop());	//java
//		//java.util.NoSuchElementException
//		//System.out.println(nStack.pop());

		//비어있어?그런데 비어있지 않을 때 데이터를 들고 옴
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
			
		System.out.println(nStack.size()); //0; pop을 하면 메모리에 남아있지 않은 상태로 데이터를 가져오니까 0
		
	}//end main()

}//end class
