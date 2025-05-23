package java009_inheritance.part07;

public class SuperClass {
	int x, y, z;
	public SuperClass() {  //10		
        System.out.println("*** x,y,z에 값채우기***"); //11
	} //12
	
	public SuperClass(int k) { //8
		this();  //9				SuperClass의 ()를 가져옴
		this.x = k;  //13
		System.out.println(k +"을 넘겨받은 생성자"); //14
	}  //15
	
	public SuperClass(int a, int b) { //6
		this(a);  //7
		this.y=b;  //16
		System.out.println(a+ "  " + b +"  을 넘겨받은 생성자");  //17
	} //18
	
	public SuperClass(int a, int b, int c) { //4
		this(a, b);  //5
		z = c;  //19
		System.out.println(a + "   " + b + "   " + c + "을 넘겨받은 생성자");
	} //20
	
	public void display() {  //22
		System.out.printf("%d %d %d\n", x, y, z);  //23
	} //24
}//end class

