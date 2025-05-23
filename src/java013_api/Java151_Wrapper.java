package java013_api;

public class Java151_Wrapper {

	public static void main(String[] args) {
		char data ='a';
		
		if(data >= 'a' && data <= 'z')
			System.out.println((char)(data-32));
		
		System.out.println(Character.isLowerCase(data));     //소문자야? static이 선언되어 있어서 class. method로 진행하는 것
		System.out.println(Character.toUpperCase(data));	// 대문자로 변경
		System.out.println(Character.isUpperCase(data));	//대문자니?	
		System.out.println(Character.toLowerCase(data));	//소문자로변경
		System.out.println(Character.isDigit(data));		//숫자니?
		System.out.println(Character.isAlphabetic(data));	//알파벳이니?
	}

}
