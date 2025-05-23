package java014_api;

import java.util.GregorianCalendar;

public class Java158_GregorianCalendar {

	public static void main(String[] args) {
		int year = 2025;

		GregorianCalendar gre = new GregorianCalendar(); // 객체 생성 가능
		System.out.println(gre);

		//boolean isLeapYear(year)이 true이면 윤년, false이면 평년
		String chk = gre.isLeapYear(year) ? "윤년" : "평년";
		System.out.printf("%d년도는 %s입니다.\n", year, chk);
		
		

	}

}
