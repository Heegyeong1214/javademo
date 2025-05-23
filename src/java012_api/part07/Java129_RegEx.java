package java012_api.part07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java129_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String st = "aetwef";
		
//		System.out.println(sn.matches(".[abcd]")); //false:12345중에 abcde는 없음
//		System.out.println(sn.matches(".*[a-z].*")); //
//		System.out.println(sn.matches(".*[a-zA-Z].*")); // 대소문자 관계 없이 앞뒤로 임의의 문자 있어야 함
		
		//a-zA-Z_*$가 sn변수에 포함되어 있으면 true 아니면 false를 리턴한다
		//[  ]는 or을 의미한다: a이거나 b이거나 c이거나 d
		// .는 임의 문자를 의미하고 .*는 임의의 문자 0개 이상(생략 가능)을 의미한다. 
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));  //false
		
		//sn변수에 숫자 0-9가 포함되어 있으면 true 아니면 flase를 의미한다.
		System.out.println(sn.matches(".*[0123456789].*"));		//true
		System.out.println(sn.matches(".*[0-9].*"));	//true
		
		//\d는 기호를 의미, \d를 문자열로 나타내주기 위해 \\d로 사용
		System.out.println(sn.matches(".*[\\d].*"));
		System.out.println(sn.matches(".*\\d.*"));
		
		//[^] 대괄호 안에서 ^: not
		//sn변수에 숫자 0-9가 포함되어 있지 않으면 true, 포함되어 있으면 false
		System.out.println(sn.matches(".*[^0123456789].*"));	
		System.out.println(sn.matches(".*[^0-9].*"));
		System.out.println(sn.matches(".*[\\D].*"));
		System.out.println(sn.matches(".*\\D.*"));
		
		String sb = "bscba5";
		//sb변수에 저장된 값이 2로 시작되면 true, 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*")); //false
		//sb변수에 저장된 값이 2로 시작되고 5로 끝나면 true, 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*5")); //false
		// sb변수에 저장된 값이'a'이거나 'b'로 시작하고 임의의 문자 5개가 뒤에 오면 true, 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));
		
		System.out.println("====Pattern====");
		
		String input = "3a4bsfa";
		System.out.println(input.matches("\\d"));	//false
		
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		//java.util.regex.Matcher[pattern=\d region=0,7 lastmatch=]
		System.out.println(mc);
		
		//find(); 0인덱스부터 input의 \\d(숫자)를 찾으세오; 3부터 시작하면 그래서 처음으로 일치한 3을 리턴
		System.out.printf("%b %s\n", mc.find(), mc.group());
		//find(0); 0인덱스부터  \\d를 찾으세오; 3부터 시작하면 3
		System.out.printf("%b %s\n", mc.find(0), mc.group());
		//find(1); 1인덱스부터  \\d를 찾으세오; a부터 시작하면 4만 있음
		System.out.printf("%b %s\n", mc.find(1), mc.group()); 
		//find(2); 2인덱스부터  \\d를 찾으세오; 4부터 시작하면 4
		System.out.printf("%b %s\n", mc.find(2), mc.group());
		
		//3인덱스이후로는 숫자가 없음; 패턴에서 지정한 데이터가 없기 때문에 Exception이 발생한다.
		//java.lang.IllegalStateException
//		System.out.printf("%b %s\n", mc.find(3), mc.group());
//		System.out.printf("%b %s\n", mc.find(4), mc.group());
		
		System.out.println("=============================");
		
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
		System.out.println(mhMatcher);
		
		int i = 1;
		
		//mhMatcher.find()=true일 때만 반복문 리턴
		while (mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
			
			System.out.println("=========10 20  30=========================");
			str = "The BEst10 things in best life are best30 free";
			ptPattern = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);	//|는 or
			mhMatcher = ptPattern.matcher(str);
			
			i = 1;
			while(mhMatcher.find()) {
				System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
			}


		}


	}
}
