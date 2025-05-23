package java018_collection.part13;

public class Seoul {
	public void showYou() {
		System.out.println("seoul");
	}
}

class Fruit extends Seoul {
	@Override
	public void showYou() {
		System.out.println("fruit");
	}
}

class Apple extends Fruit {
	@Override
	public void showYou() {
		System.out.println("apple");
	}
}

class Orange extends Fruit {
	@Override
	public void showYou() {
		System.out.println("orange");
	}
}