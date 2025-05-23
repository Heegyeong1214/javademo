package java016_stream;

import java.io.IOException;
import java.io.InputStream;

/*enter를 치면
 * 
 * carriage return : 줄의 처음으로 이동(13)
 * line feed : 다음 줄로 이동(10)
 */

public class Java168_stream {

	public static void main(String[] args) {
		System.out.print("데이터 입력:");
		
		InputStream is = System.in;
		int data;
		
		try {
//			data = is.read();			//is.read()는 한 바이트만 읽음
//			System.out.println(data);  //97
//			data = is.read();
//			System.out.println(data);  //13
//			data = is.read();
//			System.out.println(data);  //10
			
			while((data = is.read()) != 13) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}//end main()

}//end class
