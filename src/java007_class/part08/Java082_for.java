package java007_class.part08;

public class Java082_for {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		
		//일반 for
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("=======================");
		
		//element: 요소, num있는 자리에 배열이나 collection을 가지고 옴
				//element는 index에 저장되어 있는 값인 10, 20, 30, 40 , 50을 의미함
				//index가 [0], [1], [2], [3], [4]를 의미함
				
				
//				개선된 루프 = 확장된 루프 = 개선된 for문
//						  for(데이터타입 변수  : 배열 or 컬렉션 ) {
//						     수행할 문장;
//	}

								//배열의 단점은 설정해놓으면 변경할 수 없으나 컬렉션은 변경할 수 있음
								//그레서 배열보다 컬렉션을 주로 사용함
		
		for(int element: num) {			
			System.out.println(element);
		}
		
	}//end main()
	

}//end class
