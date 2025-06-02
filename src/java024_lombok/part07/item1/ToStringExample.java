package java024_lombok.part07.item1;

import java.util.Arrays;

public class ToStringExample {
	private static final int STATIC_VAR = 10;
	private String name;
	private Shape shape = new Shape(5, 10);
	private String[] tags;
	private int id;

	public String getName() {
		return this.name;
	}

	public static class Square extends Shape {
		private final int width, height;

		public Square(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}

		@Override
		public String toString() {
			return "Square(super=" + super.toString() + ", width=" + this.width + ", height=" + this.height + ")";
		}
	}

	@Override
	public String toString() {
		return "ToStringExample(" + this.getName() + ", " + this.shape.toString() + ", " + Arrays.deepToString(this.tags) + ")";
	}
}// end class
