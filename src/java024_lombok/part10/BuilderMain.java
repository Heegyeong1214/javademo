package java024_lombok.part10;

public class BuilderMain {

	public static void main(String[] args) {
		Book bk = new Book("j001", "java의 정석");
		System.out.println(bk);
		
		Book bn = new Book("mysql", "m001");
		System.out.println(bn);
		
		User us = User.builder().name("김민재").salary(3000).chk(false).build();
		System.out.println(us);
		
		User us2 = User.builder().name("여진구").salary(4000).build();
		System.out.println(us2);
		
		User us3 = User.builder().name("홍길동").build();
		System.out.println(us3);
		
		//static선언된 멤버변수은 생성자로 초기화가 안된다.
		//User us4 = User.builder().code("a001").name("이기상").build();
		
	}//end main()

}//end class
