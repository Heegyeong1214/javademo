package java003_statements;

//sum=55
public class Java029_for {

	public static void main(String[] args) {
		// 1 ~10까지 합계를 구하는 프로그램 구현

	
		int sum=0;   
		
		for(int i=1; i <= 10 ; i++) {
	      sum = sum + i;
	      
		}
		System.out.println("sum=" + sum);
		
	}// end main

}// end class
