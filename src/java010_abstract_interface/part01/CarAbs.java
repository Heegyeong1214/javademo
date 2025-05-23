package java010_abstract_interface.part01;

public abstract class CarAbs { //abstract class는 abstract method(선언만 되어 있는 상태) 와 구현된 method도 가지고 있을 수 있다.
	int speed;
	String color;
	
	//추상 메소드 (선언부)
	public abstract void work(); //method 선언만 되어있으면 추상method -> abstract 추가 해야하고 class에도 abstract 추가해야 함 => 그래야 오류가 나지 않음
	
	//구현된 메소드 (선언부 + 구현부)
	public void display() {
		System.out.printf("speed=%d, color=%s\n", speed, color);
	}
	
	
}//end class
