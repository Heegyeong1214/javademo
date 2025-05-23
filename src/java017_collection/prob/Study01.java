package java017_collection.prob;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Study01 {

	public static void main(String[] args) throws Exception {
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}

	}// end main()

	private static Vector<Book> makeBookList() throws Exception {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
		
		Vector<Book> vt = new Vector<Book>();
		String path = ".\\src\\java017_collection\\prob\\booklist.txt";
		
		try(Scanner sc = new Scanner(new File(path))){
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split("/");
				vt.add(new Book(line[0],line[1],line[2],line[3]));
			}
		}catch(IOException ex) {
				
		
				System.out.println(ex.toString());
			
			
		}

		return vt;
		
}		
		
	

}// end class
