package java012_api.part04;

public class Java118_Object_clone {

	public static void main(String[] args) {

		// House는 house라고 이름을 정의해줘서 접근할 수 있지만 Address는 다른 이름을 부여하지 않아서 Address에 직접 접근할 수
		// 없어서 house를 통해서 address호출 할 수 있음
		House house = new House("홍길동", 30, new Address("서울", "서초동"));
		System.out.printf("%s %d %s %s\n", house.name, house.age, house.address.city, house.address.dong);

		// shallow copy(얇은 복사) ;  주소가 복사된 것 -> address에 영향이 가서 값이 달라짐
		House house2 = house;
		System.out.println(house);
		System.out.println(house2);
		house2.name="김영희";
		house2.address.city = "경기";
		System.out.printf("%s %d %s %s\n", house.name, house.age, house.address.city, house.address.dong);

		//clone()은 서로 영향이 가지 않도록 Deep Copy를 할 때 사용함
		//기존에 있는 메모리를 다른 곳에다가 그대로 적용하기 위함 
//		House houseCopy=house.shallowCopy();
		House houseCopy = house.deepCopy();
		System.out.println(house);
		System.out.println(houseCopy);
		houseCopy.name = "Steven";
		houseCopy.address.city = "제주";
		System.out.printf("%s %d %s %s\n", house.name, house.age, house.address.city, house.address.dong);
		System.out.printf("%s %d %s %s\n", houseCopy.name, houseCopy.age, houseCopy.address.city, houseCopy.address.dong);
	} // end main()

}// end class
