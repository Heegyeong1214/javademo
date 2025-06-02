package java024_lombok.part07.item2;

import lombok.ToString;

@ToString(includeFieldNames=false)
public class Shape2 {
	private int width;
	private int height;

	public Shape2() {
		
	}

	public Shape2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
//	@Override
//	public String toString() {		
//		return String.format("width=%d, heigh=%d", width, height);
//	}
}