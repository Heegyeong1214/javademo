package java010_abstract_interface.answ.part03;

//어류
abstract public class Fish {
	String name;

	public Fish() {

	}

	public Fish(String name) {
		this.name = name;
	}

	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");
	}

}
