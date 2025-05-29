package ncs.test05;
//자바의 정석, 남궁성, 도우출판, 30000원, 10% 할인 
//할인된 가격 : 27000원 
//열혈강의 자바, 구정은, 29000원, 10% 할인 
//할인된 가격 : 261000원 
//객체지향 JAVA8, 금영욱, 30000원, 10% 할인 
//할인된 가격 : 27000원 


public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		Book bk1 = new Book("자바의 정석", "남궁성", 30000,"도우출판", 0.1);
		Book bk2 = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		Book bk3 = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		
		bArray[0]= bk1;
		bArray[1]= bk2;
		bArray[2]= bk3;
		


		for(int i = 0; i < bArray.length; i++) {
			System.out.printf("%s, %s, %d원, %f%%할인\n", bArray[i].gettitle(), bArray[i].getauthor(), bArray[i].getprice(), bArray[i].getdisconutRate()*100);
			System.out.printf("할인된 가격: %f원\n", bArray[i].getprice()-(bArray[i].getprice()*bArray[i].getdisconutRate()));
		}
	}//end main()
	
	
}//end class
