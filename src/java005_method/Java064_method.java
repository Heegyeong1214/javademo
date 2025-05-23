package java005_method;

//[출력결과]
//java test
//tset avaj
//java test

public class Java064_method {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}// end main()

	public static char[] reverse(char[] data) {
		// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현

		char[] alpa = new char[data.length]; // data. length는 변할 수 있는 값이라서 arr의 9를 입럭하면 안됨
		                                     // char라서 ' '가 저장되어 있음
											// char[] alpa = data; 로 지정하게 되면 세번째 출력 결과에도 영향을 줘서 reverse된 결과가 나옴

		for (int i = 0; i < data.length; i++) {
			alpa[i] = data[data.length - 1 - i]; // alpa가 0일 때 data는 8이어야 함
		}

		return alpa;

	}// end reverse()
}// end class
