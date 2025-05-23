package java017_collection.part08;

import java.util.ArrayList;

public class Java186_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");

		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);
	}// end main()

	public static String[] display(ArrayList<String> aList) {
//		String[] stn = new String[aList.size()];
//		// aList를 stn에 담을거야
//
//		for (int i = 0; i < aList.size(); i++) {
//			stn[i] = aList.get(i);
//		}
//		return stn;
		
	
		String[] stn = new String[aList.size()];
//		return aList.toArray(stn);  //List에 있는 배열을 String으로 옮겨줌
		return aList.toArray(new String[aList.size()]);
		
	}// end display()
}// end class
