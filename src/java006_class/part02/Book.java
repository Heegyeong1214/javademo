package java006_class.part02;

//[도서관리]
//제목                        대출여부   //대출 여부를 굳이 대출중, 대출가능으로 단어로 저장하지 않고 조건문 사용해서 저장
//칼의 노래                     대출중
//어두운 상점의 거리              대출가능
//
//
//[객체 모델링 과정]
//객체의 특징 : 책제목, 대출여부
//객체의 기능 : 대출여부를 처리한다.

public class Book {// 실제 객체를 메모리에 저장해서 원하는 연산대로 진행하도록 하기 위해 class 설정; 
				   // 원래 했던 대로 길게 이어지게 작성해도 괜찮지만 메모리 차지 및 데이터 관리하기가 너무 어려워서 class 설정한 것+  
	
	String title;
	boolean state;		// 대출가능 : true, 대출중: false
	
	
	String process() {
		
		//3항 연산자로도 사용해도 됨
		if (state) {
			return "대출가능";
		}else {
			return "대출중";
		}
	}//end process()
	
	void display() {
		System.out.printf("%s, %s\n", title, process());
	}
	
}//end class
