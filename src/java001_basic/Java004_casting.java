package java001_basic;

public class Java004_casting {

	public static void main(String[] args) {
		byte bNum = 127;   // -128 ~ 127, bNUM: 헝가리안  -> 127까지는 byte로 인식해서 오류가 안나는데 127이 넘어가면 int로 인식해서 오류가 남
		short sNum =32767; // -32758 ~ 32767
		int iNum = 127;    // -2147483648 ~ 2147483647  -> 숫자 입력할 때는 쉼표 제거해야 함
		long lNum = 6;     //자동형변환 6은 int(정수)인데, long(실수)에 해당되서 더 넓은 범위로 자동 변환됨
		long tNum = 6L;    // L or 1 //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F;
		double dNum = 4.5;
		char cData = 'a';

		
		System.out.println("bNum=" + bNum);
		System.out.println("sNum=" + sNum);
		System.out.println("int=" + iNum);
		System.out.println("lNum=" + lNum);
		System.out.println("tNum=" + tNum);
		System.out.println("fNum=" + fNum);
		System.out.println("dNum=" + dNum );
		System.out.println("cData=" + cData);
		
		

		//형변환(casting)
				// 1. 묵시적(자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
				// 2. 명시적(강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생

		float xNum = (float) 2.6; //강제 형변환 double => float
		System.out.println("xNum=" + xNum);
		
		int kNum = 128;
		//데이터 손실이 발생되는 경우 -> byte는 128은 넣을 수 없는데 결과갑슨 -128로 데이터가 잘못 출력됨
		byte data= (byte)kNum; // -128 ~ 127
		System.out.println("data="+data);
	}

}
