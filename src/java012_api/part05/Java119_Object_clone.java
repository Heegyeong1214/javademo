package java012_api.part05;

import java.util.Arrays;

public class Java119_Object_clone {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] copy = arr;					//주소복사 -> 배열도 참조 데이터 타입이니까
		System.out.println(arr);			//toString()
		System.out.println(copy);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		
		System.out.println("=====================");
		int[] deepcopy = arr.clone();
		deepcopy[0]=10;
		System.out.println(arr);
		System.out.println(deepcopy);	//arr에 있는 데이터를 복사해서 다른 쪽으로 위치만 옮겼으니까 arr랑 주소가 당연히 다르지
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(deepcopy)); 		//arr랑 주소가 다르니까 [0]에 있는 값이 달라지는 거임
		

	}//end main()

}//end class
