package java018_collection.part10;


public class Average <T extends Number> {

	private T[] list;
	
	public Average() {
		// TODO Auto-generated constructor stub
	}
	
	public Average(T[] list) {
		this.list = list;
		
	}
	
	public double findAverage() {
		double sum = 0.0;
		for (T data : list)
			sum += data.doubleValue();
		return sum / list.length; //List가 배열이니까 사이즈 확인하려면 length
	}
}
