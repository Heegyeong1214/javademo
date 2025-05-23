package java013_api;
//5 X 1 =  5
//5 X 2 = 10
//5 X 3 = 15
//5 X 4 = 20
//5 X 5 = 25
//5 X 6 = 30
//5 X 7 = 35
//5 X 8 = 40
//5 X 9 = 45
//계속하시겠습니까? (종료: n, 계속: 아무키)
//프로그램종료
import java.util.Scanner;

public class Java148_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//무한 루프
		while(true) {
			System.out.println("단입력: ");
			int dan = sc.nextInt();
			for(int i = 1; i<=9; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan*i);
			}
			System.out.println("계속하시겠습니까? (종료: n, 계속: 아무키)");
			String chk = sc.next();
			if(chk.equals("n") || chk.equals("N")) {
				System.out.println("프로그램종료");
				break;
			}
	}
			
	}
}
