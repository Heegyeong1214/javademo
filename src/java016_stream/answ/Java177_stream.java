package java016_stream.answ;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java177_stream {

	public static void main(String[] args) {

		/*
		 * AutoCloseable을 상속받은 클래스는 try~with~resource으로 처리 가능 AutoCloseable은 자동으로
		 * close() 기능을 제공함
		 */

		try (FileWriter fw = new FileWriter("src/java016_stream/display.txt")) {
			fw.write("java\n");
			fw.write("jsp\n");
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}

		/////////////////////////////////////////////////////////////////
		try (FileReader fr = new FileReader("src/java016_stream/display.txt");
			BufferedReader br = new BufferedReader(fr)) {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println(ex.toString());
		}

	}// end main()

}// end class
