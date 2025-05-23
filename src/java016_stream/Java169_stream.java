package java016_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java169_stream {

	public static void main(String[] args) {

		// 바이트 스트림
		InputStream is = System.in;
		// 바이트스트림과 문자스트림 연결
		InputStreamReader ir = new InputStreamReader(is);
		// 문자스트림
		BufferedReader br = new BufferedReader(ir);

		System.out.print("데이터 입력: ");
		int data;

		try {
			data = br.read();
			System.out.println((char)data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}// end main()

}// end class
