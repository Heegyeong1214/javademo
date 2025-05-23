package java004_array;

//가변배열을 생성할때는 제일 마지막의 배열크기는 지정하지 않는다.
//가변배열을 제공하는 이유는 메모리 손실을 최소화 하기 위한 목적이다.

// 행의 크기만 지정하면 됨
//		int[][] num = new int[3][];
//		num[0] = new int[2];  //0행에 2개의 열을 생성함
//		num[1] = new int[3];  //1행에 3개의 열을 생성함
//		num[2] = new int[5];  //2행에 5개의 열을 생성함

//		int[][] num = new int[3][];
//		num[0] = new int[] {1,2};
//		num[1] = new int[] {3,4,5};
//		num[2] = new int[] {6,7,8,9,10};

public class Java052_array {

	public static void main(String[] args) {

//		int[][] num = new int[3][];
//		System.out.println(num[0]);
//
//		num[0] = new int[2];
//		num[1] = new int[3];
//		num[2] = new int[5]; // 2번째 행에 5열 생성, 초기값=0

//		System.out.println(num[0]);
//		System.out.println(num[0][0]);

/////////////////////////////////////////////////////////		
//		int[][] num = new int[3][];
//		num[0] = new int[] { 1, 2 };
//		num[1] = new int[] { 3, 4, 5 };
//		num[2] = new int[] { 6, 7, 8, 9, 10 };
//////////////////////////////////////////////////////////

		int[][] num = new int[][] { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9, 10 } }; // 초기값을 지정해 줄 때에는 new int[][]에 행 혹은 열의 크기를 넣으면 안됨
																				

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}

			System.out.println();
		}

	}// end main()

}// end class
