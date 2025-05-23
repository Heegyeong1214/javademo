package java009_inheritance.part09;

/* 
[출력결과]
삼성          SHV-E250S     200000
삼성          SHV-E160S     180000
아이폰        A1586 	      250000
아이폰        A1524 	      220000
LG         LG-F700L 	  190000
LG         LG-F650L 	  180000
***************************************************
삼성         SHV-E250S     200000   010-2534-2532    SK
아이폰        A1586         250000   010-2532-5902    LG
LG          LG-F650L      180000   010-7280-5283     KT
아이폰        A1524         220000   010-2259-3052     LG
*/
public class Java101_inheritance {

	public static void main(String[] args) {
		HandPhone[] handPhone = new HandPhone[6];
		handPhone[0] = new HandPhone("삼성", "SHV-E250S", 200000);
		handPhone[1] = new HandPhone("삼성", "SHV-E160S", 180000);
		handPhone[2] = new HandPhone("아이폰", "A1586", 250000);
		handPhone[3] = new HandPhone("아이폰", "A1524", 220000);
		handPhone[4] = new HandPhone("LG", "LG-F700L", 190000);
		handPhone[5] = new HandPhone("LG", "LG-F650L", 180000);

//		for (int i = 0; i < handPhone.length; i++)
//			System.out.println(handPhone[i].toString());

		for (HandPhone hPhone : handPhone)
			System.out.println(hPhone.toString());

		System.out.println("***************************************************");
		SmartPhone[] smartPhone = new SmartPhone[4];
		smartPhone[0] = new SmartPhone("삼성", "SHV-E250S", 200000, "010-2534-2532", "SK");
		smartPhone[1] = new SmartPhone("아이폰", "A1586", 250000, "010-2532-5902", "LG");
		smartPhone[2] = new SmartPhone("LG", "LG-F650L", 180000, "010-7280-5283", "KT");
		smartPhone[3] = new SmartPhone("아이폰", "A1524", 220000, "010-2259-3052", "LG");
		
//		for(int i = 0 ; i<smartPhone.length ;i++)
//			System.out.println(smartPhone[i].toString());
		
		for (SmartPhone sPhone : smartPhone)
			System.out.println(sPhone.toString());
	}// end main()

}// end class
