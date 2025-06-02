package java024_lombok.part07.item2;

import java.util.Arrays;

import lombok.ToString;

@ToString
public class ToStringExample2 {
	private static final int STATIC_VAR = 10;
	private String name;
	private Shape2 shape = new Shape2(5, 10);
	private String[] tags;
	private int id;

	public String getName() {
		return this.name;
	}

	// callSuper=true이면 부모클래스의 toString()포함한다.
	// includeFieldNames=true이면 출력될때 멤버변수명도 같이 출력된다.
	@ToString(callSuper = true, includeFieldNames = false)
	public static class Square2 extends Shape2 {
		private final int width, height;

		public Square2(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}
	}

}// end class
