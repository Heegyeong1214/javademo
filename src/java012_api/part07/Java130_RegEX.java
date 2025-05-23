
package java012_api.part07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java130_RegEX {

	public static void main(String[] args) {
		String phone = "016-253-5243";
		
		System.out.println(phone.matches("01(1|6|9)-[0-9]{3,4}-[0-9]{4}"));
		System.out.println(phone.matches("01(1|6|9)-[\\d]{3,4}-[\\d]{4}"));
		
		Pattern pt = Pattern.compile("01(1|6|9)-[0-9]{3,4}-[0-9]{4}");
		Matcher mt = pt.matcher(phone);
		while(mt.find()) {				//!mt.find()라고 하면 리턴하는 값 자체가 없음
			// group() 메소드는 find()을 실행 후 사용한다.
			System.out.println(mt.group());
		}
		
	} 

}
