package java024_lombok.part08.item3;

public class RequiredArgsConMain {

	public static void main(String[] args) {
		//@RequiredArgsConstructor
		Product pt = new Product("김민재", 3000);  // Product(String pname, int price)
		System.out.println(pt.toString());
		
		//@AllArgsConstructor
		Product pn = new Product(null, 0, false); // Product(String pname, int price, boolean chk)
        System.out.println(pn.toString());
	}

}
