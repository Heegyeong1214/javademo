package java006_class.answ.part01;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.00
 * 자바도넛의 면적은 12.56
 */



public class Prob01_class {

	public static void main(String[] args) {
		// 여기를 구현하세요.////////////////////
		Circle ca = new Circle();
		ca.name = "자바피자";
		ca.radius = 10;
		Circle cb = new Circle();
		cb.name = "자바도넛";
		cb.radius = 2;

		System.out.println(ca.name + "의 면적은 " + ca.getArea());
		System.out.println(cb.name + "의 면적은 " + cb.getArea());
	}// end main()

}// end class
