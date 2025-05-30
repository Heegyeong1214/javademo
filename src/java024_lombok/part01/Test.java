package java024_lombok.part01;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemDTO dto = new MemDTO();
		dto.setNum(1);
		dto.setName("홍길동");
		dto.setAge(20);
		dto.setLoc("서울");			
		
		System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		System.out.println(dto.toString());   
		
		MemDTO mto = new MemDTO(1, "홍길동", 20, "서울");
		System.out.println(dto.equals(mto)); //false		
		System.out.println(mto.hashCode());

	}

}
