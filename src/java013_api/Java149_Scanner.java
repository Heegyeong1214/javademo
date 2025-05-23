package java013_api;
import java.util.Scanner;

public class Java149_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		//int num = sc.nextInt(10);  //10진수 (0-9)
		//int num = sc.nextInt(8);     //8진수(0-8)
		//int num = sc.nextInt(2);      //2진수(0,1)
		int num = sc.nextInt(16);      //16진수(0-15(10:A, 11:B, 12:C, 13:D, 14:E, 15:F))
		
		System.out.println(num);
	}

}

//101(2) 
// 1*2^2 + 0 * 2^1 + 1 * 2^0
// 4 + 0 + 1
//5


// 16(16)
//1*16^1 + 6 * 16^0
// 16 + 6
//22
