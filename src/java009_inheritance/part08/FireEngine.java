package java009_inheritance.part08;

public class FireEngine extends Car {
	private long water;

	public FireEngine() {

	}
	
	public void setWater(long water) {
		this.water = water;
	}
	
	public void waterSpread() {
		System.out.println(water + "량의 물을 뿌린다.");
	}
	
	@Override
	public String toString() {
	  return String.format("차량의 색상:%s 속도:%d 물:%d", color, getSpeed(), water);
	}

}
