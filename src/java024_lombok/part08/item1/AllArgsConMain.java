package java024_lombok.part08.item1;

public class AllArgsConMain {

	public static void main(String[] args) {
		//private static String code로 선언되여 있으므로 
		//@AllArgsConstructor을 선언하면 public (String pname, int price, boolean chk)으로 정의된다.
		Product sc= new Product("모니터", 3000, true);
		System.out.println(sc);
	}

}
