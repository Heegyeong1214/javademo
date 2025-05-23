package java012_api.part02;

public class Java116_Object_equals {

	public static void main(String[] args) {
		int k=3;
		int p=3;
		System.out.println(k==p); //일반 데이터이기 때문에 값을 비교해서 true
		
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		//메모리 주소 비교
		System.out.println(v1==v2); //false
		System.out.println(v1.equals(v2)); //false
		
		System.out.println("===================");
		
		Member m1 = new Member(10);
		Member m2 = new Member(10);
//		java012_api.part02.Member@4517d9a3
		System.out.println(m1);
//		java012_api.part02.Member@372f7a8d
		System.out.println(m2);
		System.out.println(m1==m2);  //false; 클래스는 참조데이터, 참조데이터를 비교할 때는 주소를 비교함.
									 //근데 m1이랑 m2는 주소가 다르니까 false
	
		System.out.println(m1.equals(m2)); //true, 오버라이딩 되었을 때의 값을 비교
	
		System.out.println("===================");
		String s1 = new String("java");
		String s2 = new String("java");
		
		//toString(); 메모리에 저장된 문자열을 리턴하도록 오버라이딩 해줌
		System.out.println(s1); //java
		System.out.println(s2.toString()); //java
		
		//메모리의 주소 비교
		System.out.println(s1==s2); 	//false;
		//String이라는 클래스에서 메모리에 저장되어 있는 문자열을 비교해서 리턴하도록 오버라이딩 해줌
		System.out.println(s1.equals(s2));	//true; 
		
		String s3= new String("jsp");
		System.out.println(s1==s3); 	 //false
		System.out.println(s1.equals(s3)); //false
	}

}
