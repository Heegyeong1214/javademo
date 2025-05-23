package java012_api.part04;

// Cloneable은 Object처럼 java에 미리 저장되어있는 인터페이스임
// Deep Copy하려면 implements Cloneable을 무조건 작성해야 함
// shallow copy는 그냥 복붙하니까 값이 영향을 받을 수 밖에 없음. 
// Deep copy똑같은 내용이 다른 주소에 그대로 저장이 되어서 서로 영향을 받지 않음. 독립적인 존재라서 

public class Address implements Cloneable{
	String city;
	String dong;

	public Address() {
		
	}

	public Address(String city, String dong) {
		this.city = city;
		this.dong = dong;
	}
	
	//Address를 deepcopy해줌
	public Address clone() {
		Address address = null;
		
		try {
			address=(Address)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return address;
	}//end clone()
}//end class


