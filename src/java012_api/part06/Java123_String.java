package java012_api.part06;
//[출력결과]

//korea
//aerok
//korea

public class Java123_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = reverse(sn);
		System.out.println(sn);
		System.out.println(data);
		System.out.println(sn);

	}// end main()

	// alpa.length(), arr.length
	public static char[] reverse(String alpa) {
		// alpa매개변수에 저장된 문자열을 reverse한 후 반환하는
				// 프로그램을 구현하세요
		char[] arr = new char[alpa.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = alpa.charAt(arr.length - 1- i);
		}
		return arr;

	}// end reverse()

}// end class
