package ncs.test06;

public class ExceptionTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		System.out.printf("결과값: %.1f\n", cal.getSum(5));
		System.out.print(cal.getSum(6));
		
		

	}

}
