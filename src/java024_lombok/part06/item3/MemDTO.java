package java024_lombok.part06.item3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class MemDTO {
	private String name;
	
	private int age;
	
	//Setter메소드는 생성되지만, Getter메소드는 생성되지 않는다.
	@Getter(AccessLevel.NONE)
	private String loc;	
	
//	public String toString() {
//		return String.format("%s %d %s", name, age, loc);
//	}

}
