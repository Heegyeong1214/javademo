package java009_inheritance.part06;

public class DogOver extends PetOver{
	
	public DogOver() {
		
	}
	
	@Override //PetOver class에 있는 method를 DogOver에 맞게 가지고 온 것
	public void move() {
		//super.move();  => 이걸 그대로 놔두면 PetOver에 있는 move()가 호출이 되어서 반려동물이 움직입니다로 호출 됨
		System.out.println("서브클래스() : 강아지가 걸어갑니다."); 
	}

}//end class
