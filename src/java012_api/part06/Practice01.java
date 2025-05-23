package java012_api.part06;
/*
 * [출력결과]
 *  java jsp spring
 */
public class Practice01 {

	
		public static void main(String[] args) {
			String stn = new String("java_jsp_spring");
			char[] data = stn.toCharArray();
			System.out.println(process(data));

		}// end main()

		public static char[] process(char[] arr) {
		
			for(int i= 0; i< arr.length; i++) {
				if(arr[i] == '_') {
					arr[i] = ' ';
				}
			}
			return arr;
		}// end process()
	}


