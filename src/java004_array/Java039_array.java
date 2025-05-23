package java004_array;

public class Java039_array {

	public static void main(String[] args) {
		int ko = 90;
		int en = 80;
		int jp = 40;
		
		int[] arr; //int[] 배열 선언
		
		//new키워드를 이용해서 배열 생성: 메모리 확보했다는 의미
		//각 요소(element)마다 인덱스(index)가 0부터 생성된다.
		//stak:arr는 heap의 주소를 저장하고, heap에서는 stak에서 저장한 주소의 인덱스 값 (0,1,2...)이 저장됨 (stak과 heap은 이어져 있음)
		
		arr = new int[3];
		
		// int[] arr = new int [3];
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;
		
		System.out.printf("arr[0]=%d\n", arr[0]);
		System.out.printf("arr[0]=%d\n", arr[1]);
		System.out.printf("arr[0]=%d\n", arr[2]);
		
		System.out.println("배열의 크기:"+arr.length);
		
		for (int index = 0; index <= 2; index++) {
			System.out.printf("arr[]=%d\n",index, arr[index]);
		}
		
	}// end main()

}// end class
