package java003_statements;

//2개의 주사위를 던졌을때 합계가 5가 되는 경우의 수를 구하시오.
//(1,4),(2,3),(3,2),(4,1)

public class Java034_for {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 5) {
					// System.out.printf("(%d,%d)=%-4d", i, j, i + j);
					System.out.printf("(%d,%d),", i, j);
				}
			}
		}

	}// end main()

}// end class
