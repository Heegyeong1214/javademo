package java006_class.part05;

// 멤버변수의 초기값을 생성자를 통해서 전달하지 않으면 JVM에서 멤버변수에 기본값을 할당한다.
public class MemberVar {
	//멤버 변수는 기본값을 제공한다(JVM)
	
	byte var_byte;   //0 ; 클래스에 정의되어 있는 멤버 변수를 의미 -> 초기할당값이 없으니 0으로 저장
	short var_short; //0
	int var_int; 	 //0
	long var_long; 	 //0L -> L은 데이터가 long이라는 것을 의미함
	
	float var_float;   //0.0F
	double var_double; //0.0
	
	boolean var_boolean; //false
	char var_char;       //\u0000(공란)
	
	String var_str;      //null
	int[] var_arr; 	     //null
	
	
	
}
