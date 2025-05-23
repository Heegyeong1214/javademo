package java016_stream;

import java.io.Serializable;

public class Phone  implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	String name;
	//직렬화에서 제외할 멤버변수에  transient  키워드를 명시한다.
	transient  int price;

	public Phone() {

	}

	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s %d", name, price);
	}

}
