package java008_static_access.part06;

//ctrl+Shift+ O (알파벳) : 자동 import 처리
import java008_static_access.part05.Java088_access;

//현재 내가 쓰려는 메소드 위치
public class Java090_access extends Java088_access {

	public static void main(String[] args)  {
//		 package가 다른 클래스나 인터페이스를 접근할 때는 public일 때만 가능
//		 그러나 상속관계일 때는 protected 일 때에도 접근이 가능하다.
		Java088_access p = new Java088_access();
//		System.out.printf("var_private=%d\n", p.var_private);
//		System.out.printf("var_default=%d\n", p.var_default);
//		System.out.printf("var_protected=%d\n", p.var_protected);
		System.out.printf("var_public=%d\n", p.var_public); 
		
		System.out.println("=====상속 후======");
		// 상속관계일 때는 protected 일 때에도 접근이 가능하다.
		Java090_access ps = new Java090_access();
//	    System.out.printf("var_private=%d\n", ps.var_private);
//		System.out.printf("var_default=%d\n", ps.var_default);
		System.out.printf("var_protected=%d\n", ps.var_protected);
		System.out.printf("var_public=%d\n", ps.var_public); 
		
	} //end main()
	

}//end class
