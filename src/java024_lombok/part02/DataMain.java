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
		//System.out.println(dto.toString());	
		log.info("mem", dto);
		
		 MemDTO mem = new MemDTO(2,"여진구", 40, "서울");
		 System.out.println(mem.toString());
		
	}

}
