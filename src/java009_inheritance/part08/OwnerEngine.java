package java009_inheritance.part08;

public class OwnerEngine extends Car{
	private int seat;   //seat 변수
	
	public OwnerEngine() {
	
	}
	
    public void setSeat(int seat) {
		this.seat = seat;
	}
    
    public void information() {
    	System.out.println(seat + "인승 차량입니다.");
    }
    
    @Override
    public String toString() {
    	return String.format("차량의 색상:%s  속도:%d  인원:%d", color, getSpeed(), seat);
    }
}
