package ncs.test10;

public class Sales extends Employee {

	public Sales() {
		
	}
	
	public Sales(String name, int number, String department, int salary) {
		super();
	}

	public double tax() {
		return salary+salary*0.13;
	}
	
	public void incentive(int pay) {
		System.out.println(salary + pay*1.2);
	}
}//end class
