package java018_collection.part10;

public class Java197_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> strBox = new Box<String>("java");
		//Box 클래스에서 getData의 타입은 그냥 T인데, 여기서 String으로 제네릭을 설정해두었으니 getData도 같이 String으로 변경
		System.out.println(strBox.getData());
		
		Box<Integer> intBox = new Box<Integer>(10);	//값을 지정해두었으니 set data를 굳이 하지 않고 바로 get data로 호출 가능함
		System.out.println(intBox.getData());
		
		Box<Double> dblBox = new Box<Double>(); //값을 설정하지 않았음
		dblBox.setData(4.5);					//set data 사용해서 값을 지정해주고
		System.out.println(dblBox.getData());	//get data 사용해서 값을 호출
	}

}
