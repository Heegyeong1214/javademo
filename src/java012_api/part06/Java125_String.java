package java012_api.part06;
/*
 * [출력결과]
 *  java jsp spring
 */
public class Java125_String {

	public static void main(String[] args) {
		String stn = new String("java_jsp_spring");
		char[] data = stn.toCharArray();
		System.out.println(process(data));

	}// end main()

	public static char[] process(char[] arr) {
		// '_'를 ' '으로 변환후 리턴하는 프로그램을 구현하세요.
          for(int i =0; i< arr.length;i++)
        	  if(arr[i]=='_')
        		  arr[i]= ' ';
		
		return arr;
	}// end process()

}// end class
