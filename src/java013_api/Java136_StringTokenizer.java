package java013_api;

import java.util.StringTokenizer;

public class Java136_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자");
		// 문자열의 구분자가 공백일때는 2번째 파라미터값은 생략 할 수 있다.
		// StringTokenizer("java jsp"); => lang이 아니라 util에 있음
		StringTokenizer st = new StringTokenizer("java_jsp", "_");
		System.out.println(st.countTokens()); // 2
		System.out.println(st.nextToken()); // java
		// 메모리에 저장된 "java" 문자열을 가져오면서 기존 메모리에 저장된 "java" 문자열 메모리를 삭제한다.
		// java에서 jsp로 넘어가면서 java가 저장된 메모리는 삭제됨
		System.out.println(st.countTokens()); // 1
		System.out.println(st.nextToken()); // jsp
		System.out.println(st.countTokens()); // 0
		// jsp에서 넘어가면서 메모리가 전체 삭제됨
		// System.out.println(st.nextToken()); //java.util.NoSuchElementException

		System.out.println("==========countTokens()");
		st = new StringTokenizer("java_jsp", "_");
		int count = st.countTokens();
		for (int i = 0; i < count ; i++)
			System.out.println(st.nextToken());
		
		//Method가 is, has로 시작하는 것은 boolean
		System.out.println("============hasMoreTokens()========");
		st = new StringTokenizer("java_jsp", "_");
		//hasMoreTokens()은 메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}

}
