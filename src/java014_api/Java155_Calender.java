package java014_api;

import java.util.Calendar;

public class Java155_Calender {

	public static void main(String[] args) {
		// Calendar cannot be resolved to a type
		// Calendar는 추상클래스이므로 객체생성을 할 수 없다.
		// Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
//		현재 멤버변수를 argument로 사용
		// Calender라는 클래스에서 Method의 filed는 대부분 대문자로 되어 있어서 대문자로되는 것
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) +1 ; //Month는 0부터 시작하는 것으로 설정 되어 있어서 +1을 해줘야 한다.
		int date = cal.get(Calendar.DATE);
		
//		int hour = cal.get(Calendar.HOUR); //12시간
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);

		//현재 달의 마지막일을 구할 때
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		//오늘의 요일 리턴(일요일->1, 토요일 ->7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//오늘의 기준으로 5일전의 날짜 지정: 5일 전이라서 -5
		cal.add(Calendar.DATE, -5);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ; //Month는 0부터 시작하는 것으로 설정 되어 있어서 +1을 해줘야 한다.
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);
		
		cal.set(2025, 0, 1); //2025.01.01
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ; //Month는 0부터 시작하는 것으로 설정 되어 있어서 +1을 해줘야 한다.
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);
		
		//2025.01.01로 세팅되어 있어서 현재까지의 총 일수인 1을 의미
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		

	}

}
