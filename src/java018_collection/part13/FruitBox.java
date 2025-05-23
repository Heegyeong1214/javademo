package java018_collection.part13;

public class FruitBox<T>{
	private T item;
	
	public FruitBox() {
	
	}

	public void store(T item) {
		this.item= item;
	}
	
	public T pullout() {
		return item;
	}
}
