package java015_exception;

public class Java166_exception {

	public static void main(String[] args) throws UserException {

		int data = 15;

		try {
			if (data < 10) {
				//throw: 개발자가 강제적으로 예외를 발생시킬 때 사용한다.
				throw new UserException("10이상만 가능합니다.");
			}
			System.out.println(data);

		} catch (UserException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
