package java001_basic;

public class Java010_operators {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		// 전위연산자 : 값이 참조되기 전에 증가시킨다.
		j= ++i;
		System.out.printf("i=%d, j=%d\n", i, j);
		
		i = 5;
		j = 0;
		
		// 전위연산자 : 값이 참조된 후에 증가시킨다.
		j= i++;
		System.out.printf("i=%d, j=%d\n", i, j);
		
		
	}

}
