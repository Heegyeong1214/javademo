package java002_statements;

//제어문(control statement) : 문장의 흐름을 제어해 주는 기능이다.
//1. 종류
//    조건문 : if~else, switch~case
//    반복문 : for, do ~ while
//    제어문에서 사용되는 키워드: break, continue
//
//    if(조건식){
//    조건식이 참일 때 수행 문장;
//    }else{
//    조건식이 거짓일 때 수행 문장;
// }

public class Java016_if {

	public static void main(String[] args) {
		int num = 4;
		// System.out.println("num=" + num);

		// if (num % 2! == 1)을 써도 무방하다
		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.\n", num);
		}else {
			System.out.printf("%d는 홀수입니다. \n", num);
		}
		System.out.println("프로그램 종료");

	}

}
