package java018_collection.part16;

import java.util.Arrays;
import java.util.List;

public class Java203_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[] { 1, 3, 5, 2, 4, 1 };
//		Arrays.sort(arr);  //오름차순으로 만들기
//		for(Integer it :arr)
//			System.out.println(it);
		
		List<Integer> ast = Arrays.asList(arr);
		System.out.println(ast.toString());
		
		
		System.out.println("========오름차순=========");
		ast.sort(new Ascending());
		System.out.println(ast.toString());
		
		System.out.println("========내림차순========");
		ast.sort(new Descending());
		System.out.println(ast.toString());
		
		
	}// end main()

}// end class
