package java024_lombok.part08.item4;

public class ArgsConMain {

	public static void main(String[] args) {
		Product noArgs= new Product();
		System.out.println(noArgs);
		
		Product reqArgs = new Product("홍길동", 3000);
		System.out.println(reqArgs);
		
		Product allArgs = new Product("김민재",5000 , true);
		System.out.println(allArgs);

	}

}
