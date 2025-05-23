package java004_array;

public class Java040_array {

	public static void main(String[] args) {

		// 초기값 할당{}하면서 배열을 생성하는 경우에는 배열 [] 의 크기값을 지정할 수 없다.
		int[] arr = new int[] { 90, 80, 40 };

		for (int i = 0; i < arr.length; i++) { // arr.length=3(배열의 크기)
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}

		int[] data = { 90, 80, 40 };
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d]=%d\n", i, data);
		}
	} // end main()

}// end class
