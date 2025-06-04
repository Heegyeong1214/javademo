package ncs.test10;
	

public class  Employee {
	String name;
	int number;
	String department;
	int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public double tax() {
	return 0.0;	
	}
	
	
	
}//end class
