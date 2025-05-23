package java004_array;

public class Java042_array {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0; // 홀수 누적
		int even = 0; // 짝수 누적

//		even = even + num[0];
//		odd = odd + num[1];
//		even = even + num[2];
//		even = even + num[3];
//		

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 1) {
				odd = odd + num[i];
			} else {
				even = even + num[i];
			}
		}
		System.out.printf("홀수:%d\n", odd);
		System.out.printf("짝수:%d\n", even);

	}// end main()

}// end class
