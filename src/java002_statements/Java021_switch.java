package java002_statements;

//  switch(식){
//   case 값1 : 수행할 문장; break;
//   case 값2 : 수행할 문장; break;
//   case 값3 : 수행할 문장; break;
//   default : 수행할 문장;
//  }
// 
//  식의 결과 타입 : byte, short, char, int, enum(jdk7), String(jdk7)
//  switch~case에서 break을 만나면 현재 수행중인 제어문을 완전히 빠져나옴
//

public class Java021_switch {

	public static void main(String[] args) {
		int jumsu = 100;
		
		//90이상 :A, 90미만~80이상 : B, 80미만~70이상: C, 70미만 ~ 60이상: D, 60미만 : F
		switch(jumsu / 10) {
		case 10: 
		case 9: System.out.printf("점수가 %d이므로 학점은 %c입니다.\n", jumsu, 'A'); break;
		case 8: System.out.printf("점수가 %d이므로 학점은 %c입니다.\n", jumsu, 'B'); break;
		case 7: System.out.printf("점수가 %d이므로 학점은 %c입니다.\n", jumsu, 'C'); break;
		case 6: System.out.printf("점수가 %d이므로 학점은 %c입니다.\n", jumsu, 'D'); break;
		default : System.out.printf("점수가 %d이므로 학점은 %c입니다.\n", jumsu, 'F');break;
		}

	}// end main

}// end class
