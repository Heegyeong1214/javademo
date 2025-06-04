package ncs.test06;

public class Calculator {
	int data;
	
	
	public Calculator() {
		
	}
	
	public double getSum(int data) {
		int sum = 1;
		
		if(data >=2 && data <= 5) {
			for(int i = 2; i <= data; i++) 
				 sum = sum + i;
		}else if (data>5){
				InvalidException ix = new InvalidException("입력 값에 오류가 있습니다.");
				System.out.println(ix.message);
			}
		
	
		return sum;
		
	}//end getSum()
}//end class
