package java003_statements;

//1   2   3   4   5
//
//1   2   3   4   5
//
//1   2   3   4   5
//
//1   2   3   4   5
public class Java033_for {

	public static void main(String[] args) {
		//int data; -> int data = 1로 안해도 괜찮음 for 문장에서 줄바꿈할 때 data를 1로 초기화하기 때문에
		
		for (int row = 1; row <= 4; row++) {
			//data = 1;
			for (int col = 1; col <= 5; col++) {
				//System.out.printf("%4d", data++);
				System.out.printf("%4d", col); //col이 data 12345랑 동일하니까 col로 대체해도 무방
			}
			System.out.println("\n");
		}

	}//end main()

}//end class
