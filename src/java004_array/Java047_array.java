package java004_array;

//[데이터]

//홍길동   90  85 40
//이영희  100  35 75
//
//[출력결과]
//홍길동   90  85 40 215 71.7
//이영희  100  35 75 210 70.0

public class Java047_array {

	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" };
		int[][] jumsu = { { 90, 85, 40 },
				          { 100, 35, 75 } }; //jumsu[2][3]

		int sum; //sum 선언만 하고 초기값이 없음
		         // int sum = 0;으로 선정하면 이영희 계산할 때 홍길동 계산한 값에서 시작함
		double avg;

		for (int i = 0; i < jumsu.length; i++) { //jumsu.length = 2
			sum = 0; //0을 안주게 되면 모든 값을 누적함
			         //여기에 넣는 이유가 홍길동의 합계, 이영희의 합계에 해당되는 거라 여기에 sum=0을 배치해서 각 인물당 점수를 초기화
			System.out.printf("%s\t", name[i]);
			
			for (int j = 0; j < jumsu[i].length; j++) { //jumsu[i].length = 3
				sum = sum + jumsu[i][j];
				System.out.printf("%4d", jumsu[i][j]);

			}
			
			avg = sum /(double) jumsu[i].length;
			System.out.printf("%4d %.1f\n", sum, avg);
		}

	}
	

}
