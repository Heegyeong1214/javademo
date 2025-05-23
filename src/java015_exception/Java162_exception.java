package java015_exception;

public class Java162_exception {

	public static void main(String[] args) {
		String data1 = "8";
		String data2 ="0";
		
		try {
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2); //알파벳은 int로 안되서 실행 안됨
		int res =x/y;
		System.out.println(res);
		
		//다중 catch일 때는 독립적인 예외끼리는 순서 상관 없음
		//상속된 클래스를 나열한다고 하면 아래로 갈 수록 부모클래스여야 함
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch (ArithmeticException ex) {
			System.out.println(ex.toString());
		}catch(RuntimeException ex) {
			System.out.println(ex.toString());
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		

	}

}
