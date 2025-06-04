package ncs.test09;

public abstract class Plane {
	String planeName;
	int fuelSize;
	
	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		
	}
	
	public void flight(int distance) {
		
	}
}//end class
