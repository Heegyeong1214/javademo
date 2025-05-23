package java013_api;
//   java.lang.String : immutable(불변)
//   java.lang.StringBuffer : mutable(가변), 동기화
//   java.lang.StringBuilder: mutable(가변), 비동기화
//  
//   StringBuffer 특징
//   1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
//   2. 기본 16문자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.

public class Java133_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp");
		System.out.println("sg:"+sg);
		System.out.println("ss:"+ss);
		System.out.println(sg==ss);  //주소 비교
		System.out.println("sg:" +sg);	//sg:java test java
		System.out.println("ss:" + ss); //ss:jsp test jsp
		
		System.out.println(System.identityHashCode(sg)); //메모리; 258952499
		System.out.println(System.identityHashCode(ss)); //메모리; 603742814
		
		StringBuffer sb = new StringBuffer("spring test");
		//replace(int start, int end, String sr)
		//7인덱스부터 11인덱스 미만 사이의 문자열을 "framework"로 변경한다.
		StringBuffer su = sb.replace(7, 11, "framework");
		System.out.println("sb:"+sb);
		System.out.println("su:"+su);
		System.out.println(sb==su);  //주소 비교
		System.out.println(System.identityHashCode(sb)); //1067040082
		System.out.println(System.identityHashCode(su)); //1067040082
	}

}
