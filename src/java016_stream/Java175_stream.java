package java016_stream;

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		//File file = new File("temp");
		File file = new File("parent/child");
		System.out.println(file.isDirectory());
		
		if(!file.isDirectory()) {			
			//file.mkdir(); //생성할 폴더가 1개 일때 => F5누르면 Folder 생성됨
			file.mkdirs(); //생성할 폴더가 1개 이상일때
			System.out.println("Create folder");
		}
		
		
		
	}//end main()

}//end class
