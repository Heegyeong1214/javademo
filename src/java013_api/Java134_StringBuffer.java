package java013_api;

public class Java134_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		System.out.println(sb);
		System.out.println(sb.toString()); //메모리에 저장되어 있는 문자열을 리턴
		
		//4인덱스부터 jsp를 삽입함
		//insert는 중간에 String 삽입, append는 맨 마지막에 String 추가
		sb.insert(4, "jsp");
		System.out.println(sb); //javajsp test
		
		//4인덱스부터 7인덱스 미만 사이에 있는 문자열을 삭제하기
		sb.delete(4, 7);
		System.out.println(sb); //java test
		
		//문자열을 앞뒤 변경한다
		sb.reverse();
		System.out.println(sb);
		
		//String -> StringBuffer -> String
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data); //String을 StringBuffer로 변경
		sf.reverse(); 
		System.out.println(sf); //StringBuffer
		String ss = sf.toString();//StringBuffer에서 String으로 변경
		System.out.println(ss); //String
		
		
		//static이 없으면 객체 생성한 다음에 사용할 수 있어서 바로 사용 못함
		//char[] -> StringBuffer
		char[] arr = {'k','o','r','e','a'};
		
		// String class에서 배열을 받음
		// String ss = new String(arr);
		StringBuffer sk = new StringBuffer(new String(arr)); //; new String(arr)는 한번만 쓸거라서
		System.out.println(sk.reverse());  //aerok
		
		//static이면 굳이 new를 해서 객체를 만들지 않아도 괜찮아
		//근데 배열을 String이라는 값을 만들기 위해 valueof라는 method가 있는데, 이게 static이라 new라는 객체를 굳이 만들지 않아도 된다!
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		System.out.println(se.reverse());
		
		//StringBuffer -> String -> char[]
		String sp = se.toString();
		char[] val =sp.toCharArray();
		System.out.println(val);
		// 위의 값을 아래처럼 만들 수 있음
		System.out.println(se.toString().toCharArray());

	}
}
