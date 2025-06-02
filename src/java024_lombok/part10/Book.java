package java024_lombok.part10;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Book {
	private String code;
	private String title;
}
