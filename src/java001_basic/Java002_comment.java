package java001_basic;

public class Java002_comment {
	public static void main(String[] args) {
		 // Cntrl+/ -> 설정 및 해제 가능
//		 한 라인 주석
		
		int a= 2; //서식 앞이 아니라 뒤에 // 입력해야 주석 처리
		
		/*
		 * 여러라인 주석 처리할 때는 영역 지정 후 Cntrl+shift+/
		 * 해제할 때는 Ctrl+Shift+\
		 */

		System.out.println(3);
		
		process();
	} //end main()
	
  public static void process() {
	System.out.println("process method");
    } //end process()
  
} //end class
