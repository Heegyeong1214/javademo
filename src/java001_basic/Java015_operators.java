package java001_basic;

public class Java015_operators {

	public static void main(String[] args) {
		// 대입연산자
		int x = 3;
		int res = 0;

		res = 3 + 2;
		System.out.println(res);
		
		// x = x + 1; -> x +=1 그냥 표현 방식이 다름       ++x
		x +=1;
		System.out.println(x);
		
		// x = x - 1;
		x -=1;
		System.out.println(x);
		
		// x = x * 1
		x*= 1;
		System.out.println(x);
		
		// x = x/1;
		x /=1;
		System.out.println(x);
	}

}
