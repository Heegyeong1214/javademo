package java001_basic;

/**
 * Test클래스는 main(), process() 메소드를 가지고 있다.
 * java doc 주석 : 프로그램 문서를 만들때 사용하는 주석
 * File > Export > Java > Javadoc > Next > Next > Next > VM options:-charset UTF-8 -encoding UTF-8 >Finish
*/

public class Test {

 /**
 * main() 메소드는 실행을 하면 main 스레드에서 호출되어 실행되는 메소드이다.	
 * @param args 실행시 문자열 배열을 받는 매개변수
 */
	public static void main(String[] args) {
		System.out.println("main method");
	}
 /**
 * process() 메소드는 객체의 동작을 처리해주는 메소드이다. 
 */
		public static void process () {
			System.out.println("process method");
		}
	}

