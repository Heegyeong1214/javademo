package java009_inheritance.part04;

public class Son extends Parent{
	
	String dept;
	
	public Son() {
		super();
	}
	
	public Son(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	//오버라이딩: 상속 관계에서 부모 클래스에 있는 메소드 명을 같게 하는데 재정의
	public String toString() {
		return String.format("%s %d %s",name, age, dept);
	}
}//end class
