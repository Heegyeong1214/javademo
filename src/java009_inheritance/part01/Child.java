package java009_inheritance.part01;

// 상속관계 (is a~): Father에서 상속받았으니까
public class Child extends Father {
	
	//생성자
	public Child() {
		
	}
	
	void process() {			// Father에 display()라는 method 명이 있어서 동일한 거 적용 불가
		System.out.println(a);
//		System.out.println(c);  Father로부터 상속이 안됨
	}
}//end class
