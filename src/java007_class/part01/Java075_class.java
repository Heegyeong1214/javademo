package java007_class.part01;

public class Java075_class {

	public static void main(String[] args) {

//		Goods g1 = new Goods("Nikon", 40000, 30, 50);
//		System.out.println(g1.toString());
//		
//		Goods g2 = new Goods("Sony", 45000, 20, 35);
//		System.out.println(g2.toString());
//		
//		Goods g3 = new Goods("Fujifilm", 35000, 10, 25);
//		System.out.println(g3.toString());
//		

		// 배열을 이용하여 데이터 관리
		Goods[] goods = new Goods[3]; // 기본값은 null
		goods[0] = new Goods("Nikon", 40000, 30, 50);
		goods[1] = new Goods("Sony", 45000, 20, 35);
		goods[2] = new Goods("Fujifilm", 35000, 10, 25);

//		System.out.println(goods[0].toString());
//		System.out.println(goods[1].toString());
//		System.out.println(goods[2].toString());

//		for (int i = 0; i < goods.length; i++) {
//			System.out.println(goods[i].toString());
//	}
		
		process(goods); //(1) process 메소드를 호출하면서 goods를 넘겨준다. 
	} // end main()
	public static void process(Goods[] goods) {     //(2)동일한 타입으로 넘겨주고 (3)이름은 main method랑 달라도 됨
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i].toString());
	}
	}
}// end class
