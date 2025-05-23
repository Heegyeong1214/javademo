package java009_inheritance.part03;

public class Java095_inheritance {

	public static void main(String[] args) {
		SubConst sc = new SubConst(10, 20); // 1;  new하는 순간 메모리 생성이 됨
		System.out.printf("x=%d, y=%d\n", sc.x, sc.y); //10

	} //11

}
