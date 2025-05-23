package java009_inheritance.part08;

public class Java100_inheritance {

	public static void main(String[] args) {
		OwnerEngine oEngine = new OwnerEngine(); //Stack에 oEngine이라는 메모리가 생성되고 heap에 Car, Owner Engine이라는 메모리가 함께 생성됨!
		System.out.println(oEngine.toString());
		oEngine.setSpeed(100);
		oEngine.color = "Blue";		// 접근제어자가 default로 되어있기 때문에 바로 접근이 가능해서 직접 지정 (Car Class)
		oEngine.setSeat(4);
		System.out.println(oEngine.toString());
		
		FireEngine fireEngine = new FireEngine();
		System.out.println(fireEngine.toString());
		fireEngine.color="Red";
		fireEngine.setSpeed(150);   	//접근제어자가 private로 되어있어서 바로 접근할 수 없어서 method로 호출하는 것
		fireEngine.setWater(10000);
		System.out.println(fireEngine.toString());

	}//end main()

}//end class
