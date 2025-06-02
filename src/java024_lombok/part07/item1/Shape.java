package java024_lombok.part07.item1;

public class Shape {
	private int width;
	private int height;

	public Shape() {
		
	}

	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {		
		return String.format("width=%d, heigh=%d", width, height);
	}
}