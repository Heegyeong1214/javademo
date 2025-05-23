package java008_static_access.part05;

public class Java089_access {

	public static void main(String[] args) {
		Java088_access p = new Java088_access();
		//System.out.printf("var_private=%d\n", p.var_private); //정의 되어 있는 class에서만 접근이 가능함
		
		System.out.printf("var_default=%d\n", p.var_default);
		System.out.printf("var_protected=%d\n", p.var_protected);
		System.out.printf("var_public=%d\n", p.var_public);

	}//end main()

}//end class
