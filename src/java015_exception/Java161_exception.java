package java015_exception;

public class Java161_exception {

	public static void main(String[] args) {
		StringBuffer sBuffer = null;
		
		try {
			sBuffer.reverse(); //compile할 때는 오류가 안뜨지만 실행하면 오류 뜸? null
		}catch(NullPointerException ex) {
			sBuffer = new StringBuffer("java");
			sBuffer.reverse();
			System.out.println(sBuffer);
		}
		

	}

}
