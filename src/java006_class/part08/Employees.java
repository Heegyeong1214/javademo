package java006_class.part08;

// 부서 배정이 안될 경우, 보류, 초기 연봉은 3000
public class Employees {
	String name;
	String dept;
	int salary;
	
	//생성자 총 4개 ; public Employees
	
	public Employees() {
		
	}
	
	//매개변수의 타입과 갯수를 가지고 구분을 하므로, String 타입이 1개인 생성자가 2개면 안된다.
	//=매개변수의 이름이 아니라 type으로 구분하기 때문에 overloading할 때 생성자가 2개면 오류 발생
	//public Employees(String dept) {
//		this.dept =dept;
//		}
//	
	public Employees(String name) {
		this("보류", 3000); //생성자 안에서 다른 생성자 호출을 먼저 진행해야함
		this.name = name;
	}	
	
	public Employees(String dept, int salary) {
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employees(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String toString() {
		return String.format("%s %s %d", name, dept, salary);
	}
	
}//end class
