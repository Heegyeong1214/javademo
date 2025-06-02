package java024_lombok.part06.item2;

import lombok.Getter;
import lombok.Setter;

/*
* 1. 클래스에 @Getter, @Setter을 붙이면 비정적 멤버변수에 해당하는 getter(), setter()메소드가 만들어진다.
*     static 멤버변수는 getter(), setter()을 생성하지 않는다.
*/
@Getter
@Setter
public class HumanDTO {
	private String name;
	private static int age;
}
