package java013_api;

public class Java135_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sn = new StringBuffer("java test");
		display(sn.toString().toCharArray());
		
		
	}

	

	public static void display(char[] data) {
		for(char cn:data)
			System.out.println(cn);
	}
}
