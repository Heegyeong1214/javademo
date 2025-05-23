package java003_statements;

public class Java037_while {

	public static void main(String[] args) {
		int cnt = 1;
		
		while(true) {
			System.out.println(cnt++);
			if (cnt == 6)  //5까지 나타내고 싶다라고 했을 때 cnt=6이어야 break가 걸리겠지
				break;
		}

	}// end main()

}// end class
