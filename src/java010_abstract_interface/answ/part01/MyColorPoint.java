package java010_abstract_interface.answ.part01;

public class MyColorPoint extends MyPoint {
	String color;
	
	public MyColorPoint(int i, int j, String color) {
		super(i, j);
		this.color = color;
	}

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	protected void reverse() {
		int tmp = x;
		x = y;
		y = tmp;
	}
	
	public void show() {
		System.out.println(x + "," + y + "," + color);
	}
}