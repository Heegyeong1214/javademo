package java024_lombok.part02;

import lombok.extern.slf4j.Slf4j;
 
@Slf4j
public class DataMain {

	public static void main(String[] args) {
	
		MemDTO dto = new MemDTO();
		dto.setNum(1);
		dto.setName("홍길동"); 
		dto.setAge(30);
		dto.setLoc("경기");
		
		System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		//멤버 변수에 있는 값을 리턴해줌
		System.out.println(dto.toString());
		//객체에 대한 정보 리턴
		log.info("mem", dto.toString());
		
//		 MemDTO mem = new MemDTO(2,"여진구", 40, "서울");
//		 System.out.println(mem.toString());
		
	}

}
