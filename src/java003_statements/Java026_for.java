package java003_statements;

public class Java026_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상일때 까지만 반복문을 수행
		int sum = 0;
		int i;

		for (i = 1;; i++) {
			sum = sum + i;
			if(sum >= 15) {
				break; // for, switch, case에서 사용, if에 대한 break가 아님 -> 현재에서는 반복문 for 문을 강제적으로 빠져나오게 하기 위함
			}

		}
		System.out.printf("i=%d, sum=%d\n", i, sum);// 최종 결과만 원할 때
		
	}// end main()

}// end class
