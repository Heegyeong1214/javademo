package java007_class.part03;

public class Calc {
	int left;
	int right;
	char ope; // 연산자: + - * / 만 저장함

	public Calc() {

	}

	public Calc(int left, int right, char ope) {
		this.left = left; // 좌항의 left는 멤버 변수, 우항의 left는 매개 변수를 지칭함
		this.right = right;
		this.ope = ope;

	}

	int process() {
		switch (ope) {
		case '+':
			return left + right; // return을 했다는 것은 곧 끝난다는 의미여서 return 다음에 break 쓰면 안된다.

		case '-':
			return left - right;

		case '*':
			return left * right;

		default:    // 공란; case 1 2 3 이외의 모든 것
			return left / right;
		}
	}// end process()

	public String toString() {
		return String.format("%2d %2c %2d = %2d", left, ope, right, process());

	}

} // end class
