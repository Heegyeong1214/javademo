package java024_lombok.part06.item4;

import lombok.Getter;
import lombok.Setter;

/*
 * @Getter
 * boolean타입은 isXXX() 메소드를 생성이 되고
 * Boolean타입은 getXXX()메소들를 생성한다.
 * 
 * @Setter
 * boolean 과 Boolean 타입모두 setXXX( ) 메소드를 생성한다.
 */
@Getter
@Setter
public class GroupDTO {
	private String name;
	private boolean gen; //setGen(boolean gen),  isGen()
	private Boolean chk; //setChk(Boolean chk),  getChk()
	
}
