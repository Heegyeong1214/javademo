package java015_exception;

public class Java160_exception {

	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
//		 java.lang.ArrayIndexOutOfBoundsException
		//num[4]는 num이 관리하는 게 아니라서 데이터가 바뀔 수 있음(3의 메모리를 생성해라고 했기 때문에)
		// => 객체 지향인 java에서는 사용하지 않게 접근 제한해둠
		// => exception : try. catch
		
		try {
			num[4] = 20;
			System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}


	}// end main()

}// end class
