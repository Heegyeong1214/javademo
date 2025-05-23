package java007_class.part04;

public class Study {
	public static void main(String[] args) {
		Insurance[] is = new Insurance[4];
		is[0] = new Insurance("a001", "생명보험", "자동차보험", 30000);
		is[1] = new Insurance("a002", "생명보험", "운전자보험", 20000);
		is[2] = new Insurance("b001", "손해보험", "화재보험", 15000);
		is[3] = new Insurance("b002", "손해보험", "해상보험", 25000);
		String search = "손해보험";
		
		int sum = process(is, search);
		totalPrice(sum, search);
	}//end main()

	

		public static int process(Insurance[] is, String name) {
			
			int sum = 0;
			for(int i =0; i < is.length; i++) {
				if(is[i].name == "손해보험") {
					sum = sum + is[i].payment;
			}
			}return sum;
			}//end process()
			
			public static void totalPrice(int sum, String name) {
				System.out.printf("%s 총 납입액은 %d원 입니다.", name, sum );
			}
			
		
	
		
}//end class
