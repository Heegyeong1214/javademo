package java001_basic;

//조건식 ? 참 : 거짓
// int res = 조건식? 1:0
// char res = 조건식? 'a' : 'A'


public class Java014_opterators {

	public static void main(String[] args) {
		int total = 23;
		int record = 5;
		// total % record == 0 식이 true이면 total/record 계산에서 res 변수에 할당한다.
		// total % record == 0 식이 false 이면 total/record +1 계산해서 res 변수에 할당한다.
		int res = total % record == 0 ? total/record : total / record + 1;
			System.out.println(res);

		
		int jumsu =75;
		// jumsu >= 80 : 상, jumsu < 80 && jumsu >= 60 : 중, jumsu < 60 : 하
		char check = jumsu >= 80 ? '상' : jumsu >= 60? '중' : '하';
			System.out.println(check);
			
	    check = jumsu >=60 ? jumsu >= 80 ? '상' :'중' :'하';
	    System.out.println(check);
		
		
	}

}
