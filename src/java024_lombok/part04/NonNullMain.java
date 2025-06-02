package java024_lombok.part04;

import lombok.NonNull;
/*@NonNull
 * 1. null값을 허용하지 않는다.
 *    @NonNull메소드 또는 생성자의 매개 변수를 사용 하여 lombok이 널 검사 명령문을 생성하도록 할 수 있다.
      null check는 if (param == null) throw new NullPointerException("param is marked @NonNull but is null")와 같은 방법으로 맨 위에 삽입 된다.
      생성자의 경우 명시적으로 this() 또는 super() 호출 직후에 null 검사가 시작된다.
      null 검사가 상위에 있는 경우, 추가 null 검사를 실행하지 않는다.
     */
public class NonNullMain {

	public static void main(String[] args) {
//		display("서울");
//		display(null);
		
//		nullCall("대전");
//		nullCall(null);
		
		//기본생성자는 @NonNull이 적용되지 않는다.
		UserDTO dto = new UserDTO(); 
		System.out.println(dto);
		
		
		//@AllArgsConstructor을 설정하고 실행하면 exception이 발생된다.
		//java.lang.NullPointerException: id is marked non-null but is null
		//UserDTO dto2 = new UserDTO(null, "1234"); 
		//System.out.println(dto2);
		
		nonNullCall("경기");
	//	nonNullCall(null);  //data is marked non-null but is null
		
	}//end main()
	
	public static void display(String data) {
		System.out.println(data);		
	}
	
	public static void nullCall(String data) {
		if(data==null)
			throw new NullPointerException("data is marked non-nul but is null");
		System.out.println(data);
	}
	
	public static void nonNullCall(@NonNull String data) {
		System.out.println(data);
	}

}//end class
