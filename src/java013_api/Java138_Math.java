package java013_api;
//Math는 모든 변수, 메소드가 static이 선언되어 있다.
//Math.멤버변수
//Math.메소드() 이렇게 호출할 수 있음

public class Java138_Math {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		//System.out.println(Math.random());  //0.0에서 1.0미만
		
	double de = Math.random();	//0.0이상 1.0미만
	System.out.println(de);
	
	de = de*10; //0.0이상 ~ 9.9999..까지
	System.out.println(de);
	
	//floor()는 소수점 이하는 무조건 버림
	System.out.println(Math.floor(de));  // 0.0 ~ 9.0
	//int로 자료형 변환
	System.out.println((int)Math.floor(de)); //0 ~ 9
	
	System.out.println((int)Math.floor(de) + 1); //1~10까지
	
	System.out.println((int)Math.floor(Math.random()*10) + 1); //1부터 10까지의 난수 구하기
	}//end main()

}//end class
