package java006_class.part07;

//this: 현재 자신을 호출할 때 사용함
//1. this.멤버변수
//2. this.method
//3. this() : 생성자

public class Product {
	String code;
	String pname;
	int cnt;

	public Product() {
		this("b001", "식품", 2000); // 바로 아래 sysout보다 먼저 호출되어야 한다
									// 객체 변수의 초기값을 b001,,,로 지정하겠다
		System.out.println("매개변수가 없는 생성자");
	}

	public Product(String code, String pname, int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;

	}

	void display() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}	
	void process() {
		this.display();       //(this)생략해도 괜찮음
		
	
	}
}
