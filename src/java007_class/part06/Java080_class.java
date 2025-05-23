package java007_class.part06;


public class Java080_class {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		cal.addValue(2, 7, 5);
		// cal.addValue(1.0, 2.0);  => double이라 오류 뜸
		cal.addValue(1.0, 2.0);
		
		//float으로 정의된 메소드가 없으면 상위 데이터 타입을 찾아서 자동 형변환시킨다.
		cal.addValue(1.0F, 2.0F);    // float의 상위가 double인데 자동형변환. 같은 게 없으면 위에 있는 걸 찾음 근데 아래는 해당 안됨
		
		cal.addValue(1L, 2L);		//메소드 이름을 같게 정의해 두었었기 때문에 데이터 입력하는데 유의
		
		
	}//end main()

}//end class
