package java018_collection.part04;

import java.util.LinkedList;

// Queue(큐)
//  1. FIFO (First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
//  2. 최근 사용문서, 인쇄작업대기목록, 버퍼

public class Java191_LinkedList {
	
	public static void main(String[] args) {
		//저장할 때 offer, poll로 가지고 옴
		//먼저 입력되어 있는 것을 먼저 가지고 옴
		
		LinkedList<String> nQueue = new LinkedList<String>();
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		System.out.println(nQueue.size());
		
//		System.out.println(nQueue.poll());	
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.size());   //0
//		
//		//null: 더 이상 가지고 올 게 없으면 null로 리턴
//		System.out.println(nQueue.poll());
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		System.out.println(nQueue.size());	//0
	}
}
