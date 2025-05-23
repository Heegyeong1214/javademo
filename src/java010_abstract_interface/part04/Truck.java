package java010_abstract_interface.part04;

public class Truck implements CarRun {
	
	public Truck() {
		
	}
	
	@Override
	public void prn() {
		System.out.println("truck prn");
		
	}
	//CarRun 인터페이스에서 default void 메소드를 오버라이딩을 해서 가지고 오면 public void라고 변경해야 함
	@Override
	public void call() {			
		System.out.println("Truck call");
	}
}
