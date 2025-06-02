package java024_lombok.part08.item3;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor //final 혹은 @NonNull인 변수만 parameter로 받는 생성자를 생성해준다.
@AllArgsConstructor
public class Product {
	private static String code;
	@NonNull
	private String pname;
	private final int price;
	private boolean chk;
}
