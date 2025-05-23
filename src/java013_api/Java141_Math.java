package java013_api;

//난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
//ex) 0.5689....   =>5.7
//
import static java.lang.Math.*;

public class Java141_Math {

	public static void main(String[] args) {
		double nan = random();
		System.out.println(nan);
		
		//소숫점을 뒤로 2개 이동하기 위해 100을 곱함
		nan = nan * 100;
		System.out.println(nan);
		
		//double을 round로 반올림하면 long이 됨
		//round(): 반올림해주는 메소드
		long data = round(nan);
		System.out.println(data);
		
		//소수점을 앞으로 한칸 이동하기 위해 10으로 나눔
		
		double val = (double)data/10;  //double로 강제 변환 안하면 그냥 소수첫재자리가 0
		System.out.println(val);
		
		System.out.println((double)round(random()*100)/10);
	}// end main()

}// end class

