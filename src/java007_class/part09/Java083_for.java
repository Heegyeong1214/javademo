package java007_class.part09;

public class Java083_for {

	public static void main(String[] args) {
		Employees[] emp = new Employees[2];
		emp[0] = new Employees("John",5000);
		emp[1] = new Employees("Steven",8000);
		
		for(Employees data : emp) {					//0번째 부터 하나씩 사용함
			System.out.println(data.toString());
		}

		
	}//end main()

}//end class
