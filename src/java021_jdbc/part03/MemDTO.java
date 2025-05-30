package java021_jdbc.part03;

public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;
	
	public MemDTO() {
		
	}

	//오라클에서 인서트,업데이트할 때 필요해서 생성자 2개 더 만들거야
	public MemDTO(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public MemDTO(int num, String name, int age, String loc) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.loc = loc;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	

	
}//end class
