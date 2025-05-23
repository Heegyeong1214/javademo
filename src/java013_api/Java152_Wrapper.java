package java013_api;

public class Java152_Wrapper {

	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		
//		for(int i = 0; i <sn.length(); i++) {
//			char data = sn.charAt(i);
//			if(data >= '0' && data <='9')
//				cnt++;
//		}
		
		///////////////////////////////////////
		
//		for(int i = 0; i <sn.length(); i++) {
//			char data = sn.charAt(i);
//			if(Character.isDigit(data))
//				cnt++;
//		}
		
//////////////////////////////////////////////////
		char[] line = sn.toCharArray();
		//line는 배열이나 collection이 들어가야함
		//바로 to chararray못집어 넣는 이유는 반복문이 돌 때마다 새로 array가 만들어짐
		for(char data : line) {								
			if(Character.isDigit(data))
				cnt++;
		}
		
		
		System.out.println("숫자갯수:" + cnt);
	}//end main()

}//end class
