package java002_statements;

//enum?
//enum은 'Enumeration' 의 약자로 열거, 목록 이라는 뜻으로 말 그대로 관련있는 상수들의 집합이다.
//JAVA에서는 final로 String, int  등을 나타내는 일정 개수의 기본 자료형의 값을 고정할 수 있다.
//예를 들어 요일, 계절, 과목 등을 나타낼 때 쓰일 수 있다. (제한있는, 이미 정해진? 값)
//
//enum 장점
//허용 가능한 값을 제한 할 수 있으며 수정 시 변경 범위가 최소화 된다. (enum만 수정하면 됨)
//코드가 단순해지고 가독성이 좋아진다.

public class Java024_switch {

	public static void main(String[] args) {
		enum Day {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		} //상수들을 묶어둔 class를 Day라는 이름으로 지정한 것을 의미
		
		//
		//열거형 변수 = 열거타입. 열거상수;
		Day day = Day. MONDAY;
		System.out.println(day);
		
		if (day == Day.MONDAY) {
			System.out.println("월");
		}
		
		switch(day) {
		case MONDAY : System.out.println("월"); break; //day. MONDAY로 기입하면 안된다 
		case TUESDAY : System.out.println("화"); break;
		case WEDNESDAY : System.out.println("수"); break;
		case THURSDAY : System.out.println("목"); break;
		case FRIDAY : System.out.println("금"); break;
		case SATURDAY : System.out.println("토"); break;
		case SUNDAY : System.out.println("일"); break;
		
		}
		
			
		
		
	} //end main()

}//end class
