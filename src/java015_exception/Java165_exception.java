package java015_exception;

//  throws
//  1. 예외처리를 메소드를 호출한 다른 메소드에서 하도록 전달하는 기능이다.
//  2. 사용목적 : 예외가 발생된 메소드와 이를 호출하는 메소드 양쪽에서 예외처리를 해주는 경우에 사용한다.
//  3. java.io, java.net 패키지에 많이 선언 되어 있다.

public class Java165_exception {
	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "3";
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			process(x, y);
		} catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		} catch (ArithmeticException ex) {
			System.out.println(ex.toString());
		}
	}// end main()
	
	//여기에도 예외처리 핳 수 있음. y=0일 때가 있으니까
	//위 method에도 예외처리가 이미 되어있으니 process method에서 따로 작성하지 않고 thorws를 작성하고
	//main method에 catch 형태로 예외 처리
	public static void process(int x, int y) throws ArithmeticException {
		int res = x / y;
		System.out.println(res);
		
	}// end process()
}// end class

