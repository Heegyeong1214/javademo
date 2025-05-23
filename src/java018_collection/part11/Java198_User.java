package java018_collection.part11;

import java018_collection.part10.Average;

public class Java198_User {

	public static void main(String[] args) {

		Integer[] it = new Integer[] { 1, 5, 3, 2 };
		Average<Integer> av = new Average<Integer>(it);
		System.out.println(av.findAverage());

		Number[] nb = new Number[] { 2, 2.5f, 4.5, 10L };
		Average<Number> ae = new Average<Number>(nb);
		System.out.println(ae.findAverage());

		// Number나 Number 상속받는 것만 가능함 => <>타입은 String 명시 못함
		// The type String is not a valid substitute for the bounded parameter <Textends Number> of the type Average<T>
//		Average<String> sn = null;

	}

}
