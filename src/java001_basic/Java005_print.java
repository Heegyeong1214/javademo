package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 127;   // -128 ~ 127, bNUM: 헝가리안  -> 127까지는 byte로 인식해서 오류가 안나는데 127이 넘어가면 int로 인식해서 오류가 남
		short sNum =32767; // -32758 ~ 32767
		int iNum = 2147481647;    // -2147483648 ~ 2147483647  -> 숫자 입력할 때는 쉼표 제거해야 함
		long lNum = 6L;    // L or 1 //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F;
		double dNum = 4.5;
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";
		
		// 데이터를 출력하고 줄바꿈을 한다.
		System.out.println(bNum +"," + sNum);
		System.out.printf("%d,%d\n",bNum, sNum);
		
		/*
		 * System.out.printf("출력형식", 값1, 값2, 값3...);
		 * 
		 * 출력기호 -> 출력 형식 자리에 입력
		 * %d : 정수(byte, short, int, long)
		 * %f : 실수 (float, double)
		 * %b : 논리 (boolean)
		 * %c : 문자 (char)
		 * %s : 문자열 (String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 */

	     System.out.printf("%d %d %d %d\n", bNum, sNum, iNum, lNum);
	     System.out.printf("%f %f\n", fNum, dNum);
	     System.out.printf("%.1f %.2f\n", fNum, dNum); // 소숫점 표현
	     System.out.printf("%5.1f %.2f\n", fNum, dNum); //5는 전체 자리수
	     System.out.printf("%c %b %s\n", cData, eNum, sData);
	     System.out.printf("%d %% %d=%d\n", 5, 2, 5%2);  // % 나머지
	     
	     System.out.printf("%o\n", 19); //8진수로 출력
	     System.out.printf("%x\n", 19);  //16진수로 출력
	     System.out.printf("%s\n", Integer.toBinaryString(19)); //2진수 -> 출력기호가 따로 없음
	     System.out.printf("%5x\n", 19); //오른쪽 정렬, 총 자리수 5
	     System.out.printf("%-5x\n", 19); //왼쪽 정렬, 총 자리수 5
	     System.out.printf("%05x\n", 19); //값이 없는 자리는 0으로 채워짐
	     
	     System.out.print("java"); //줄바꿈 없음
	     System.out.print("program");
	     System.out.print("\njava\n"); // println은 뒤에 바로 줄바꿈이 됨. print는 줄바꿈 기능이 없으니까 앞이나 혹은 뒤에 \n을 넣어주어야 함
	     System.out.print("program");
	     System.out.println(); //입력값 없더도 줄바꿈 됨
	     System.out.println("jsp");
	     
	 
	     

}
}
