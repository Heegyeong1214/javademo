package java014_api;

import java.util.Calendar;

public class Java156_Calendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 객체 생성을 이렇게 해두라고 미리 정해두었음, 오늘의 일로 세팅되어 있음

		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);

		cal.set(Calendar.DATE, lastDate);
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday);

		char weekName = ' ';

		switch (weekday) {
		case 1: weekName = '일'; break;
		case 2: weekName = '월'; break;
		case 3: weekName = '화'; break;
		case 4: weekName = '수'; break;
		case 5: weekName = '목'; break;
		case 6: weekName = '금'; break;
		case 7: weekName = '토'; break;
		}
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1;
		
		System.out.printf("%d-%d-%d %c요일", year, month, lastDate, weekName);

	}// end main()

}// end class
