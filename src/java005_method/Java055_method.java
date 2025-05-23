package java005_method;

public class Java055_method {

	public static void main(String[] args) { 				 //1
	
	process("홍길동", true);									 //2
	save(3000); 											 //7
	
	process("이영희", false);									 //11 //void라서 process 앞에 결과값을 받는 변수가 있으면 안된다
	save(0);                								//16
	
	}//end main()											//20
	
	public static void process(String name, boolean chk) { //3 //12
		if(chk) { 										  //4  13
			System.out.printf("%s님은 회원입니다.\n", name);  //5
		}else {
			System.out.printf("%s님은 비회원입니다.\n", name); //14
		} 
	}//end process()  									  //6   15
	
	public static void save(int point) {                  //8	17
		System.out.printf("%d 포인트가 적립되었습니다. \n", point);  //9	18
	}//end save()     									//10	19
	
}//end class
