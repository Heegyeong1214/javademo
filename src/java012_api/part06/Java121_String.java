package java012_api.part06;

public class Java121_String {

	public static void main(java.lang.String[] args) {
		String str = new String("KoREa,jsp,java");

		System.out.println("문자열 길이:" + str.length()); // 14

		System.out.println("대문자:" + str.toUpperCase()); // 대문자로 바꿔주는 method
		System.out.println("소문자:" + str.toLowerCase()); // 소문자로 바꿔주는 method

		System.out.println("문자:" + str.charAt(0)); //K
		System.out.println("문자:" + str.charAt(5)); //,

		System.out.println("인덱스:" + str.indexOf('a')); // 4 ;[0]부터 최초로 나오는 a 찾기
		System.out.println("인덱스:" + str.indexOf(97));
		System.out.println("인덱스:" + str.indexOf('a', 5)); // 11 ; [5]부터 최초로 나오는 a 찾기
		System.out.println("인덱스:" + str.indexOf(97, 5));
		System.out.println("인덱스:" + str.indexOf("jsp")); // 6
		// 검색 문자열이 없으면 -1을 리턴한다.
		System.out.println("인덱스:" + str.indexOf("jsp", 7)); // -1
		
		// [5]부터 마지막 문자열까지 리턴해주는 메소드
		System.out.println("범위:" + str.substring(5)); // ,jsp,java
		// [2]부터 [8]미만의 문자열 리턴해주는 메소드
		System.out.println("범위:" + str.substring(2, 8)); // REa,js

		// 메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴해주는 메소드
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}

		int x = 10;
		int y = 20;

		System.out.printf("x=%d, y=%d, x+y=%d\n", x, y, x + y); // x=10, y=20

		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n", s1 + s2); // 1020; s1,s2의 데이터는 10,20으로 숫자는 맞지만 String이기 때문에 %d가 아니라 %s를 사용
													// +가 연산이 아니라 숫자를 연결하기 위한 수단으로 사용됨

		char[] data = { '1', '2', '3', '4', '5' };
		String s3 = String.valueOf(data);
		System.out.printf("s3=%s\n", s3); // 12345
		
		//valueOf(char[] data, int offset, int count)
		String s4 = String.valueOf(data, 2, 3);
		System.out.printf("s4=%s\n", s4); // 345
		
		//java.lang.StringIndexOutOfBoundsException: offset 2, count 8, length 5  
		//가지고 있는 배열보다 큰 count를 호출했을 때 오류 뜸
//		String s5 = String.valueOf(data, 2, 8);
//		System.out.printf("s4=%s\n", s5);

		
		
	}// end main()

}// end class
