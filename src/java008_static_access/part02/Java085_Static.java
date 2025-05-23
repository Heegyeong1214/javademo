package java008_static_access.part02;

// OrderStatic os = new OrderStatic(); => OrderStatic이라는 생성자까지 호출해야함
// OrderStatic os; 참조하는 게 아무것도 없음

public class Java085_Static {

	public static void main(String[] args) {
		//Static은 딱 한번만 실행됨
		System.out.println("OrderStatic.y=" + OrderStatic.y);  // static도 바로 실행이 되서 static, y=5로 결과가 나옴
															   // static 안에 y=5가 여기서 호출이 다시 되서 맨 마지막에 나오는 것
		System.out.println("OrderStatic.z=" + OrderStatic.z);  // static으로 된게 실행이 되어서 z를 지정하지 않아서 0으로 나오는
//		OrderStatic.process();

//		OrderStatic os = new OrderStatic();
//		os.display();
		

	}

}
