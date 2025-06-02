package java024_lombok.part08.item2;


import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

//@NoArgsConstructor(force = true) 옵션을 이용해서 final 필드를 0, false, null 등으로 초기화를 강제로 시켜서 
//생성자를 만들 수 있습니다. (@NonNull같은 제약조건은 무시됩니다.)

@ToString
@NoArgsConstructor(force=true)
public class Product {
	private static String code;
	@NonNull	
	private String pname;
	private final int price;
	private boolean chk;
}
