package ncs.test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0]= new Employee("Hilery", 1, "secretary", 800);
		employees[1]= new Employee("Clinten", 2, "sales", 1200);
		
		
		System.out.println("name     department    salary");
		System.out.println("-----------------------------");
		for(int i =0 ; i < employees.length ; i++) {
			System.out.printf("%s %10s %10d\n",employees[i].name, employees[i].department, employees[i].salary);
		}
		System.out.println();
		System.out.println("인센티브 100 지급");
		System.out.println("name     department    salary     tax");
		System.out.println("-------------------------------------");
	}//end main()

}//end class
