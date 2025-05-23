package java005_method;

public class Java056_method {

	public static void main(String[] args) {  //실행 method
		int year = 2025;  //연도를 저장하는 변수
		
		boolean chk = isLeapYear(year);
		display(year, chk);

	}//end main()
	
	public static void display(int year, boolean chk) {         //윤년이 맞는지 안맞는지 확인하는?
		if(chk) {
			System.out.printf("%d년도는 윤년입니다.\n", year);
		}else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}
	}//end display()

	public static boolean isLeapYear(int year) {          //윤년인지 확인하는 논리를 설정하는 프로그램
		// 년도가 윤년이면 true, 평년이면 false로 리턴하는 프로그램 구현
		
		//boolean res;
		if((year % 4 == 0 && year % 100 !=0) || (year % 400 ==0)) {
			//res=true;
			return true;
		}else {
			//res=false;
			return true; //실제 시행하는 건 1번 밖에 없어서 두 번 작성해도 상관 없음
		}
		//return res;
	}//end isLeapYear
}//end class
