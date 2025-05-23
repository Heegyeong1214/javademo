package java006_class.part07;

public class Java072_this {
	
	public static void main(String[] args) {   //public class Product에서 선정한 값을 호출?함 -> 2번째로 적용 가능
		Product pt = new Product("s001", "공산품", 4000);
		//pt.display();
		
		pt.process();
		Product pd = new Product();
		pd.process();
	}//end main()
}//end class
