package java010_abstract_interface.part03;

//추상 method의 목적? 여러 개의 클래스에 동일한 특징이 있지만 
//안 쓸 수도 있음.

public  abstract class Instrument {
	String name;

	public Instrument() {

	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	public abstract void play() ;
}
