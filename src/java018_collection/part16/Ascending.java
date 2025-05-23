package java018_collection.part16;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{
	
	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.printf("%d %d => %d\n", o1,o2, o1.compareTo(o2));
		
		//o1이랑 o2랑 비교하면 
		return o1.compareTo(o2);
		
		
	}//end main()

	
}//end class
