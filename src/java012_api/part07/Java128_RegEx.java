package java012_api.part07;

public class Java128_RegEx {
	
	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";

		// a 또는 r 이면 '_'로 변경
		for (int i = 0; i < sn.length(); i++) {
			char data = sn.charAt(i);
			if (data == 'a' || data == 'r') {
				sg += "_";
			} else {
				sg += data; // sg = sg + data;
			}
		}

		System.out.println(sg);
		
		System.out.println("===============Regular Expression을 이용한 문자 변경");
		//[]대괄호는 or을 의미한다
		// . : 임의 문자 하나
		// * : 0개 이상
		
		
		//sn변수에 저장된 문자열에서 a 혹은 r이라는 문자는 모두 _로 변경
		System.out.println(sn.replaceAll("[ar]", "_"));
		System.out.println(sn);
		
		// sn변수에 저장된 문자열이 a 이거나 r로 끝나면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar]"));

		// sn변수에 저장된 문자열이 a 이거나 r로 시작하면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches("[ar].*"));
		
		// sn변수에 저장된 문자열에서 a 이거나 r이 포함되여 있으면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar].*"));
		
		String st ="java@@@@korea";
		//st 변수에 저장된 문자열에서 "@"가 2개이상 3개 이하이면"_"로 대체한다.
		String sa = st.replaceAll("@{2,3}", "_"); //@가 2부터 3까지?
		System.out.println(sa);	
		//st 변수에 저장된 문자열에서 "@"가 2개이면"_"로 대체한다
		sa = st.replaceAll("@{2}", "_"); //@@가 2세트 -> _두개
		System.out.println(sa);	
		//st 변수에 저장된 문자열에서 "@"가 2개 이상이면"_"로 대체한다
		sa = st.replaceAll("@{2,}", "_"); //@가 2번 이상
		System.out.println(sa);	
		
		String sp ="java@@@@korea@@test@sample";
		String[] line = sp.split("@{1,}"); //@{1}로 해버리면 @하나만 인식해서 @@의 경우 나머지 @는 인식 못함
		for(int i = 0; i<line.length; i++) {
			System.out.printf("line[%d]=%s\n", i, line[i]);
		}			
		String su ="java  jsp oracle    mybatis";
		String[] arr = su.split("\s{1,}");
		for(int j = 0; j<arr.length; j++) {
			System.out.printf("arr[%d]=%s\n", j, arr[j]);

	}
	}

}
