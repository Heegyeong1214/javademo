package java007_class.part09;

public class Employees {
	String name;
	int salary;

	public Employees() {

	}

	public Employees(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return String.format("%s %d", name, salary);
	}
}



