package java008_static_access.part01;

public class StaticEx {
	int x = 5; //일반적으로 이렇게 변수를 선언하지는 않음
	static int y =10;
	
	public String toString() {
		return String.format("x=%2d y%2d", x,y);
		
		
	}
	
}//end class
