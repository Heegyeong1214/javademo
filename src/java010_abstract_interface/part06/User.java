package java010_abstract_interface.part06;

public class User {
	private String name;
	
	//매개변수가 없는 생성자
	public User() {
	
	}
	
	//매개변수가 1개 있는 생성자
	public User(String name) {
		this.name = name;
	}
	
	@Override //Object에서 상속받은 toString()을 오버라이딩 한 것
	public String toString() {			// String은 return 타입을 의미함
		return name;
	}
	
}
