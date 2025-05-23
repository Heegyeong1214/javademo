package java010_abstract_interface.part02;

public abstract class Shape {
	private int width;
	private int height;
	
	public Shape() {

	}
	
	public Shape (int width, int height) {
		this.width = width;	//this는 멤버 변수 호출할 때만 가능
		this.height = height;
		
	}
	
	public int getHeight() {
		return height;
	
	}
	public int getWidth() {
		return width;
	}
	public abstract double getArea();   //추상 메소드 -> 클래스도 abstract를 추가해야 오류가 안뜸
}//end class
