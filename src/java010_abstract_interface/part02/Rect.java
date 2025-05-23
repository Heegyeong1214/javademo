package java010_abstract_interface.part02;

public class Rect extends Shape {
	public Rect() {
		
	}
	
	public Rect (int width, int height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {	
		return getWidth() * getHeight();  // width, height가 private int라서 width * height로 하면 오류가 뜸

	}
	
	
}//end class
