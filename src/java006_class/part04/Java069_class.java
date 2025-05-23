package java006_class.part04;

public class Java069_class {

	public static void main(String[] args) {
		
		Menushop m1 = new Menushop ();
		
		m1.menu = "떡볶이";
		m1.price = 2000;
		m1.cnt = 3;
		m1.display();
		
		Menushop m2 = new Menushop();
		m2.menu = "김말이";
		m2.price = 500;
		m2.cnt = 2;
		m2.display();
		
		Menushop m3 = new Menushop();
		m3.menu = "오뎅";
		m3.price = 300;
		m3.cnt = 4;
		m3.display();
		
		int total= m1.count() + m2.count() + m3.count();
		System.out.println("총 주문금액:" + total);

	}//end main()

}//end class
