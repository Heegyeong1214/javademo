package java017_collection.part05;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class Java184_Vector {

	public static void main(String[] args) {
			String path = "./src/java017_collection/part05/score.txt";
			Vector<Sawon> vt = lines(path);
			prnDisplay(vt);
		}//end main()
		
	
	
	private static Vector<Sawon> lines(String fileName) {
			// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
			// 리턴하는 프로그램을 구현하시오.
		
		//벡터 설정: 기본적으로 10개가 생성되기는 함
			Vector<Sawon> vt = new Vector<Sawon>();
			
//			Scanner sc = null;
//			try {
//				sc = new Scanner(new File(fileName));
//				
			try(Scanner sc = new Scanner(new File(fileName));){
				//읽어올 라인이 있니?
				//계속 반복하다가 true이면 vt를 리턴하고, false면 close 해야함
				while(sc.hasNextLine()) {
				// System.out.println(sc.nextLine()); 리턴타입이 String
				//break; //한 라인만 보기 위해 일단 break만 진행
					
					//sc.nextLine은 String이고 split으로 : 혹은 /으로 나눌 수 있음
					//그러면 kim 56 78 12로 분리되니까 배열 생산할 수 있으니까 String[] 로 표현
					String[] data =sc.nextLine().split("[:/]"); // 모두 String으로 되어있는 배열임
					Sawon sn = new Sawon(data[0], 
							Integer.parseInt(data[1]),
							Integer.parseInt(data[2]),
							Integer.parseInt(data[3]));  //String을 Int로 바꿔야 하니까? Sawon 클래스의 매개변수 확인
					vt.add(sn); //벡터에 데이터가 저장된 sn의 주소값이 추가함
				
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			//sc.close(); sc를 다시 정의할 때는 close 필요한데, 지금처럼 try를 설정해두었으면 close를 굳이 작성하지 않아도 괜찮다.
			return vt;
		}//end lines()
		
		
		
		private static void prnDisplay(Vector<Sawon> vt) {
			// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
			for(Sawon sn : vt)  	//벡터에 저장되어 있는 Sawon
				System.out.println(sn.toString());
		}//end prnDisplay()
		
	}//end class



