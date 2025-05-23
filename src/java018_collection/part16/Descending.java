package java018_collection.part16;

import java.util.Comparator;

//비교할 때는 Comporator 상속
public class Descending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		//내림차순
		return o2.compareTo(o1);
	}
}//end class
