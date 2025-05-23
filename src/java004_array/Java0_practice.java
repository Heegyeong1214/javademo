package java004_array;

public class Java0_practice {

	//[데이터]

	//홍길동   90  85 40
	//이영희  100  35 75
	//
	//[출력결과]
	//홍길동   90  85 40 215 71.7
	//이영희  100  35 75 210 70.0
	
	public static void main(String[] args) {
		String[] name = {"홍길동", "이영희"};
		int [][] jumsu = {{90,85,40}, {100,35,75}};
		
		
		int sum;
		double avg;
		
		for(int i=0; i < jumsu.length; i++) {
			
			System.out.printf("%s\t", name[i]);
			sum=0;
			
		for(int j=0; j < jumsu[i].length; j++) {
			sum= sum + jumsu[i][j];
			System.out.printf("%4d", jumsu[i][j]);
			
		}
		avg = sum / (double)jumsu[i].length;
		System.out.printf("%4d  %.1f\n", sum, avg);
		}

	}

}
