package java018_collection.part10;

public class Box<T> {
//	<>안에 데이터 타입을 무엇을 설정하느냐에 따라 객체 생성할 때의 데이터 타입도 같이 따라가야함
//	<>제너릭 타입이 Integer이면 객체의 데이터 타입도 Integer
	//예) Box<String> b = new Box<String>("java")
	
	//T는 아무거나 상관없을 때 그냥 사용함
	//T가 영향이 가는 메소드는 매개변수에 T를 정해야 함
	private T data;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}
	
	public Box(T data) {
		this.data = data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
}//end class


