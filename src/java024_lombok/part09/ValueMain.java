package java024_lombok.part09;

public class ValueMain {

	public static void main(String[] args) {
		ValueDTO ex = new ValueDTO("김민재", 5000, true);
		System.out.printf("%s %d %b\n", ex.getPname(), ex.getPrice(), ex.isChk());
		
		/*
		 * @Value으로 설정하면 멤버변수를 immutable(불변)으로 설정한다.
		 * 그래서 새로운 값을 할당 할 수 없기 때문에 setXXX()메소드가 생성되지 않는다. 
		 */
		//ex.setPname("여진구");
		//ex.setChk(false);
		System.out.printf("%s %d %b\n", ex.getPname(), ex.getPrice(), ex.isChk());
		System.out.println(ex.toString());
		System.out.println(ex.equals(ex));
		
		
	}
}
