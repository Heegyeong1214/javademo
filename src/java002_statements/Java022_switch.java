package java002_statements;

// 30 : 4, 6, 9, 11
// 31 : 1, 3, 5, 7, 8, 10, 12
// 28 or 29 : 2

// 윤년 조건
// 첫번째 조건: 년도를 4로 나누어서 나머지가 0이면 되고 년도를 100으로 나누어서 나머지가 0이 되면 안된다.
// 두번째 조건: 년도를 400으로 나누어서 나머지가 0이면 된다.
// 위 두 조건 중 하나 이상 만족하면 된다.

public class Java022_switch {

	public static void main(String[] args) {
		int year = 2025;  //년도
		int month = 2; // 월
		int lastDay; //마지막일
		
		//정확한 값을 넣지 못했을 가능성이 있으니까 if를 추가하는 거
		//if(!(month >=1 && month <= 12)) 이걸로 사용할 수 있음// 맨앞에 !의 의미는 not의 의미
		if(month <1 || month >12) {
			System.out.println("1월 ~ 12월까지만 가능합니다.");
			return;  //현재 수행 중인 메소드를 강제로 빠져나게 하기 위함 -> return 0;(이렇게는 사용 안됨; 원래 void인 method에서는 return 사용할 수 없다)
			
		}
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: lastDay=31; break;
		
		case 4:
		case 6:
		case 9:
		case 11: lastDay=30; break;
		
		default:
		 if((year % 4 ==0 && year % 100 !=0) || (year % 400 == 0)) {
			 lastDay = 29; break;
		 }else {
			 lastDay = 28; break;
		 }
		
		}
		System.out.printf("%d년도 %d월의 마지막은 %d일 입니다. \n", year, month, lastDay);
	}//end main()

}//end class
