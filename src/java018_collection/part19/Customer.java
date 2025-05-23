package java018_collection.part19;

public class Customer implements Cloneable{
	private String name;
	private int age;

	public Customer() {

	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return String.format("%s %d", name, age);
	}

	@Override //clone은 cloneable을 상속받아야 함 
	protected Customer clone() throws CloneNotSupportedException {
		return (Customer)super.clone();
	}
}
