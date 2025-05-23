package java013_api.prob;
//이름 학점을 입력하는 프로그램을 구현하시오
//입력: 홍길동, 80, 93

//[출력결과]
//이름:홍길동
//국어: 80
//영어:93
//평균:86.5 (double로 계산)

import java.util.Scanner;

public class Java153_Wrapper {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);   //콘솔
		System.out.println("입력:");
		String line = sc.nextLine();		//콘솔에 데이터 입력하기 위해 작성
		String[] data = line.split(",");
		
		double avg = (Double.parseDouble(data[1]) + Double.parseDouble(data[2])) /2;
		System.out.println("이름:" + data[0]);
		System.out.println("국어:"+ data[1]);
		System.out.println("영어:" + data[2]);
		System.out.println("평균:" + avg);
	}
}
