package java009_inheritance.prob.part02;

public class StudentExam extends Human{
	String number;
	
	public StudentExam() {
		
	}
	
	public StudentExam (String name, int age, int height, int weight, String number) {
		super(name,age, height, weight);
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.format("%4s %5s %8s %8s %8s\n", name,age, height, weight, number);
	}	
	}

