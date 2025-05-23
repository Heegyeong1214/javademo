package java013_api;

import java.util.Scanner;

public class Java146_Scanner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서 연봉 평가:"); //기획부 8000 4.5
		
		String dept = sc.next();
		//System.out.println(dept);
		
		int salary = sc.nextInt();
		//System.out.println(salary);
		
		double avg = sc.nextDouble();
		//System.out.println(avg);
		
		System.out.printf("%s %d %.1f\n", dept, salary, avg);
		
		//모든 자원들을 반납 후 콘솔과 연결을 종료한다.
		sc.close();
	}
}
