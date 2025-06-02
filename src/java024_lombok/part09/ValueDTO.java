package java024_lombok.part09;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Value;


/*
 * @Value는 @Data를 변형한 어노테이션이다.
 * @Value은 @Setter, @NoArgsConstructor, @RequiredArgsConstructor 은 생성을 하지 않는다.
 * @Value은 default로 모든 멤버변수에 private final을 붙여준다.
 */

//@EqualsAndHashCode
//@Setter
//@Getter
//@NoArgsConstructor(force=true)
//@AllArgsConstructor
//@RequiredArgsConstructor
@Value
public class ValueDTO {
	private static String code;
	@NonNull
	private String pname;
	private final int price;	
	private boolean chk;	
}
