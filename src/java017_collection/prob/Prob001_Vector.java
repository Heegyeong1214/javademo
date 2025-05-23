package java017_collection.prob;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/*
 * [문제] : booklist.txt 파일의 데이터를 이용하여 
 *      책 정보 하나당 하나의 Book 객체를 생성하고 생성된 Book 객체들을 
 *      Vector에 담아서 리턴하는 makeBookList() 메서드를 구현하시오.
 *      
 * [실행결과]
 * Java Programming 의 가격 : 25000
 * SQL Fundamentals 의 가격 : 47000
 * JDBC Programming 의 가격 : 30000
 * Servlet Programming 의 가격 : 20000
 * JSP Programming 의 가격 : 21000
 */
public class Prob001_Vector {

	public static void main(String[] args) throws Exception {
		
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}

	}// end main()

	// try, catch로 예외처리를 했으면 throws를 안해도 됨
	private static Vector<Book> makeBookList() throws Exception {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
		Vector<Book> vt = new Vector<Book>(); //벡터 생성
		String path = ".\\src\\java017_collection\\prob\\booklist.txt";
		//-> 파일이라서 스캐너를 이용해서 데이터 불러옴
		//스캐너에는 throws가 있어서 반드시 예외 처리 해줘야 함 (try, catch)
		
		//파일하고 스캐너 연결 됨
		try(Scanner sc = new Scanner(new File(path))) {
			while(sc.hasNextLine()) {	
			String[] line = sc.nextLine().split("/"); //nextLine(): 하나의 라인을 읽어줌
			
			//생성한 Book 벡터에 데이터 넣어 줌. add
			vt.add(new Book(line[0], line[1], line[2], line[3]));
			}
		}catch(IOException ex) { //예상하지 못한 예외가 생길 수 있으니까
		 System.out.println(ex.toString());
		}
	//	sc.close(); try, catch가 없으면 close 무조건 넣어줘야 하는데 try, catch 있으면 굳이 안해줘도 된다. 메모리를 안전하게 반납하기 위해 필요함
		return vt; //무조건 1개로만 넘겨줄 수 있어서 collection 중 벡터에 담아서 넘겨주는 것 (new Book에 대한 내용이 5개나 있음)
	}// end makeBookList()
	
//	Vector<Book> vt = new Vector<Book>();
//	String path = ".\\src\\java017_collection\\prob\\booklist.txt";
//	
//     try(Scanner sc = new Scanner(new File(path));){
//	     while(sc.hasNextLine()) {
//		    String line1 = sc.nextLine();
//		   // System.out.println(line1);
//		    String[] it1 = line1.split("/");
//		   // System.out.printf("%s %s %s %s\n", it1[0], it1[1], it1[2], it1[3]);
//		    Book bk1 = new Book(it1[0], it1[1],it1[2], it1[3]);
//		    vt.add(bk1);
//	     }
//     }catch(IOException ex) {
//    	 System.out.println(ex.toString());
//     }
//  
//	return vt;
//}// end makeBookList()
}// end class
















