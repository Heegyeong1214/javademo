package java002_statements;

//  if(조건식){
//    if(조건식){
//        수행문장;
//     }else{
//        수행문장;
//     }
//  }else{
//      if(조건식){
//         수행문장;
//      }else{
//          수행문장;
//      }
//  }

public class Java018_if {

	public static void main(String[] args) {
		boolean member = true; // 회원(true) or 비회원(false)
		String grade = "VIP";  // 회원등급 (VIP, 일반)
		
		if(member) {
			//회원일 때 처리하는 문장
			if(grade == "VIP") {
			//회원이고 회원등급이 VIP일 때
				System.out.printf("고객님은 %s이며 %d%% 적립했습니다.\n", grade, 30);
			}else { 
			//회원이고 회원등급이 일반일 때 -> String grade ="일반" 으로 변경
				System.out.printf("고객님은 %s이며 %d%% 적립했습니다.\n", grade, 10);
			}
			
		}else {
		   // 비회원 -> boolean member = false로 변경
			System.out.printf("고객님은 %s이며 %d%% 적립했습니다.\n", "비회원", 0);
		}
		System.out.println("고객님 오늘도 방문해 주셔서 감사합니다");
	}// end main()

}// end class
