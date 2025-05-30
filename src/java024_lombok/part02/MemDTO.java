package java024_lombok.part02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
//@AllArgsConstructor
//@ToString
//@Getter
//@Setter
//
//@NoArgsConstructor
public class MemDTO {
	private int num;
	private String name;
	private int age;
	private String loc;

}
