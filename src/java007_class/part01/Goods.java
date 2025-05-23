package java007_class.part01;

public class Goods {
	String name; // 상품명
	int price; // 가격
	int numberOfStock; // 상품재고
	int sold; // 팔린 수량

	// 생성자 생성 방법: Cntrl+Space
	public Goods() {

	}

	// this.XXX 불러오기: 오른쪽 마우스 > Source > Generate Constructor using Fields >
	// Generate
	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}

	public String toString() {
		return String.format("%-14s  %5d  %5d  %5d", name, price, numberOfStock, sold); //출력은 안하고 설정한 자리에 지정한 데이터가 출력되는 거?
	}

}// end class
