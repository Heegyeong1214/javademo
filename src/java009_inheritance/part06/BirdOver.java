package java009_inheritance.part06;

public class BirdOver extends PetOver{
	
	public BirdOver() {
		
	}
	
	@Override
	public void move() {
		System.out.println("서브클래스() : 새가 날아갑니다.");
	}

}//end class
