package java002_statements;

//조건식을 만족할때만 수행할 문장이 있는 경우
//if(조건식) {
// 수행할 문장;
//}

public class Java017_if {

	public static void main(String[] args) {
		int num = 8;
		int tnum = -8;
		//특정 조건이 만족할 때만 if 절 사용할 수 있음
		
		if (num > 0) {
			System.out.printf("%d는 자연수입니다.\n", num);
		} // end main()
		
		System.out.println("program end");
		
		if (tnum > 0) {
			System.out.printf("%d는 자연수입니다.\n", num);
		}
		
		System.out.println("program end");
	}//end main()

}//end class
