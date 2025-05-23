package java017_collection.part02;

public class Java181_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserList us = new UserList();
		System.out.println(us.size());
		
		//append : ㅍ인터의 현재 위치에 추가
		us.add(10);
		us.add(20);
		us.add(30);
		us.add(40);
		
		System.out.println("===insert======");
		//insert
		us.add(2,50);
		
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		System.out.println(us.get(4));
		System.out.println("===remove======");
		
		System.out.println("삭제요소:" + us.remove(2));
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		
		
	}
}
