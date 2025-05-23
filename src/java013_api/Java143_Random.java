package java013_api;

import java.util.Random;

public class Java143_Random {

	public static void main(String[] args) {
		// new Random (seed);
		//seed: 고정된 난수값을 구할 때 사용한다.
		
		Random ran = new Random();
		System.out.println(ran);
		
		//난수를 double로
		double rl = ran.nextDouble();
		System.out.println(rl);
		
		//난수를 정수로 
		int r2 = ran.nextInt();
		System.out.println(r2);
		
		//0부터 10 미만의 정수 랜덤(난수)
		int r3 = ran.nextInt(10);
		System.out.println(r3);

	}

}
