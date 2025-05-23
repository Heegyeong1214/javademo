package java009_inheritance.part02;

public class MyChild extends MyFather {

	public MyChild() {	//2				//매개 변수가 없는 생성자
		super();		//3 MyFather의 생성자 실행	
		System.out.println("MyChild");//12
	}	//13
}//end class
