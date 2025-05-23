package java016_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Java174_stream {

	public static void main(String[] args) {
		File file = new File("song.txt");
		System.out.println(file.isFile());
		
		RandomAccessFile raf=null;		
		String stn = new String("Maron 5 - Daylight, Sunday Moring\r\n");
		
		try {
			raf = new RandomAccessFile(file, "rw");			
			System.out.println(raf.getFilePointer());  //0
			//song.txt파일의 총 길이를 리턴한다.
			long size =raf.length();
			System.out.println(size);
			System.out.println(raf.getFilePointer());  //0
			
			raf.seek(size);
			System.out.println(raf.getFilePointer()); //141
			
			//파일 대상에 데이터를 보낼때 flush()을 실행하지 않아도 된다.
			//raf.writeUTF(stn);
			raf.writeBytes(stn);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}// end main()

}// end class
