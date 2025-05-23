package java013_api;

import java.util.Scanner;

//java.util.Scanner : jdk5에서 추가됨

public class Java145_Scanner {
	public static void main(String[] args) {
		
		//콘솔창으로 데이터를 읽어'들어오기(in)' 위해서 콘솔창과 연결하기 위해 사용
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//sc.next(): 콘솔창에서 데이터를 입력받기 위해 대기 상태, 콘솔 창에서 데이터를 입력하고 Enter하면 그때 next() 메소드가 데이터를 읽음. 공백 앞까지만 읽음
		//String name = sc.next();
		
		//sc.nextLine(): 공백 포함 한 라인을 읽음
		String name = sc.nextLine();
		System.out.println(name);
		
	}
}
