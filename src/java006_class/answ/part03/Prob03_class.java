package java006_class.answ.part03;
/*
 * draw()메소드를   [실행결과]를 참조하여 구현하세요.
 * 
 * [실행결과]
 * &&&&&&&&&&
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 */



public class Prob03_class {

	public static void main(String[] args) {
		//여기를  구현하세요.
		Box a = new Box(); // 10x1 사각형
		Box b = new Box(20, 3); // 20x3 사각형
		a.fill('&'); // box를 그릴 때 사용하는 문자 '&'
		b.fill('%'); // box를 그릴 때 사용하는 문자 '%'
		a.draw(); // 박스 그리기
		b.draw(); // 박스 그리기

	}//end main()

}//end class
