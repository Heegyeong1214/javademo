package java018_collection.part14;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home();
	}

}

//위랑 비교했을 때 제너릭을 아무것도 설정하지 않았는데 오버라이딩하니까 Objcet로 자동 설정됨
//	public class HomeAgency implements Rentable{
//	
//	@Override
//	public Object rent() {
//		return null;
//	}
//}