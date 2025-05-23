package java011_casting.part05;

class ExamA {
	void prn() {
	}
}

class ExamB extends ExamA {
	void prn() {
	}
}

class ExamC extends ExamB {
	void prn() {
	}
}

public class Java114_instanceof {

	public static void main(String[] args) {
		//객체  instanceof  비교 데이터 타입과 같거나 조상데이터 타입
		//비교 연산자라 논리인 t/f로 결과 나옴 => 객체만 비교할 수 있음
		//특정 클래스를 상속했는지를 확인하기 위함
		
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA); //true => B는 A에 상속되어 있으니까
		
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB); //false
		
		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA); //true
		System.out.println(ea instanceof ExamB); //true
		System.out.println(ea instanceof ExamC); //false => C는 A에 상속되어 있지 않음
		System.out.println(ea instanceof Object); //true		
	}//end main()

}//end class
