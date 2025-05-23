package java014_api;

import java.util.Calendar;
//수능일: 2025-11-13
//오늘 : 2025-5-20
//남은일: 177
public class Java157_Calendar {
	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2025;
		int examDay_month = 11;
		int examDay_date = 13;
		
		examDay.set(examDay_year, examDay_month - 1, examDay_date);
		System.out.println(examDay);
		
		Calendar toDay = Calendar.getInstance(); //오늘에 해당되는 객체 생성
		 toDay.set(Calendar.HOUR, 0);		//초를 0으로 해두지 않으면 시간이 계속 지나가서 하루 적게 계산될 수 있음
		 toDay.set(Calendar.MINUTE, 0);
		 toDay.set(Calendar.SECOND, 0);
		System.out.println(toDay);
		
		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		System.out.println(eventDay);
		System.out.println(nowDay);
		System.out.println(60 * 60 * 24 * 1000); //밀리세컨드:1000
		
		// 차이 값을 하루의 밀리초인(60 * 60 * 24 * 1000)으로 나눠주면 밀리초가 아닌 일 단위 값을 얻을 수 있다.
		long endDay = (eventDay - nowDay) / (60 * 60 * 24 * 1000);
		System.out.println(endDay);
		
	}// end main()
}// end class

