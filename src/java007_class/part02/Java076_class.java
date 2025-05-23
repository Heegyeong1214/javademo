package java007_class.part02;

//김병조/외과/39
//이상만/내과/50
//박상기/피부과/20
//오상수/내과/25
//윤달수/피부과/30
//
//[출력결과]
//박상기 피부과 20
//윤달수 피부과 30

public class Java076_class {

	public static void main(String[] args) {
		Doctor[] dt = new Doctor[5];
		dt[0] = new Doctor("김병조", "외과", 39);
		dt[1] = new Doctor("이상만", "내과", 50);
		dt[2] = new Doctor("박상기", "피부과", 20);
		dt[3] = new Doctor("오상수", "내과", 25);
		dt[4] = new Doctor("윤달수", "피부과", 30);

//		System.out.println(dt[0].toString());
//		System.out.println(dt[1].toString());
//		System.out.println(dt[2].toString());
//		System.out.println(dt[3].toString());
//		System.out.println(dt[4].toString());

	//	display(dt);
		search(dt, "신경과");
	}// end main()

	public static void search(Doctor[] dt, String medical) {
		boolean chk = false;
		
		for (int i = 0; i < dt.length; i++) {
			if(dt[i].medical == medical) {
			chk = true;
			System.out.println(dt[i].toString());
		  }
		}
		if(!chk) {
			System.out.printf("%s 진료과목은 없습니다.\n", medical);
		}
		
			
		
		
		
	}//end search()
	
	public static void display(Doctor[] dt) {
		System.out.println(dt[0].toString());
		System.out.println(dt[1].toString());
		System.out.println(dt[2].toString());
		System.out.println(dt[3].toString());
		System.out.println(dt[4].toString());

		for (int i = 0; i < dt.length; i++) {
			System.out.println(dt[i].toString());
		}
	}// end display

}// end class
