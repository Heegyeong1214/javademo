package java016_stream;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java171_stream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num; // 순번
		String name; // 이름
		double avg; // 평균

		while (true) {
			System.out.print("[순번 이름 평균]입력:"); // 1 홍길동 3.5
            try {
				num = sc.nextInt();
				name = sc.next();
				avg = sc.nextDouble();
	
				System.out.printf("%d %s %.1f\n", num, name, avg);
	
				System.out.print("종료(n), 계속(y) 입력:");
				String end = sc.next();
				if (end.equals("n")) {
					System.out.println("시스템 종료");
					break;
				}
            }catch(InputMismatchException ex) {
            	sc.nextLine();
            }
		}
		sc.close();
	}// end main()

}// end class
