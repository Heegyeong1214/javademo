package java006_class.part06;

public class Handphone {

	String name;
	String number; // 전화번호; 숫자더라도 연산하지 않으면 문자로 적용함

	public Handphone() { //public void라고 적으면 안됨. method로 여기기 때문에 
		                 //오버로딩 (Overloading)
						 // method 쓰든 안쓰든 반드시 입력해야 함

	}

	public Handphone(String a, String n) {
		name = a;
		number = n;
	}

	void display() {
		System.out.printf("%s %s\n", name, number);
	}
}// end class
