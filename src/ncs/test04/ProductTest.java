package ncs.test04;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pt = new Product();
		pt.name = "갤럭시 s7";
		pt.price = 563500;
		pt.quantity = 3;
		
		//System.out.println(pt.information());
		
		System.out.printf("상품명: %s\n", pt.name);
		System.out.printf("가격: %d 원\n", pt.price);
		System.out.printf("수량: %d 개\n", pt.quantity);
		System.out.printf("총 구매 가격: %d\n", pt.quantity*pt.price);
		
		
	}//end main()

}//end class
