package java004_array;

//1  2  3  4  5
//10 9  8  7  6
//11 12 13 14 15
//20 19 18 17 16

public class Java050_array {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i % 2 == 0) {
					System.out.printf("%4d", num[i][j]);
				}else {
					System.out.printf("%4d", num[i][num[i].length-1-j] ); 
					//num[i].length -1 : index값이고 고정되지 않을 수도 있으니까 규칙 만들어서 적용한 것
				
				}

			}
			System.out.println();
		}

	}// end main()

}// end class
