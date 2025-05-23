package java012_api.part04;
///protected Object clone() throws CloneNotSupportedException
//Cloneable인터페이스를 상속받아야만 clone()메소드를 호출할 수 있다.

public class House implements Cloneable {
	String name;
	int age;
	Address address; // 클래스 자체를 참조함

	public House() {
		
	}

	public House(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;

	}
	
	//House를 deepcopy해줌
	public House shallowCopy() {
		House house = null;
		try {
			house = (House)super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return house;
	}//end shallow Copy()
	
	
	public House deepCopy() {
		House house = null;
		try {
			Address cloneAddress = address.clone();
			house = (House)super.clone();
			house.address = cloneAddress;
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		return house;
		
	}//end deepCopy()
}
