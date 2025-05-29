package ncs.test08;

public class User {
	String id;
	String password;
	String name;
	int age;
	char gender;
	String phone;
	
	public User() {
		
	}
	
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id =id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%s %s %s %d %c %s", id, password, name, age, gender, phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	
	}
}//end class
