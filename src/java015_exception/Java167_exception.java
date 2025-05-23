package java015_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//   1.리소스(resource)란 데이터를 제공하는 객체이다.
//  2.리소스는 사용하기 위해 열어야(open)하며, 사용이 끝난 다음에는 닫아야(close) 한다.
//  3.리소스를 사용하다가 예외가 발생될 경우에도 안전하게 닫는 것이 중요하다. 그렇지 않으면 리소스가 불안정한 상태로 남아있게 된다.
//  4.try ~ with ~ resources 블록을 사용하면 예외 발생 여부와 상관없이 리소스를 자동으로 닫아준다.
//  5.try괄호에 리소스를 여는 코드를 작성하면 try블록이 정상적으로 실행을 완료했거나 도중에 예외가 발생하면 자동으로 리소스의 close()메소드가 호출된다.
//  6.try ~ with ~ resources 블록을 사용하기 위해서는 java.lang.AutoCloseable 인터페이스를 구현해서
//    AutoCloseable 인터페이스의 close()메소드를 재정의 해야 한다.
//    public class FileInputStream implements AutoCloseable{} 
//  7.Java8이전 버전은 try 괄호 안에서 리소스 변수를 반드시 선언해야 했지만, Java9이후부터는 외부 리소스 변수를 사용할 수 있다.
//     FileInputStream fis1 = new FileInputStream("file1.txt");
//     FileInputStream fis2 = new FileInputStream("file2.txt");
//     try(fis1; fis2){
//     ..
//     catch(IOException ex){   }
 
public class Java167_exception {

	public static void main(String[] args) {
		String line = null;
		
		//readLine()은 파일의 끝이면 null을 리턴하고
		//read()은 파일의 끝이면 -1을 리턴한다.
		
		try(FileReader fr = new FileReader("sample.txt");
				BufferedReader br = new BufferedReader(fr);){
			while((line = br.readLine()) != null) {
				System.out.println(line);			//원래 close 했어야 했는데, 굳이 close 안해도 되는 이유...?
			}
		}catch(IOException ex) {
			System.out.println(ex.toString());
			
		}
	}

}
