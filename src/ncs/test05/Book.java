package ncs.test05;

public class Book {
	String title;
	String author;
	int price;
	String publishment;
	double discountRate;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishment = publishment;
		this.discountRate = discountRate;
	}
	
	public String gettitle() {
		return title;
	
	}
	
	public String getauthor() {
		return author;
	}
	
	public int getprice() {
		return price;
	}
	
	public String getpublishment() {
		return publishment;
	}
	
	public double getdisconutRate() {
		return discountRate;
	}
	
}
// end class
