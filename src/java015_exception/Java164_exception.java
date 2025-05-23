package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java164_exception {

	public static void main(String[] args) /*throws FileNotFoundException */{
//		file에 대한 정보를 확인하고 싶을 때 사용. 파일 안에 있는 내용을 보는 게 아님
		File file = new File("Sample.txt"); 
		System.out.println(file);
		
//		file 안에 있는 정보를 보고 싶을 때
		FileReader fr = null;
		
		try {
			fr = new FileReader(file); //throws가 선언되어 있음 => 호출할 때 예외 처리 해줘야 됨
										//오류가 뜨면 마우스로 확인해서 surround 어쩌고 있으면 thorws가 있다는 의미이기 때문에 예외처리 해주면 됨
			// FileNotFoundException은 checked exception이다. => 반드시 예외 처리 해줘야 함
			// 반드시 try~catch~finally(예외처리)를 한다.
			
			System.out.println((char)fr.read());
			
		
		}catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
