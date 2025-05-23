package java018_collection.part17;

public class Java204_Sort {

	public static void main(String[] args) {
		String a = "ABCawser24";
		String b="ABC";
		String d ="ABC";
		String e = "ab";
		
		System.out.println(a.compareTo(b));	//7 ; 같은 거 제외한 나머지
		System.out.println(b.compareTo(a));	//-7
		System.out.println(b.compareTo(d)); //0 ; 100% 같음
		System.out.println(d.compareTo(e)); //-32; 앞에서 뒤를 뺀 값(A-a)
		System.out.println(e.compareTo(e)); //32; 뒤에서 앞을 뺀 값(a-A)

	}//end main()

}//end class
