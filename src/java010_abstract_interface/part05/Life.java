package java010_abstract_interface.part05;

//여러개의 인터페이스를 상속할 수 있는데 SampleA다음 SampleB 순으로 상속된
//extends 다음에 implements 순으로 작성해야 함
//extends ~~~ implements ~~~, ~~~, ~~~

public class Life extends Animal implements  SampleA, SampleB {
	
	public Life() {
	
	}
	
	//Animal의 display(); 는 구현되어 있어서 (sysout "animal") 오버라이딩해도 전부 다 넘어오지는 않음, 근데 여기서 다시 재설정할 수는 있음
	// 인터페이스는 추상 메소드이기 때문에(sysout이 없고 그냥 메소드 명만 적어두었음) 오버라이딩이 되어서 여기서 sysout을 설정해줘야 함
	@Override  //from interface SampleB
	public void call() {
		System.out.println("call");
	}

	@Override //from interface SampleA
	public void prn() {
		System.out.println("prn");
		
	}
	
	
}//end class
