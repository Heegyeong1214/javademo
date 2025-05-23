package java002_statements;

public class Java023_switch {

	public static void main(String[] args) {
		String color = "yellow";  //16진수로 표현하는 문제인데, 모르는 거면 그냥 구글링하면 됨
		
		switch (color) {
		case "red" : System.out.println("ff0000"); break; //#redgreenblue(2자리씩)
		case "green" : System.out.println("00ff00"); break;
		case "blue" : System.out.println("0000ff"); break;
		case "white" : System.out.println("ffffff"); break;
		case "black" : System.out.println("000000"); break;
		
		}
	}

}
