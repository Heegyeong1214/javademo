package java016_stream;

import java.util.Scanner;

public class Java170_stream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//System.out.print("데이터 입력: ");
		//String data;
		//data = sc.nextLine();
		//System.out.println(data);
		
		
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		System.out.print("y:");
		y = sc.nextInt();
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		
		sc.close();

	}//end main()

}//end class
