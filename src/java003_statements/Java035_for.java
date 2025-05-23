package java003_statements;

public class Java035_for {

	public static void main(String[] args) {

		go: // label -> 특정 반복문을 빠져나오고 싶으면 label을 해서 마지막에 break go로 진행 (13번 라인)
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) { 
				System.out.printf("j=%d\n", j);
				if (j == 3) {
					// break; // 2번째 for (if와 가장 가까운 반복문)를 만남
					// break go; // end main으로 나감
					//continue; //아래 실행문의 유무에 상관없이 현재 수행 중인 for문의 증감식 (j++)으로 이동한다.
					continue go; // for 문에서 continue go를 만나면 go라벨이 설정된 for문의 증감식으로 이동한다.
				}
			}
		}
	}// end main()

}// end class
