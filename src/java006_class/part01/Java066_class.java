package java006_class.part01;

//클래스의 두가지 용도
// 1. 라이브러리 클래스: 실행할 수 없으며 다른 클래스에서 이용하는 클래스
// 2. 실행 클래스: main() 메소드를 가지고 있는 실행 가능한 클래스

public class Java066_class {

	public static void main(String[] args) {

		Person pn; // 객체참조변수 선언(1); 같은 패키지에 있으면 다른 클래스를 그대로 써도 됨
		pn = new Person(); // 객체 생성; 기본값만 저장됨 예) 0, 유니코드

		// 객체참조변수.멤버변수
		pn.name = "홍길동";
		pn.age = 30;
		pn.gender = '남';

		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gender); // 호출할 때는 pn.XXX 통으로 가져와야 함 예)pn.name

		// 객체참조변수.메소드 ; 메소드 호출할 때에도 sysout과 동일하게 적용함
		pn.develop();
		pn.run();

		Person ps = new Person(); // 객체참조변수 선언 및 생성(2)

		ps.name = "김영희";
		ps.age = 28;
		ps.gender = '여';
		
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		
		ps.develop();
		ps.run();       //pn.run();의 결과와 동일하기는 하지만 저장되어있는 데이터(ps,pn)이 다름(?)

	}//end main()

}//end class
