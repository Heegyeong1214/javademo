package java016_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


//  직렬화(serializable)
//  1. 객체를 연속적인 데이터로 변화하는 것이다.
//     반대로 역직렬화이다.
//  2. 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.
//  3. 객체를 저장하기 위해서는 객체를 직렬화 해야 한다.
//  4. 객체를 저장한다는 것은 객체의 멤버변수의 값을 저장한다는 것이다.
//  5. 객체를 직렬화하여 입출력할 수 있는 스트림
//     ObjectInputStream, ObjectOutputStream
//  6. 직렬화에서 제외할 멤버변수에서는  transient를 선언한다.
// 

public class Java179_stream {

	public static void main(String[] args) throws IOException {
		File file = new File("./src/java016_stream/phone.dat");
		//파일을 먼저 연결함: 직접 객체에 접근할 수 없어서 파일에 먼저 연결함
		//입출력에 관련된 클래스를 스트림이라고 함 
		FileOutputStream fo = null;
		FileInputStream fi = null;

		//파일 연결한 후 데이터 접근할 수 있음
		ObjectOutputStream os = null;
		ObjectInputStream oi = null;

		try {
			fo = new FileOutputStream(file);
			os = new ObjectOutputStream(fo);
			Phone p = new Phone("android", 5000);
			os.writeObject(p);			
			
			String s = new String("java");
			os.writeObject(s);
			
			System.out.println("객체저장");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			os.close();
			fo.close();
		}

	///////////////////////////////////////////////////////////
		fi = new FileInputStream(file);
		oi = new ObjectInputStream(fi);
		
		try {
			Phone phone = (Phone)oi.readObject();
			System.out.println(phone.toString());
			
			String s = (String)oi.readObject();
			System.out.println(s.toString());
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			fi.close();
			oi.close();
		}
		
	}// end main()

}// end class
