package java001_basic;
// && and
// || or

// true && true => true
// true && false => false
// false && true => false
// false && false => false
//
// true || true => true
// true || false => true
// false || true => true
// false || false => false
//
// !true => false
// !false => true


public class Java012_operators {

	public static void main(String[] args) {
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res;
		
		res = x < y && x == z; // res = true && true = true
		System.out.println("res=" + res);
		
		res = x > y || x == z; // res = false || true
		System.out.println("res=" + res);
		
		//java에서는 논리연산자 양변에 무조건 논리값이 와야 한다.
		// res = 1 && x==z;  -> 좌변이나 우변에 상수가 오면 안된다.
	}

}
