package java017_collection.part07;

import java.util.ArrayList;

public class Java185_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("Java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
//		process(aList);
	}// end main()

	public static void prnDisplay(ArrayList<String> aList) {
		// aList매개변수의 요소에서 "J" or "j"가 포함되여 있는 요소만
		// 출력하는 프로그램을 구현하세요.
		for (String sn : aList)
			//sn에 J 혹은 j가 포함되어 있으면?
//			if (sn.contains("J") || sn.contains("j")) { 
//				System.out.println(sn);
			
			//sn에 저장되어 있는 대문자를 소문자로 바꾸고 (toLowerCase), 거기에 j가 포함되어 있으면(contains)
			if(sn.toLowerCase().contains("j"))
				System.out.println(sn);
			
	}// end prnDisplay()

	public static void process(ArrayList<String> aList) {
		System.out.println(aList.contains("spring"));
	}// end process()
}// end class
