package java024_lombok.part08.item1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Product {
	private static String code;
	private String pname;
	private final int price;
	private boolean chk;

}
