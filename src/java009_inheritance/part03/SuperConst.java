package java009_inheritance.part03;

public class SuperConst /*extends Object*/ {
	int x;
	int y;

	public SuperConst(int x, int y) { //4
		super(); //5; 인자 값이 없는 생성자(Object)를 불러올 때는 생략해도 괜찮음(
		this.x = x; //6
		this.y = y;  //7
		
	}//8
}
