package java024_lombok.part02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@AllArgsConstructor
@ToString
@Getter
@Setter

@NoArgsConstructor //인자 값이 없는 Method -> 	
public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;
	
	//@NoArgsConstructor -> 인자 값이 없는 Method
	// public MemDTO() {}
	
	// @AllArgsConstructor -> 모든 생성자가 있는 Method
	//public MemDTO (int num, String name,int age, String loc) {
	//	this.name = name;
	//	this.num=num;
	//}

}
