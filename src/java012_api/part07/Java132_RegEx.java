package java012_api.part07;
//  아이디를 입력할때 영문자,숫자 조합으로 합니다. 최소 5자이상 10자이하까지만 가능합니다.
//  (반드시 영문자로 시작한다.)
//  [출력결과]
//   로그인 되었습니다.
//   회원이 아닙니다.
public class Java132_RegEx {
	public static void main(String[] args) {
		System.out.print("ymy232");
		display(process("ymy232"));
		System.out.print("korea");
		display(process("korea"));
	}
	
	public static boolean process(String sn) {  		
		return sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") && sn.matches(".*\\d.*");
	}
	
	public static void display(boolean res) {
		if (res) {
			System.out.println(" 로그인이 되었습니다.");
		} else {
			System.out.println(" 회원이 아닙니다.");
		}
	}// end display()
}//end class

