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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}//end class
