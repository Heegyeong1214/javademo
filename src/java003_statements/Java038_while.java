package java003_statements;

//반복적으로 수행해야하는 문장인데 적어도 한번은 문장을 사용해야할 때 사용
//
//do{
//반복 수행문장;
//}while(조건식); // }가 끝을 의미하는데 )만 있으니까 실행한다는 의미의 ;를 반드시 필요함

public class Java038_while {

	public static void main(String[] args) {
		
		char chk = 'n';
		do {
			System.out.println("고객님 주문하시겠습니까?(y/n)");
		}while (chk == 'y'); 
		
	}//end main()

}//end class
