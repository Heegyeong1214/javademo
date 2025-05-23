package java015_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java163_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] data = new int[2];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = inputData(sc, i);
			sum += data[i];
		}
		System.out.println("배열 요소의 총합:" + sum);
		sc.close();
		
	}//end main()

public static int inputData(Scanner sc, int index) {		
		int num;
		
		while(true) {
			try {
		    	System.out.printf("%d번째 정수를 입력:", index);
			    num = sc.nextInt(); //정수값을 받겠다는 의미. 만약 안받으면 catch로 넘어가서 진행
			    break; //반복문 빠져나가시오
			}catch(InputMismatchException ex) {
				System.out.println("정수를 입력하세요.");
				sc.next();	//반드시 입력해야함
			}
		}		
		return num;
	}//end inputData()

}//end class
