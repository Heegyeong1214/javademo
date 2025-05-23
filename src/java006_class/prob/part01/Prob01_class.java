package java006_class.prob.part01;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	

		Area par =new Area();
		par.menu = "피자";
		par.r = 10; //피자
		par.display();
		
		Area dar = new Area();
		dar.menu ="도넛";
		
		dar.r = 2;
		dar.display();
		
	}//end main()

}//end class
