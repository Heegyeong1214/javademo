package java019_inner.part04;

public class Java210_inner {

	public static void main(String[] args) {
		Test t = new Test();
		t.prn();
		
		Test s = new Test();
		s.prn();
		
		InnerAnonymous iu = new InnerAnonymous() {
			
			@Override
			public void prn() {
				System.out.println("call test");				
			}
		};
		iu.prn();
		
	}//end main()
}//end class
