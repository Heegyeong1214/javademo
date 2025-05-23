package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1{
	String dept;
	
	public ClassTest_2(String name, int salary, String dept) {
		super(name,salary);
		this.dept =dept;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름:%s  연봉:%d  부서:%s", getName(), getSalary(), dept);
	}
	
	@Override
	public void prn() {
		System.out.println("서브클래스");
	}
	
	public void callSuperThis() {
		super.prn();
		this.prn();
		
	}
}//end class
