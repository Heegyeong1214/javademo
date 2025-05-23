package java003_statements;

//1~10까지 짝수, 홀수 누적을 계산하는 프로그램
//
//[출력결과]
//홀수누적:25
//짝수누적:30
//

public class Java030_for {

	public static void main(String[] args) {

		int odd = 0; // 홀수 누적
		int even = 0; // 짝수 누적
		for(int i = 1 ; i <= 10 ; i++) {
		    //i 변수의 값이 홀수?
			if (i % 2 == 1) {
				  odd = odd + i;
			} else {
				even = even + i;
			}
			}
		
		System.out.printf("홀수누적:%d\n", odd);
		System.out.printf("짝수누적:%d\n", even);
	}//end main()

}//end class
