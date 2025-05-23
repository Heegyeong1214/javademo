package java013_api;

import java.util.Scanner;

public class Java147_Scanner {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("부서 연봉 평가:"); //기획부    8000 4.5
		
		String line =sc.nextLine();
		System.out.println(line);
		
		String[] arr = line.split("\\s{1,}");
			for(String data : arr)
				System.out.println(data);
	}

}

