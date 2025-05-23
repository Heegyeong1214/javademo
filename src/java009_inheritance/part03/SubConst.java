package java009_inheritance.part03;
//생성자 명이 Class 이름이랑 같아야 하고 method는 Class 이름이랑 달라야 한다

public class SubConst extends SuperConst {

	public SubConst(int x, int y) { //2
		super(x, y); //3; SuperConst의 생성자 형태를 고대로 가지고 옴
	}//9
}
