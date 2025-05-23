package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int sum = 0;

//		sum = sum + num[0]; // 22 = 0 + 22
//		sum = sum + num[1]; // 25 = 22 + 3
//		sum = sum + num[2]; // 25 + 8 = 33
//		sum = sum + num[3]; // 12+ 33 = 45
//		
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		System.out.println("합계:" + sum);

	}// end main()

}// end class
